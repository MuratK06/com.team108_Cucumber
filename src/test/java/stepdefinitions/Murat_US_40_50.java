package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import pages.LoginPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class Murat_US_40_50 {

    AdminPage adminPage = new AdminPage();
    LoginPages loginPages = new LoginPages();

    @Then("Kullanici Sayfada OPD linki gorur ve tiklar")
    public void kullanici_sayfada_opd_linki_gorur_ve_tiklar() {
        adminPage.opdButton.click();
    }

    @Then("Kullanici OPD sayfasindaki OPD Patient List'te \\(Name, Patient Id, Guardian Name, Gender, Phone, Consultant, Last Visit, Total Recheckup) basliklarini goror")
    public void kullaniciOPDSayfasindakiOPDPatientListTeNamePatientIdGuardianNameGenderPhoneConsultantLastVisitTotalRecheckupBasliklariniGoror() {
        adminPage.opdButton.click();
        adminPage.opdBasliklar();
    }



    @Then("Kullanici OPD sayfasindaki OPD Patient List'te görüntülenecek liste elemanlarini secer)")
    public void kullaniciOPDSayfasindakiOPDPatientListTeGörüntülenecekListeElemanlariniSecerAllVeyaOlarak(int arg0) {
    Assert.assertTrue(adminPage.opdListeSiralama.isDisplayed());
    //Assert.assertTrue(adminPage.opdListeSiralamaAll.isDisplayed());

    }

    @Then("Kullanici OPD sayfasindaki OPD Patient List'te arama yapabilmek icin sayfada searchBox'i gorur")
    public void kullaniciOPDSayfasindakiOPDPatientListTeAramaYapabilmekIcinSayfadaSearchBoxIGorur() {
        Assert.assertTrue(adminPage.opdSearchbutton.isDisplayed());
    }

    @Then("Kullanici OPD sayfasindaki OPD Patient List'te görüntülenecek liste elemanlarini secer")
    public void kullaniciOPDSayfasindakiOPDPatientListTeGörüntülenecekListeElemanlariniSecer() {
        Assert.assertTrue(adminPage.opdListeSiralama.isDisplayed());
       // Assert.assertTrue(adminPage.opdListeSiralamaAll.isDisplayed());
       // Assert.assertTrue(adminPage.opdListeSiralama100.isDisplayed());
    }

    @Then("Kullanici OPD linkine tiklar")
    public void kullaniciOPDLinkineTiklar() {
        adminPage.opdButton.click();
    }


    @Then("Kullanici Add Patient linkini secer")
    public void kullaniciAddPatientLinkiniSecer() {
        adminPage.addPatient.click();
        ReusableMethods.bekle(3);
        
    }

    @Then("Kullanici Add Patient butununun secilebilir oldugunu gorur")
    public void kullaniciAddPatientButunununSecilebilirOldugunuGorur() {
        Assert.assertTrue(adminPage.addPatient2.isDisplayed());

        ReusableMethods.bekle(3);
        
    }

    @Then("Kullanici bilgileri dogru bir sekilde doldurur")
    public void kullaniciBilgileriDogruBirSekildeDoldurur() {
        adminPage.addPatient2.click();
        ReusableMethods.bekle(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(adminPage.opdYeniHastaName)
                .sendKeys("Ankara").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Male").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("2000").sendKeys(Keys.TAB)
                .sendKeys("05").sendKeys(Keys.TAB)
                .sendKeys("05").sendKeys(Keys.TAB)
                .sendKeys("A+").sendKeys(Keys.TAB)
                .sendKeys("Single").perform();
        adminPage.opdHastaSave.click();
        ReusableMethods.bekle(3);

        actions.sendKeys(adminPage.appointmentDate)
                .sendKeys("14.05.2023").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("deneme").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("murat.korkmaz").sendKeys(Keys.TAB)
                .sendKeys("OPD Service").sendKeys(Keys.TAB)
                .sendKeys("OPD Service").perform();
        adminPage.opdHastaEklemeSave2.click();



        
    }

    @Then("Kullanici yeni hastanin olusturuldugunu gorur")
    public void kullaniciYeniHastaninOlusturuldugunuGorur() {
        Assert.assertTrue(adminPage.opdHastaEklemeOnay.isDisplayed());
    }

    @Then("Kullanici Sayfada TPA linki gorur ve tiklar")
    public void kullaniciSayfadaTPALinkiGorurVeTiklar() {
        ReusableMethods.bekle(2);
        adminPage.tpabuton.click();
        
    }

    @Then("Kullanici TPA Management List \\(Name, Code,Phone, Address, Contact Person Name, Contact Person Phone basliklari) görüntülenir")
    public void kullaniciTPAManagementListNameCodePhoneAddressContactPersonNameContactPersonPhoneBasliklariGörüntülenir() {
        adminPage.tpaBasliklar();
    }

    @Then("TPA Management List icinde arama yapabilmek icin searchBox'i gorur")
    public void tpaManagementListIcindeAramaYapabilmekIcinSearchBoxIGorur() {
        Assert.assertTrue(adminPage.tpaSearchbox.isDisplayed());
        
    }

    @Then("TPA Management List icinde görüntülenecek icerikleri 100 ve All olarak degistirilir")
    public void tpaManagementListIcindeGörüntülenecekIcerikleriVeAllOlarakDegistirilir(int arg0) {
        Assert.assertTrue(adminPage.tpaicerikGoruntuleme.isDisplayed());
        
    }
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    @Then("TPA Management List'teki basliklar uzerinden list icinde siralama yapilir")
    public void tpaManagementListTekiBasliklarUzerindenListIcindeSiralamaYapilir() {
      Assert.assertTrue(adminPage.tpaicerikGoruntuleme.isDisplayed());
    }

    @Then("TPA Management List icerikleri Contact Person Phone basligi altindan Organization, Delete ve Edit yapilir")
    public void tpaManagementListIcerikleriContactPersonPhoneBasligiAltindanOrganizationDeleteVeEditYapilir() {
        Assert.assertTrue(adminPage.tpaDelete.isDisplayed());
        Assert.assertTrue(adminPage.tpaEdit.isDisplayed());
        Assert.assertTrue(adminPage.tpaOrganization.isDisplayed());
    }

    @Then("Kullanici TPA Management List sayfasindan Add TPA penceresine erisim olur")
    public void kullaniciTPAManagementListSayfasindanAddTPAPenceresineErisimOlur() {
        adminPage.tpaAdd.click();
    }

    @Then("Kullanici Add TPA penceresinde Name, Code,  Contact No,  Address , Contact Person Name, Contact Person Phone  Box'lari gorulur")
    public void kullaniciAddTPAPenceresindeNameCodeContactNoAddressContactPersonNameContactPersonPhoneBoxLariGorulur() {
        adminPage.TpaAddBasliklar();
    }

    @Then("Kullanici gecerli veriler girilip save edilen yeni kayit TPA Management List icinde görüntülenir")
    public void kullaniciGecerliVerilerGirilipSaveEdilenYeniKayitTPAManagementListIcindeGörüntülenir() {
       // adminPage.tpaAddName.click();
        ReusableMethods.bekle(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(adminPage.tpaAddName)
                .sendKeys("Murat").sendKeys(Keys.TAB)
                .sendKeys("06").sendKeys(Keys.TAB)
                .sendKeys("+49123456789").sendKeys(Keys.TAB)
                .sendKeys("Deutschland").sendKeys(Keys.TAB)
                .sendKeys("Busra").sendKeys(Keys.TAB)
                .sendKeys("+49987654321").perform();

        adminPage.tpaAddSave.click();

        Assert.assertTrue(adminPage.tpaManagementSaveBasarili.isDisplayed());

    }
}
