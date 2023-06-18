package stepdefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class HastaPage {

    public HastaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

// murat

    @FindBy(xpath = "//input[@id='email']")
    public WebElement usernamee;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement pasword;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement signin;

    @FindBy(xpath = "(//i[@class='fas fa-ambulance'])[1]")
    public WebElement ambulance;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//thead/tr[1]")
    public List<WebElement> ambulancebaslikSiralama;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement payShow;

    // murat_sevilay ortak

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement Userlogin;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement Useremail;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement Userpassword;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement UsersignIn;

    public void yetkiliLogin(String username, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("healthadminUrl"));
        Useremail.sendKeys(ConfigReader.getProperty(username));
        Userpassword.sendKeys(ConfigReader.getProperty(password));
        UsersignIn.click();

    }

    public void user_Login(String username, String password) {

        usernamee.sendKeys(ConfigReader.getProperty(username));
        pasword.sendKeys(ConfigReader.getProperty(password));
        signin.click();

    }
    public void AmbulanceBasliklar() {
        // JSUtilities.scrollToElement(Driver.getDriver(),Driver.getDriver().findElement(By.xpath("//h3[.='Jessica']")));
        //Actions actions=new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        for (WebElement AmbulanceBaslik : ambulancebaslikSiralama) {
            AmbulanceBaslik.isDisplayed();

        }
    }

}
