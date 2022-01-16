import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ZaposlenjePage extends BasePage{

    WebDriver driver = null;

    //Webelementi
    @FindBy(xpath = "//a[text()='Zaposlenje']")
    WebElement zaposlenje;
    ////ul[@class='nav items-wrapper']//a[text()='Zaposlenje']

    @FindBy(xpath = "//div[@class='title']/h1")
    WebElement naslovPostaniDeoEkipe;

    @FindBy(id = "career_city")
    WebElement gradZaposlenja;

    @FindBy(id = "career_firstname")
    WebElement zaposlenjeIme;

    @FindBy(id = "career_lastname")
    WebElement zaposlenjePrezime;

    @FindBy(id = "career_phone")
    WebElement zaposlenjeTelefon;

    @FindBy(id = "career_email")
    WebElement zaposlenjeEmail;

    @FindBy(id = "career_birthday")
    WebElement zaposlenjeDatumRodjenja;

    @FindBy(xpath = "//label[@for='career_gender_2']")
    WebElement polZenski;

    @FindBy(id = "career_aboutself")
    WebElement zastoZelisDaRadisUNasojFirmi;

    @FindBy(xpath = "//input[@name='career_image']")
    WebElement zaposlenjeSlika;

    @FindBy(xpath = "//input[@name='career_cv']")
    WebElement zaposlenjeCV;

    @FindBy(name = "career_submit")
    WebElement zaposlenjePrijaviSe;

    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 form-antispam']//ul")
    WebElement errorPorukaZaposlenje;




    //Konstruktor

    public ZaposlenjePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver, this );
    }

    //Metode nad Webelementima
    public void clickZaposlenje(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript ( "arguments[0].scrollIntoView();", zaposlenje );
        assert isElementPresent ( zaposlenje ) : "Error. Zaposlenje dugme se ne prikazuje.";
        zaposlenje.click ();
        sleep ();
        List<String> tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        sleep ();
    }

    public void unesiGradZaposlenja(){
        assert isElementPresent ( gradZaposlenja ):"Error. Nisi na stranici Zaposlenje.";
        gradZaposlenja.sendKeys ( Strings.GRAD_ZAPOSLENJA );
    }

    public void pozicijaZaposlenja(){
        Select dropDown = new Select(driver.findElement( By.className ( "required" )));
        dropDown.selectByVisibleText("Poslovni Sekretar");
    }

    public void unesiIme(){
        assert isElementPresent ( zaposlenjeIme ):"Error. Nisi na stranici Zaposlenje.";
        zaposlenjeIme.sendKeys ( Strings.REGISTRACIJA_IME );
    }

    public void unesiPrezime(){
        assert isElementPresent ( zaposlenjePrezime ):"Error. Nisi na stranici Zaposlenje.";
        zaposlenjePrezime.sendKeys ( Strings.REGISTRACIJA_PREZIME );
    }
    public void unesiTelefon(){
        assert isElementPresent ( zaposlenjeTelefon ):"Error. Nisi na stranici Zaposlenje.";
        zaposlenjeTelefon.sendKeys ( Strings.REGISTRACIJA_TELEFON );
    }
    public void unesiEmail(){
        assert isElementPresent ( zaposlenjeEmail ):"Error. Nisi na stranici Zaposlenje.";
        zaposlenjeEmail.sendKeys ( Strings.REGISTRACIJA_EMAIL );
    }

    public void unesiDatumRodjenja(){
        assert isElementPresent ( zaposlenjeDatumRodjenja ):"Error. Nisi na stranici Zaposlenje.";
        zaposlenjeDatumRodjenja.sendKeys ( Strings.DATUM_RODJENJA );
    }

    public void izaberiZavrsenuSkolu(){
        Select dropDown = new Select(driver.findElement( By.name ( "career_school" )));
        dropDown.selectByVisibleText("Master studije (VII-2 stepen stručne spreme)");

    }
    public void oznaciPolZenski(){
        assert isElementPresent ( polZenski ):"Error. Nisi na stranici Zaposlenje.";
        polZenski.click ();
    }

    public void unesiZastoZelisDaRadisUNasojFirmi(){
        assert isElementPresent ( zastoZelisDaRadisUNasojFirmi ):"Error. Nisi na stranici Zaposlenje.";
        zastoZelisDaRadisUNasojFirmi.sendKeys ( Strings.ZASTO_BAS_JA );
    }
    public void clickZaposlenjeSlika(){

        print ( "Uradi upload slike za radnu biografiju" );
        assert isElementPresent ( zaposlenjeSlika ):"Error. Nisi na stranici Zaposlenje.";

        //System.getProperty("user.dir") nam vraca apsolutnu putanju do projekta
        String directoryPath = System.getProperty("user.dir");
        //System.getProperty("file.separator") nam vraca kosu crtu koju nas operativni sistem koristi u putanjama
        String separator = System.getProperty("file.separator");

        String path = directoryPath + separator  +  "JovanaCVSlika.jpg";

        zaposlenjeSlika.sendKeys(path);
    }

    public void clickZaposlenjeCV(){

        print ( "Uradi upload CV" );
        assert isElementPresent ( zaposlenjeCV ):"Error. Nisi na stranici Zaposlenje.";

        //System.getProperty("user.dir") nam vraca apsolutnu putanju do projekta
        String directoryPath = System.getProperty("user.dir");
        //System.getProperty("file.separator") nam vraca kosu crtu koju nas operativni sistem koristi u putanjama
        String separator = System.getProperty("file.separator");

        String path = directoryPath + separator  +  "Jovana_Basaric_PripunicCV.pdf";

        zaposlenjeCV.sendKeys(path);
    }
    public void clickZaposlenjePrijaviSe(){
        assert isElementPresent ( zaposlenjePrijaviSe ):"Error. Nisi na stranici Zaposlenje.";
        zaposlenjePrijaviSe.click ();
    }

    public void proveriErrorPoruku(){
        print ( "Proveri da li je Error poruka prisutna u delu anti spam" );
        assert isElementPresent ( errorPorukaZaposlenje ):"Error. Error poruka u formularu zaposlenje,odeljak anti spam se ne prikazuje.";
        assert errorPorukaZaposlenje.getText ().equals ( "Ovo polje je obavezno." ):"Error. Poruka Ovo polje je obavezno se ne prikazuje.";

    }

}
