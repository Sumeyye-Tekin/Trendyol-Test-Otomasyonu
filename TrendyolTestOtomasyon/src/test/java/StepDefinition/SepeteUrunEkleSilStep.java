package StepDefinition;

import Pages.TrendyolSepetSayfasi;
import Pages.TrendyolUrunAramaSayfasi;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SepeteUrunEkleSilStep {
    Actions actions = new Actions(Driver.getDriver());
    TrendyolUrunAramaSayfasi trendyolUrunAramaSayfasi = new TrendyolUrunAramaSayfasi();
    TrendyolSepetSayfasi trendyolSepetSayfasi = new TrendyolSepetSayfasi();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
    SoftAssert softAssert = new SoftAssert();
    int urunSayisi = 0;


    @Then("ilk siradaki urunu sepete ekler")
    public void ilkSiradakiUrunuSepeteEkler() {
        Driver.getDriver().findElement(By.xpath("(//*[@class='add-to-basket-button'])[1]")).click();
        ReusableMethods.waitFor(1);
        urunSayisi += 1;
    }

    @Then("urun sayisini {int} arttirir")
    public void urunSayisiniIkiArttirir(int sayi1) {
        urunSayisi += sayi1;
        actions.click(trendyolUrunAramaSayfasi.arttir).perform();
        ReusableMethods.waitFor(1);
        actions.click(trendyolUrunAramaSayfasi.arttir).perform();
    }


    @Then("sepete tiklanarak eklenen urunler kontrol eder")
    public void sepeteTiklanarakEklenenUrunlerKontrolEder() {
        trendyolUrunAramaSayfasi.sepetim.click();
        ReusableMethods.waitFor(1);
        softAssert.assertTrue(trendyolSepetSayfasi.sepetteUrun.isDisplayed(),"Sepette ürün yok");
    }

    @Then("urun sayisi {int} azaltir")
    public void urunSayisiAzaltir(int sayi2) {
        urunSayisi -=1;
        trendyolSepetSayfasi.sepetAzalt.click();
        ReusableMethods.waitFor(1);
        String value = trendyolSepetSayfasi.urunSayiText.getAttribute("value");
        int valueSayi = Integer.parseInt(value);
        System.out.println(valueSayi);
        softAssert.assertEquals(value,urunSayisi,"Beklenen değer ile gerçek değer eşleşmiyor");
        ReusableMethods.waitFor(1);
    }

    @Then("sepetteki urunleri kaldirir")
    public void sepettekiUrunleriKaldirir() {
        trendyolSepetSayfasi.sepetSil.click();
        ReusableMethods.waitFor(1);
    }

    @Then("urunlerin sepetten kaldirildigini dogrular")
    public void urunlerinSepettenKaldirildiginiDogrular() {
        Assert.assertTrue(trendyolSepetSayfasi.urunKaldirildi.getText().contains("sepetinden kaldırıldı"));
    }


}
