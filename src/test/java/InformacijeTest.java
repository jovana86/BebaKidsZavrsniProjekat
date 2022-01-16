import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class InformacijeTest extends BaseTest{
    /**
     * Testiranje odeljka u footeru Informacije
     *
     * Test steps:
     * 1. Navigiraj na bebakids.com
     * 2. U footer delu ekrana izaberi opciju O nama i verifikuj naslov stranice
     * 3. U footer delu ekrana odaberi opciju Autorska prava  i verifikuj naslov stranice
     * 4. U footer delu ekrana odaberi opciju Politika privatnosti i verifikuj naslov stranice
     * 5. U footer delu ekrana odaberi opciju Kontakt i verifikuj naslov stranice
     *
     * Expected result:
     * 2. Verifikuj da si na https://www.bebakids.com/o-nama
     * 3. Verifikuj da si na https://www.bebakids.com/autorska-prava
     * 4. Verifikuj da si na https://www.bebakids.com/politika-privatnosti
     * 5. Verifikuj da si na https://www.bebakids.com/kontakt
     *
     *
     **/

    @Test
    public void OdeljakInformacijeTest(){
        driver = openChromeDriver ();
        try {
            print ( "1.Navigiraj na bebakids.com" );
            BasePage basePage = new BasePage (driver);

            print ( "2.U footer delu ekrana izaberi opciju O nama i verifikuj naslov stranice" );
            basePage.clickONama ();

            print ( "2.Verifikuj da si na https://www.bebakids.com/o-nama" );
            assert isCurrentUrlEqualsTo ( Strings.O_NAMA ):"Error. " +
                    "Trebalo bi da si na stranici" + Strings.O_NAMA;

            print ( "3.U footer delu ekrana odaberi opciju Autorska prava  i verifikuj naslov stranice" );
            basePage.clickAutorskaPrava ();

            print ( "3.3. Verifikuj da si na https://www.bebakids.com/autorska-prava" );
            assert isCurrentUrlEqualsTo ( Strings.AUTORSKA_PRAVA ):"Error. " +
                    "Trebalo bi da si na stranici " + Strings.AUTORSKA_PRAVA;

            print ( "4.U footer delu ekrana odaberi opciju Politika privatnosti i verifikuj naslov stranice" );
            basePage.clickPolitikaPrivatnosti ();

            print ( "4.Verifikuj da si na https://www.bebakids.com/politika-privatnosti" );
            assert isCurrentUrlEqualsTo ( Strings.POLITIKA_PRIVATNOSTI ):"Error. " +
                    "Trebalo bi da si na stranici " + Strings.POLITIKA_PRIVATNOSTI;

            print ( "5.U footer delu ekrana odaberi opciju Kontakt i verifikuj naslov stranice" );
            basePage.clickKontakt ();

            print ( "5.Verifikuj da si na https://www.bebakids.com/kontakt" );
            assert isCurrentUrlEqualsTo ( Strings.KONTAKT):"Error." +
                    "Trebalo bi da si na stranici " + Strings.KONTAKT;

        }finally {
            driver.quit ();
        }
    }
}
