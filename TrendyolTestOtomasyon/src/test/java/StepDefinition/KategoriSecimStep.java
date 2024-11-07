package StepDefinition;

import Pages.TrendyolIlkSayfa;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class KategoriSecimStep {
    TrendyolIlkSayfa trendyolIlkSayfa = new TrendyolIlkSayfa();

    @Then("tum kategoriler bolumunden supermarket secenegini secer")
    public void tumKategorilerBolumundenSupermarketSeceneginiSecer() {
        trendyolIlkSayfa.tumKategoriler.click();
        ReusableMethods.waitFor(1);
        Driver.getDriver().findElement(By.xpath("(//*[@class='left-side-container'])[4]")).click();
    }

    @Then("acilan bolumden bebek dis fircasi secenegini secer")
    public void acilanBolumdenBebekDisFircasiSeceneginiSecer() {
        Driver.getDriver().findElement(By.xpath("(//*[@class='category-sub-title'])[31]")).click();
        ReusableMethods.waitFor(5);
    }

    @Then("gelen sonucların {string} icerdigini dogrular")
    public void gelenSonuclarınIcerdiginiDogrular(String arananKelime) {
        Assert.assertTrue(trendyolIlkSayfa.sonucWE.getText().contains(arananKelime));
    }

    @Then("tum kategoriler bolumunden kadin secenegini secer")
    public void tumKategorilerBolumundenKadinSeceneginiSecer() {
        trendyolIlkSayfa.tumKategoriler.click();
    }

    @Then("acilan bolumden omuz cantasi secenegini secer")
    public void acilanBolumdenOmuzCantasiSeceneginiSecer() {
        Driver.getDriver().findElement(By.xpath("(//*[@class='category-sub-title'])[38]")).click();
    }
}
