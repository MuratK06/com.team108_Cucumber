package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

public class AutomationStepdefinitions {

   AutomationPage automationPage=new AutomationPage();
   public ResuableMethods resuableMethods;

   @Given("kullanici automationexercise sayfasina gider")
    public void kullanici_automationexercise_sayfasina_gider() {
       Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
   }

       @And("sign up linkine tiklar")
      public void loginup_linkine_tiklar(){
           automationPage.signUpButon.click();

   }
@And("name kismina isim girer")
    public void name_kismina_isim_girer(){
       automationPage.nameButon.sendKeys("murat");
}
@And("mail kismina mail girer")
    public void mail_kismina_tiklar(){
       automationPage.mailButon.sendKeys("kaan@gmail.com");
}
@And("sign up linkini onaylar")
    public void signup_linkini_onaylar(){
       automationPage.signUpOnay.click();
}

}
