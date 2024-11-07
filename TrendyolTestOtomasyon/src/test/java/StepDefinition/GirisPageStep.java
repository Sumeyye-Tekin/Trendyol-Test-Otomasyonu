package StepDefinition;

import Pages.TrendyolGirisSayfasi;
import Pages.TrendyolIlkSayfa;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class GirisPageStep {

    TrendyolIlkSayfa trendyolIlkSayfa = new TrendyolIlkSayfa();
    TrendyolGirisSayfasi trendyolGirisSayfasi = new TrendyolGirisSayfasi();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici Trendyol sayfasina gider")
    public void kullanici_trendyol_sayfasina_gider() {
        Driver.getDriver().get("https://www.trendyol.com");
        ReusableMethods.waitFor(1);
        trendyolIlkSayfa.kapatIcon.click();
        ReusableMethods.waitFor(1);

    }

    @Then("giris yap yazisi uzerine tiklar")
    public void giris_yap_yazisi_uzerine_tiklar() {
       trendyolIlkSayfa.girisYazisi.click();
    }


    @Then("ilk kutucuga {string} adresini yazar")
    public void ilk_kutucuga_adresini_yazar(String string) {
        trendyolGirisSayfasi.emailGiris.sendKeys(ConfigReader.getProperty("eposta"));
    }

    @Then("goz simgesine tiklar ve sifre gorunurlugunu acar")
    public void goz_simgesine_tiklar_ve_sifre_gorunurlugunu_acar() {
       trendyolGirisSayfasi.gozIcon.click();
    }

    @Then("ikinci kutucuga {string} sini yazar")
    public void ikinci_kutucuga_sini_yazar(String string) {
        trendyolGirisSayfasi.sifreGiris.sendKeys(ConfigReader.getProperty("sifre"));
    }

    @Then("giris yap a tiklar")
    public void giris_yap_a_tiklar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("Hata mesajini gorur")
    public void hata_mesajini_gorur() {
        Assert.assertTrue(trendyolGirisSayfasi.hataYazisi.isDisplayed());
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }
}