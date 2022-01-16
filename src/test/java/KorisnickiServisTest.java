import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

public class KorisnickiServisTest extends BaseTest{
    /**
     * Testiranje odeljka u footeru Korisnicki servis
     *
     * Test steps:
     * 1. Navigiraj na bebakids.com
     * 2. U footer delu ekrana izaberi opciju Uslovi koriscenja i verifikuj naslov stranice
     * 3. U footer delu ekrana odaberi opciju Pravo na odustajanje  i verifikuj naslov stranice
     * 4. U footer delu ekrana odaberi opciju Isporuka i verifikuj naslov stranice
     * 5. U footer delu ekrana odaberi opciju Reklamacije i verifikuj naslov stranice
     * 6. U footer delu ekrana odaberi opciju Povracaj sredstava i verifikuj naslov stranice
     * 7. U footer delu ekrana odaberi opciju Nacini placanja i verifikuj naslov stranice
     * 8. U footer delu ekrana odaberi opciju Uputstvo za registraciju i verifikuj naslov stranice
     *
     * Expected result:
     * 2. Verifikuj da si na https://www.bebakids.com/uslovi-koriscenja
     * 3. Verifikuj da si na https://www.bebakids.com/pravo-na-odustajanje
     * 4. Verifikuj da si na https://www.bebakids.com/isporuka
     * 5. Verifikuj da si na https://www.bebakids.com/reklamacije
     * 6. Verifikuj da si na https://www.bebakids.com/povracaj-robe
     * 7. Verifikuj da si na https://www.bebakids.com/nacini-placanja
     * 8. Verifikuj da si na https://www.bebakids.com/uputstvo-za-registraciju
     *
     *
     **/

    @Test
    public void korisnickiServisTest(){
        driver = openChromeDriver ();
        try {
            print ( "1.Navigiraj na bebakids.com" );
            BasePage basePage = new BasePage (driver);

            print ( "2.U footer delu ekrana izaberi opciju Uslovi koriscenja i verifikuj naslov stranice" );
            basePage.clickUsloviKoriscenja ();

            print ( "2.Verifikuj da si na https://www.bebakids.com/uslovi-koriscenja" );
            assert isCurrentUrlEqualsTo ( "https://www.bebakids.com/uslovi-koriscenja"):"Error. " +
                    "Trebalo bi da si na stranici https://www.bebakids.com/uslovi-koriscenja.";

            print ( "3.U footer delu ekrana odaberi opciju Pravo na odustajanje  i verifikuj naslov stranice" );
            basePage.clickPravoNaOdustajanje ();

            print ( "3.Verifikuj da si na https://www.bebakids.com/pravo-na-odustajanje" );
            assert isCurrentUrlEqualsTo ( "https://www.bebakids.com/pravo-na-odustajanje" ):"Error. " +
                    "Trebalo bi da si na stranici https://www.bebakids.com/pravo-na-odustajanje.";

            print ( "4.U footer delu ekrana odaberi opciju Isporuka" );
            basePage.clickIsporuka ();

            print ( "4.Verifikuj da si na https://www.bebakids.com/isporuka" );
            assert isCurrentUrlEqualsTo ( "https://www.bebakids.com/isporuka" ):"Error. " +
                    "Trebalo bi da si na stranici https://www.bebakids.com/isporuka.";

            print ( "5.U footer delu ekrana odaberi opciju Reklamacije i verifikuj naslov stranice" );
            basePage.clickReklamacije ();

            print ( "5.Verifikuj da si na https://www.bebakids.com/reklamacije" );
            assert isCurrentUrlEqualsTo ( "https://www.bebakids.com/reklamacije" ):"Error. " +
                    "Trebalo bi da si na stranici https://www.bebakids.com/reklamacije.";

            print ( "6.U footer delu ekrana odaberi opciju Povracaj sredstava i verifikuj naslov stranice" );
            basePage.clickPovracajSredstava ();
            print ( "6.Verifikuj da si na https://www.bebakids.com/povracaj-robe" );
            assert isCurrentUrlEqualsTo ( "https://www.bebakids.com/povracaj-robe" ):"Error. " +
                    "Trebalo bi da si na stranici https://www.bebakids.com/povracaj-robe.";

            print ( "7.U footer delu ekrana odaberi opciju Nacini placanja i verifikuj naslov stranice" );
            basePage.clickNaciniPlacanja ();

            print ( "7. Verifikuj da si na https://www.bebakids.com/nacini-placanja" );
            assert isCurrentUrlEqualsTo ( "https://www.bebakids.com/nacini-placanja" ):"Error." +
                    "Trebalo bi da si na https://www.bebakids.com/nacini-placanja.";

            print ( "8.U footer delu ekrana odaberi opciju Uputstvo za registraciju i verifikuj naslov stranice" );
            basePage.clickUputstvoZaRegistraciju ();

            print ( "8.Verifikuj da si na https://www.bebakids.com/uputstvo-za-registraciju" );
            assert isCurrentUrlEqualsTo ( "https://www.bebakids.com/uputstvo-za-registraciju" ):"Error." +
                    "Trebalo bi da si na https://www.bebakids.com/uputstvo-za-registraciju.";
            driver.close ();










        }finally {
            driver.quit ();
        }
    }
}
