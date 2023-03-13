package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //1. https://automationexercise.com/ sayfasina gidelim
    //2. Cucumber ile asagidaki testi yapalim
    //Given user web sayfasinda
    //And user sign up linkine tiklar
    //And user Create an account bölümüne email adresi girer
    //And signUp butonuna basar
    //And user kisisel bilgilerini ve iletisim bilgilerini girer
    //And user Create Account butonuna basar
    //Then hesap olustugunu test edin

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signUpButon;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameButon;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement mailButon;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signUpOnay;

}
