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
            assert isCurrentUrlEqualsTo ( Strings.USLOVI_KORISCENJA):"Error. " +
                    "Trebalo bi da si na stranici " + Strings.USLOVI_KORISCENJA;

            print ( "3.U footer delu ekrana odaberi opciju Pravo na odustajanje  i verifikuj naslov stranice" );
            basePage.clickPravoNaOdustajanje ();

            print ( "3.Verifikuj da si na https://www.bebakids.com/pravo-na-odustajanje" );
            assert isCurrentUrlEqualsTo ( Strings.PRAVO_NA_ODUSTAJANJE):"Error. " +
                    "Trebalo bi da si na stranici " + Strings.PRAVO_NA_ODUSTAJANJE;

            print ( "4.U footer delu ekrana odaberi opciju Isporuka" );
            basePage.clickIsporuka ();

            print ( "4.Verifikuj da si na https://www.bebakids.com/isporuka" );
            assert isCurrentUrlEqualsTo ( Strings.ISPORUKA ):"Error. " +
                    "Trebalo bi da si na stranici " + Strings.ISPORUKA;

            print ( "5.U footer delu ekrana odaberi opciju Reklamacije i verifikuj naslov stranice" );
            basePage.clickReklamacije ();

            print ( "5.Verifikuj da si na https://www.bebakids.com/reklamacije" );
            assert isCurrentUrlEqualsTo ( Strings.REKLAMACIJE ):"Error. " +
                    "Trebalo bi da si na stranici " + Strings.REKLAMACIJE;

            print ( "6.U footer delu ekrana odaberi opciju Povracaj sredstava i verifikuj naslov stranice" );
            basePage.clickPovracajSredstava ();
            print ( "6.Verifikuj da si na https://www.bebakids.com/povracaj-robe" );
            assert isCurrentUrlEqualsTo ( Strings.POVRACAJ_ROBE ):"Error. " +
                    "Trebalo bi da si na stranici " + Strings.POVRACAJ_ROBE;

            print ( "7.U footer delu ekrana odaberi opciju Nacini placanja i verifikuj naslov stranice" );
            basePage.clickNaciniPlacanja ();

            print ( "7. Verifikuj da si na https://www.bebakids.com/nacini-placanja" );
            assert isCurrentUrlEqualsTo ( Strings.NACINI_PLACANJA ):"Error." +
                    "Trebalo bi da si na " + Strings.NACINI_PLACANJA;

            print ( "8.U footer delu ekrana odaberi opciju Uputstvo za registraciju i verifikuj naslov stranice" );
            basePage.clickUputstvoZaRegistraciju ();

            print ( "8.Verifikuj da si na https://www.bebakids.com/uputstvo-za-registraciju" );
            assert isCurrentUrlEqualsTo ( Strings.UPUTSTVO_ZA_REGISTRACIJU ):"Error." +
                    "Trebalo bi da si na " + Strings.UPUTSTVO_ZA_REGISTRACIJU;











        }finally {
            driver.quit ();
        }
    }
}
