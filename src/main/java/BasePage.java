import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BasePage {
    WebDriver driver=null;


    //Web elementi zajednicki za sve

    @FindBy(xpath = "//div[@class='modal-content text-center']//button[@class='close']")
    WebElement ostvariPopustModalClose;

    @FindBy(xpath = "//label[contains(text(),'Statistika')]")
    WebElement cookieStatistika;

    @FindBy(xpath = "//label[contains(text(),'Marketing')]")
    WebElement cookieMarketing;

    @FindBy(className = "cookie-agree-gdpr")
    WebElement cookieSlazemSe;

    @FindBy(xpath = "//i[@class='icon fa fa-search']")
    WebElement searchButton;

    @FindBy(id = "search-text")
    WebElement searchTextField;

    @FindBy(className = "register-btn")
    WebElement registracijaButton;

    @FindBy(className = "login-btn")
    WebElement prijaviteSeButton;

    @FindBy(xpath = "//img[@alt='Facebook']")
    WebElement povezimoSeFB;

    @FindBy(xpath = "//img[@alt='YouTube']")
    WebElement povezimoSeYouTube;

    @FindBy(id = "logo-icon")
    WebElement logoYouTube;

    @FindBy(xpath = "//div[@class='b3onmgus hv4rvrfc byvelhso j83agx80 bp9cbjyn']")
    WebElement prijaviSeFB;

    @FindBy(xpath = "//img[@alt='Instagram']")
    WebElement povezimoSeInstagram;

    @FindBy(xpath = "//h1[text()='Instagram']")
    WebElement naslovnaInstagram;

    @FindBy(xpath = "//ul[@class='nav items-wrapper']//a[text()='Zaposlenje']")
    WebElement zaposlenje;
    ////a[text()='Zaposlenje']

    @FindBy(xpath = "//div[@class='container']//a[@title= 'O nama']")
    WebElement informacijeONama;

    @FindBy(xpath = "//div[@class='title']/h1/span")
    WebElement naslovONama;
    ///html/body/div[1]/main/div[2]/div/div[1]/div/div[1]/div/h1/span

    @FindBy(xpath = "//div[@class='post-content']")
    WebElement tekstONama;

    @FindBy(xpath = "//div[@class='container']//a[@title= 'Autorska prava']")
    WebElement informacijeAutorskaPrava;

    @FindBy(xpath = "//div[@class='title']/h1")
    WebElement naslovAutorskaPrava;

    @FindBy(xpath = "//div[@class='container']//a[@title= 'Politika privatnosti']")
    WebElement informacijePolitikaPrivatnosti;

    @FindBy(xpath = "//div[@class='title']/h1")
    WebElement naslovPolitikaPrivatnosti;

    @FindBy(xpath = "//div[@class='container']//a[@title= 'Kontakt']")
    WebElement informacijeKontakt;

    @FindBy(xpath = "//div[@class='title']/h1")
    WebElement naslovKontakt;

    @FindBy(xpath = "//iframe[@title='reCAPTCHA']")
    WebElement reCAPTCHA;

    @FindBy(xpath = "//a[@title= 'Uslovi korišćenja']")
    WebElement korisnickiServisUsloviKoriscenja;

    @FindBy(xpath = "//div[@class='title']/h1")
    WebElement naslovUsloviKoriscenja;

    @FindBy(xpath = "//a[@title= 'Pravo na odustajanje']")
    WebElement korisnickiServisPravoNaOdustajanje;

    @FindBy(xpath = "//div[@class='title']/h1")
    WebElement naslovPravoNaOdustajanje;

    @FindBy(xpath = "//a[@title= 'Isporuka']")
    WebElement korisnickiServisIsporuka;

    @FindBy(xpath = "//div[@class='title']/h1")
    WebElement naslovIsporuka;

    @FindBy(xpath = "//a[@title= 'Reklamacije']")
    WebElement korisnickiServisReklamacije;

    @FindBy(xpath = "//div[@class='title']/h1")
    WebElement naslovReklamacije;

    @FindBy(xpath = "//a[@title= 'Povraćaj sredstava']")
    WebElement korisnickiServisPovracajSredstava;

    @FindBy(xpath = "//div[@class='title']/h1")
    WebElement naslovPovracajSredstava;

    @FindBy(xpath = "//a[@title= 'Načini plaćanja']")
    WebElement korisnickiServisNaciniPlacanja;

    @FindBy(xpath = "//div[@class='title']/h1")
    WebElement naslovNaciniPlacanja;

    @FindBy(xpath = "//a[@title= 'Uputstvo za registraciju']")
    WebElement korisnickiServisUputstvoZaRegistraciju;

    @FindBy(xpath = "//div[@class='title']/h1")
    WebElement naslovUputstvoZaRegistraciju;









    //Konstruktor

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver, this );
    }

    public BasePage() {
    }


    //Методе
    public void clickOstvariPopustModalClose(){
        waitForElement ( ostvariPopustModalClose );
        assert  isElementPresent ( ostvariPopustModalClose ): "Error. Modal is not open";
        ostvariPopustModalClose.click ();
    }

    public void clickCookieStatistika(){
        waitForElement ( cookieStatistika );
        cookieStatistika.click ();
    }

    public void clickCookieMarketing(){
        waitForElement ( cookieMarketing );
        cookieMarketing.click ();
    }

    public void clickCookieSlazemSe(){
        cookieSlazemSe.click ();
    }

    public void clickCookieMarketingCookieStatistikaISlazemSe(){
        this.clickCookieStatistika ();
        this.clickCookieMarketing ();
        this.clickCookieSlazemSe ();
    }

    public void clickSearchButton(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", searchButton);
        waitForElement ( searchButton );
    }

    public void enterTextInSearchField(String text) {
        searchTextField.sendKeys ( text );
        searchTextField.sendKeys ( Keys.ENTER );
    }

    public void clickRegistracijaButton(){
        assert isElementPresent ( registracijaButton ):"Error. Registracija button is not present.";
        registracijaButton.click ();
    }

    public void clickLoginButton(){
        assert isElementPresent ( prijaviteSeButton ):"Error. Login Button is not present.";
        prijaviteSeButton.click ();
    }
    public void clickPoveZimoSeFB(){

        assert isElementPresent ( povezimoSeFB ):"Error. Povezimo se nije prisutna opcija na stranici";
        povezimoSeFB.click ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        sleep ();

        print ( "Verifikacija da je Facebook prijavi se prisutan na stranici" );
        assert isElementPresent (prijaviSeFB ):"Error. Nisi na Facebook stranici. ";
        assert isCurrentUrlEqualsTo ( "https://www.facebook.com/bebakids/" ):"Error. Nisi na Facebook stranici";
        driver.close();
        driver.switchTo().window(tabs.get(0));


    }

    public void clickPovezimoSeYouTube(){
        povezimoSeYouTube.click ();

        List<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        print ( "Verifikacija da je YouTube logo prisutan na stranici" );
        assert isElementPresent (logoYouTube ):"Error. Nisi na YouTube stranici. ";
        assert isCurrentUrlEqualsTo ( "https://www.youtube.com/channel/UCzRxCLt2QtSSx0Nr60_DDWw" ):"Error. Nisi na YouTube stranici.";
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void clickPovezimoSeInstagram(){
        povezimoSeInstagram.click ();
        List<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        sleep ();
        print ( "Verifikacija da je Instagram naslov prisutan na stranici" );
        assert isElementPresent (naslovnaInstagram ):"Error. Nisi na Instagram stranici. ";
        assert isCurrentUrlEqualsTo ( "https://www.instagram.com/accounts/login/" ):"Error. Nisi na Instagram stranici.";

        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void clickONama(){
        assert isElementPresent ( informacijeONama ):"Error. Odeljak Informacije u footeru se ne prikazuju";
        informacijeONama.click ();
        sleep ();
        waitForElement ( naslovONama );
        print ( "Naslov stranice O name je: " + naslovONama.getText () );
        assert naslovONama.getText ().contains ( "O NAMA" ):"Error. Naslov stranice nije O nama.";
    }
    public void clickAutorskaPrava(){
        assert isElementPresent ( informacijeAutorskaPrava ):"Error. Odeljak Informacije u " +
                "footeru se ne prikazuju";
        informacijeAutorskaPrava.click ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        sleep ();
        print ( "Naslov stranice Autorska prava je: " + naslovAutorskaPrava.getText () );
        assert naslovAutorskaPrava.getText ().equals ( "AUTORSKA PRAVA" ):"Error. Naslov stranice nije AUTORSKA PRAVA.";
    }

    public void clickPolitikaPrivatnosti(){
        driver.close ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        assert isElementPresent ( informacijePolitikaPrivatnosti ):"Error. Odeljak Informacije " +
                "u footeru se ne prikazuje.";
        informacijePolitikaPrivatnosti.click ();
        List<String> tabs1 = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        sleep ();
        print ( "Naslov stranice Politika privatnosti je " + naslovPolitikaPrivatnosti.getText () );
        assert naslovPolitikaPrivatnosti.getText ().equals ( "POLITIKA PRIVATNOSTI" ):"Error. Naslov stranice nije POLITIKA PRIVATNOSTI.";
    }

    public void clickKontakt(){
        driver.close ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        assert isElementPresent ( informacijeKontakt ):"Error. Odeljak Informacije " +
                "u footeru se ne prikazuje.";
        informacijeKontakt.click ();
        List<String> tabs1 = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        sleep ();
        print ( "Naslov stranice Kontakt je " + naslovKontakt.getText () );
        assert naslovPolitikaPrivatnosti.getText ().equals ( "KONTAKT" ):"Error. Naslov stranice nije KONTAKT.";

    }
    public void clickUsloviKoriscenja(){
        assert isElementPresent ( korisnickiServisUsloviKoriscenja ):"Error. " +
                "Odeljak Korisnicki servis u footeru se ne prikazuje.";
        korisnickiServisUsloviKoriscenja.click ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        waitForElement (naslovUsloviKoriscenja  );
        print ( "Naslov stranice Uslovi Koriscenja je: " + naslovUsloviKoriscenja.getText () );
        assert naslovUsloviKoriscenja.getText ().equals ( "USLOVI KORIŠĆENJA" ):"Error. Naslov stranice nije AUTORSKA PRAVA.";
    }
    public void clickPravoNaOdustajanje(){
        driver.close ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        assert isElementPresent ( korisnickiServisPravoNaOdustajanje ):"Error. Odeljak Informacije " +
                "u footeru se ne prikazuje.";
        korisnickiServisPravoNaOdustajanje.click ();
        List<String> tabs1 = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        waitForElement ( naslovPravoNaOdustajanje );
        print ( "Naslov stranice Povracaj sredstava je " + naslovPravoNaOdustajanje.getText () );
        assert naslovPolitikaPrivatnosti.getText ().equals ( "KORISNIČKI SERVIS - PRAVO NA ODUSTAJANJE/POVRAĆAJ ROBE" ):
                "Error. Naslov stranice nije KORISNIČKI SERVIS - PRAVO NA ODUSTAJANJE/POVRAĆAJ ROBE";
    }

    public void clickIsporuka(){
        driver.close ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        assert isElementPresent ( korisnickiServisIsporuka ):"Error. Odeljak Informacije " +
                "u footeru se ne prikazuje.";
        korisnickiServisIsporuka.click ();
        List<String> tabs1 = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        waitForElement ( naslovIsporuka );
        print ( "Naslov stranice Uslovi isporuke je: " + naslovIsporuka.getText () );
        assert naslovIsporuka.getText ().equals ( "USLOVI ISPORUKE" ): "Error. " +
                "Naslov stranice nije USLOVI ISPORUKE";
    }

    public void clickReklamacije(){
        driver.close ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        assert isElementPresent ( korisnickiServisReklamacije ):"Error. Odeljak Informacije " +
                "u footeru se ne prikazuje.";
        korisnickiServisReklamacije.click ();

        //waitForElement ( naslovReklamacije );
        print ( "Naslov stranice Reklamacije je " + naslovReklamacije.getText () );
        assert naslovReklamacije.getText ().equals ( "KORISNIČKI SERVIS - REKLAMACIJE" ): "Error. " +
                "Naslov stranice nije KORISNIČKI SERVIS - REKLAMACIJE";
    }

    public void clickPovracajSredstava(){
        assert isElementPresent ( korisnickiServisPovracajSredstava ):"Error. Odeljak Informacije u " +
                "footeru se ne prikazuju";
        korisnickiServisPovracajSredstava.click ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        sleep ();
        print ( "Naslov stranice Povracaj robe je: " + naslovPovracajSredstava.getText () );
        assert naslovPovracajSredstava.getText ().equals ( "KORISNIČKI SERVIS - POVRAĆAJ ROBE" ):"Error. " +
                "Naslov stranice nije KORISNIČKI SERVIS - POVRAĆAJ ROBE.";

    }

    public void clickNaciniPlacanja(){
        driver.close ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        assert isElementPresent ( korisnickiServisNaciniPlacanja ):"Error. Odeljak Informacije " +
                "u footeru se ne prikazuje.";
        korisnickiServisNaciniPlacanja.click ();
        List<String> tabs1 = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));

        waitForElement ( naslovNaciniPlacanja );
        print ( "Naslov stranice Nacini placanje je " + naslovNaciniPlacanja.getText () );
        assert naslovNaciniPlacanja.getText ().equals ( "NAČINI PLAĆANJA" ): "Error. " +
                "Naslov stranice nije NAČINI PLAĆANJA";
    }

    public void clickUputstvoZaRegistraciju(){
        driver.close ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        assert isElementPresent ( korisnickiServisUputstvoZaRegistraciju ):"Error. Odeljak Informacije " +
                "u footeru se ne prikazuje.";
        korisnickiServisUputstvoZaRegistraciju.click ();
        List<String> tabs1 = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));

        waitForElement ( naslovUputstvoZaRegistraciju );
        print ( "Naslov stranice Politika privatnosti je " + naslovUputstvoZaRegistraciju.getText () );
        assert naslovUputstvoZaRegistraciju.getText ().equals ( "UPUTSTVO ZA REGISTRACIJU" ): "Error. " +
                "Naslov stranice nije UPUTSTVO ZA REGISTRACIJU";
    }






    //neke helper metode
    public void print(String text) {

        System.out.println (text);
    }

    public void sleep() {

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //provera da li je neki element prisutan na stranici
    public boolean isElementPresent(WebElement element) {
        print("isElementPresent");
        try {
            boolean isPresent=element.isDisplayed();
            return true;
        }catch (Exception e){
            print ( e.getMessage () );
            print ( "Element is not present on page" );
            return false;
        }
    }
    //opsta metoda za cekanje bilo kog webelementa
    public void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait ( driver, 15 );
        wait.until( ExpectedConditions.visibilityOf (element) );
    }

    public  boolean isCurrentUrlEqualsTo(String expectedUrl){
        print ( "isCurrentUrlEqualsTo ( " + expectedUrl + " ) ");
        String currentUrl = driver.getCurrentUrl ();
        print ( "User is on " + currentUrl );
        boolean b = currentUrl.equals ( expectedUrl );
        return b;

    }

}
