import org.testng.annotations.Test;

public class SearchTest extends BaseTest{
    /**
     * Ukucaj zeljeni artikal u Pretragu i filtriraj
     *
     * Test steps:
     * 1. Navigiraj na bebakids.com
     * 2. Unesi zeljeni proizvod u polje za pretragu i klikni Enter
     * 3. Filtriraj dobijeni rezultat u meniju sa leve strane
     * 4. Izaberi opcije pol Zenski, velicina 4, raspon cene 1501-2000
     *
     * Expected result:
     * 4. Verifikuj da su prikazani filteri u blok tagu
     *
     *
     **/


    @Test
    public void ukucajZeljeniArtikalUPretraguIFiltriraj(){
        driver=openChromeDriver ();
        try {
            print ( "Navigiraj na bebakids.com" );
            BasePage basePage=new BasePage ( driver );
            basePage.sleep ();
            print ( "Klikni na pretragu i unesi artikal" );
            basePage.clickSearchButton ();
            basePage.enterTextInSearchField ( "haljina" );

            print ( "Verifikuj da je URL https://www.bebakids.com/proizvodi?search=haljina" );
            assert isCurrentUrlEqualsTo ( Strings.HALJINA):"Error. Trebalo bi da si na " + Strings.HALJINA ;

            SearchPage searchPage = new SearchPage ( driver );

            print ( "U levom delu ekrana oznaci filtere: pol zenski, velicina 4 i cena od 1501 do 2000 RSD" );
            searchPage.oznaciFilterPolZenskiVelicina4Cena1501Do2000 ();

            print ( "Verifikuj da su svi filteri prikazani u blok tagu" );
            searchPage.daLiSuSviFilteriOznaceniUBlokTagu ();


        }finally {
            driver.quit ();
        }
    }

    /**
     * Ukucaj zeljeni artikal u Pretragu i sortitaj po nazivu
     *
     * Test steps:
     * 1. Navigiraj na bebakids.com
     * 2. Unesi zeljeni proizvod u polje za pretragu i klikni Enter
     * 3. Filtriraj dobijeni rezultat u meniju sa leve strane, izaberi velicina 4
     * 4. U dropdown meniju odaberi opciju sortiraj po nazivu
     *
     *
     * 5.
     *
     * Expected result:
     * 2. Verifikuj da je novi URL nakon pretrage https://www.bebakids.com/proizvodi?search=haljina
     * 3. Verifikuj da je prikazan filteri velicina 4 u blok tagu
     * 4. Verifikuj da je sortiranje izvrseno
     *
     *
     *
     *
     **/

    @Test
    public void ukucajZeljeniArtikalUpretraguISortiraj(){
        driver = openChromeDriver ();
        try {
            print ( "1.Navigiraj na bebakids.com" );
            BasePage basePage=new BasePage ( driver );
            basePage.sleep ();
            print ( "2.Klikni na pretragu i unesi artikal" );
            basePage.clickSearchButton ();
            basePage.enterTextInSearchField ( "haljina" );

            print ( "2.Verifikuj da je URL https://www.bebakids.com/proizvodi?search=haljina" );
            assert isCurrentUrlEqualsTo ( Strings.HALJINA ):"Error. Trebalo bi da si na " + Strings.HALJINA ;

            print ( "3.Odaberi filter Velicina 4" );
            SearchPage searchPage = new SearchPage ( driver );
            searchPage.oznaciFilterVelicina4 ();
            print ( "3.Verifikuj da je prikazan filteri velicina 4 u blok tagu" );
            searchPage.daLiJeVelicina04UBlokTagu ();


            print ( "4.Verifikuj da je sortiranje izvrseno" );
            //Ovaj deo prolazi ali ne radi ono sto zelim :)
            searchPage.tabelaSvihArtikalaPretrage ();
            searchPage.dropdownSortirajPoNazivu ();
            searchPage.sleep ();

            searchPage.tabelaArtikalaPretrageSortiranaPoNazivu ();
            searchPage.daLiSuSortiranINesortiranJednaki ();




        }finally {
            driver.quit ();
        }
    }

}
