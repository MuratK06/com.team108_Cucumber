package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HastaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PatientStepdefinitions {

    HastaPage hastaPage=new HastaPage();
    @Given("Kullanici browser ayarlarini yapar ve gecerli username {string} ve gecerli password {string} ile siteye login olur")
    public void kullaniciBrowserAyarlariniYaparVeGecerliUsernameVeGecerliPasswordIleSiteyeLoginOlur(String username, String password) {
        hastaPage.yetkiliLogin(username,password);
    }
    @Given("Kullanici browser ayarlarini yapar ve {string} sayfasina gider")
    public void kullanici_browser_ayarlarini_yapar_ve_sayfasina_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }
    @Then("Kullanici olarak gecerli username {string} ve gecerli password {string} ile siteye login olur")
    public void kullaniciOlarakGecerliUsernameVeGecerliPasswordIleSiteyeLoginOlur(String hastaUsername, String password) {
        hastaPage.user_Login(hastaUsername,password);
    }

    //murat





    @Then("Kullanici searchTextBox'la arama yaptigi gorulur")
    public void kullaniciSearchTextBoxLaAramaYaptigiGorulur() {
        Assert.assertTrue(hastaPage.searchBox.isDisplayed());
    }

    @Then("Kullanici arama sonuclarinda basliklar uzerinde siralama yaptigi gorulur")
    public void kullaniciAramaSonuclarindaBasliklarUzerindeSiralamaYaptigiGorulur() {
        Assert.assertTrue(hastaPage.payShow.isDisplayed());
    }

    @Then("Kullanici Ambulance Bill List'teki Action basligi altinda \\(View Payments, Show ve Pay) linkleri gorulur")
    public void kullaniciAmbulanceBillListTekiActionBasligiAltindaViewPaymentsShowVePayLinkleriGorulur() {
        hastaPage.AmbulanceBasliklar();
    }
    //murat

    @Then("Sayfada Ambulance linki gorulur ve tiklanir")
    public void sayfada_ambulance_linki_gorulur_ve_tiklanir() {
        hastaPage.ambulance.click();


    }
    @Then("Kullanici {string} url adresine gittigini gorur.")
    public void kullaniciUrlAdresineGittiginiGorur(String url) {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),url);
    }
    @Then("Sayfa kapatilir")
    public void sayfa_kapatilir() {

    }



}
