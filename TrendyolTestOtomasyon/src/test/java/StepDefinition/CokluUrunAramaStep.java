package StepDefinition;

import Pages.TrendyolGirisSayfasi;
import Pages.TrendyolIlkSayfa;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CokluUrunAramaStep {
    TrendyolIlkSayfa trendyolIlkSayfa = new TrendyolIlkSayfa();
    TrendyolGirisSayfasi trendyolGirisSayfasi = new TrendyolGirisSayfasi();

    @Given("kullanici Trendyola giris yapar")
    public void kullaniciTrendyolaGirisYapar() {
        Driver.getDriver().get(ConfigReader.getProperty("trendyolURL"));
        ReusableMethods.waitFor(1);

    }

    @Then("kullanici {string} aratir")
    public void kullaniciAratir(String arananKelime) {
        trendyolIlkSayfa.kapatIcon.click();
        trendyolIlkSayfa.SearchBox.sendKeys(arananKelime, Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @Then("sonucların {string} icerdigini dogrular")
    public void sonuclarınIcerdiginiDogrular (String dogrulananKelime) {
        Assert.assertTrue(trendyolIlkSayfa.sonucWE.getText().contains(dogrulananKelime));
        ReusableMethods.waitFor(1);
    }

    @And("sayfadan cikar")
    public void sayfadanCikar() {
        Driver.closeDriver();
    }
}
