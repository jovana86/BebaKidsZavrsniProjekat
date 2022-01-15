import org.testng.annotations.Test;

public class ZaposlenjeTest extends BaseTest{
    /**
     * Popuni formular zaposlenje test
     *
     * Test steps:
     * 1. Navigate to bebakids.com
     * 2. U footer delu odaberi opciju Zaposlenje
     * 3. U novom tabu otvorice se formular koji popunjavamo validnim podacima za:
     * - Grad
     * - Zeljena pozicija
     * - Ime
     * - Prezime
     * - Telefon
     * - Email adresa
     * - Datum rodjenja
     * - Zavrsena skola
     * - Pol
     * - Zasto zelite da se zaposlite u nasoj firmi?
     * 4. U delu slika i CV uploadovati zeljenu sliku i biografiju
     * 5. Klikni dugme Prijavi se
     *
     * Expected result:
     * 3. Verifikuj je otvoren novi tab Zaposlenje ciji je URL https://www.bebakids.com/zaposlenje
     * 5. Verifikuj poruku u anti spam pitanju
     *
     *      **/
    @Test
    public void popuniFormularZaposlenjeTest(){
        driver = openChromeDriver ();

        try {
            print ( "1.Navigiraj na bebakids.com" );
            ZaposlenjePage zaposlenjePage = new ZaposlenjePage ( driver );

            print ( "2.U footer delu klikni Zaposlenje" );
            zaposlenjePage.clickZaposlenje ();

            print ( "3.Verifikuj da je otvoren novi tab ciji je URL https://www.bebakids.com/zaposlenje" );
            assert isCurrentUrlEqualsTo ( "https://www.bebakids.com/zaposlenje" ):"Error. Pogresan URL. Nisi na https://www.bebakids.com/zaposlenje.";

            print ( "3.Unesi podatke Grad zaposlenja,ime,prezime,telefon,Email,datum rodjenja,iz padajuceg menija odaberi" +
                    "opcije za poziciju zaposlenja i zavrsenu skolu,oznaci pol Zenski i unesi razlog apliciranja za posao" );
            zaposlenjePage.unesiGradZaposlenja ();
            zaposlenjePage.pozicijaZaposlenja ();
            zaposlenjePage.unesiIme ();
            zaposlenjePage.unesiPrezime ();
            zaposlenjePage.unesiTelefon ();
            zaposlenjePage.unesiEmail ();
            zaposlenjePage.unesiDatumRodjenja ();
            zaposlenjePage.izaberiZavrsenuSkolu ();
            zaposlenjePage.oznaciPolZenski ();
            zaposlenjePage.unesiZastoZelisDaRadisUNasojFirmi ();

            print ( "4.Uradi upload slike i radne biografije" );
            zaposlenjePage.clickZaposlenjeSlika ();
            zaposlenjePage.clickZaposlenjeCV ();

            print ( "5.Klikni Prijavi se i proveri da li se pojavila error poruka u delu anti spam" );
            zaposlenjePage.clickZaposlenjePrijaviSe ();
            zaposlenjePage.proveriErrorPoruku ();




        }finally {
            // driver.quit ();
        }

    }
}
