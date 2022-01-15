import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PovezimoSeTest extends BaseTest{
    /**
     * Veza sa drustvenim mrezama
     *
     * Test steps:
     * 1. Navigiraj na bebakids.com
     * 2. U footer delu stranice odaberi opciju Povezimo se i klikni na ikonicu YouTube
     * 3. U footer delu stranice odaberi opciju Povezimo se i klikni na ikonicu Facebook
     * 4. U footer delu stranice odaberi opciju Povezimo se i klikni na ikonicu Instagram

     *
     * Expected result:
     * 2. Otvara se novi tab URL https://www.youtube.com/channel/UCzRxCLt2QtSSx0Nr60_DDWw
     * 3. Otvara se novi tab URL https://www.facebook.com/bebakids/
     * 4. Otvara se novi tab URL https://www.instagram.com/accounts/login/
     */
    @Test
    public void povezimoSeSaDrustvenimMrezamaTest(){
        WebDriver driver =  openChromeDriver ();
        try {
            print ( "1.Navigiraj na bebakids.com" );
            BasePage basePage = new BasePage (driver);
            print ( "2.Klikni na ikonicu YouTube, verifikuj otvaranje novog taba i novi URL,nakon toga zatvori tab" );
            basePage.clickPovezimoSeYouTube ();
            print ( "3.Klikni na ikonicu Facebook, verifikuj otvaranje novog taba i novi URL,nakon toga zatvori tab" );
            basePage.clickPoveZimoSeFB ();
            print ( "4.Klikni na ikonicu Instagram i verifikuj otvaranje novog taba i novi URL,nakon toga zatvori tab" );
            basePage.clickPovezimoSeInstagram ();

        }finally {
            driver.quit ();
        }
    }
}
