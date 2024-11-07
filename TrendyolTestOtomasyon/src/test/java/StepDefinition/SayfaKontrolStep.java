package StepDefinition;

import Pages.TrendyolIlkSayfa;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SayfaKontrolStep {
    TrendyolIlkSayfa trendyolIlkSayfa = new TrendyolIlkSayfa();

    @Then("sayfanin başliginin {string} icerdigini dogrular")
    public void sayfaninBasligininIcerdiginiDogrular(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
        System.out.println("Sayfa başlığı: "+ Driver.getDriver().getTitle());
    }

    @Then("sayfanin URL sinin {string} icerdigini dogrular")
    public void sayfaninURLSininIcerdiginiDogrular(String url) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(url));
        System.out.println("Sayfa URL'Sİ: "+ Driver.getDriver().getCurrentUrl());
    }

    @Then("sayfada Trendyol logosunun gozuktugunu dogrular")
    public void sayfadaTrendyolLogosununGozuktugunuDogrular() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(trendyolIlkSayfa.trendyolLogo.isDisplayed());
        System.out.println("Logo görünüyor");
    }
}
