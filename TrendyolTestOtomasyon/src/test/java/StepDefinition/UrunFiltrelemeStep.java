package StepDefinition;

import Pages.TrendyolUrunAramaSayfasi;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class UrunFiltrelemeStep {
    TrendyolUrunAramaSayfasi trendyolUrunAramaSayfasi = new TrendyolUrunAramaSayfasi();
    Actions actions = new Actions(Driver.getDriver());


    @Then("kullanici marka bolumunden Vancat secenegini secer")
    public void kullaniciMarkaBolumundenVancatSeceneginiSecer() {
        ReusableMethods.waitFor(1);
        WebElement kapat = Driver.getDriver().findElement(By.xpath("//*[@class='i-cancel']"));
        if (kapat.isDisplayed()){
            actions.click(kapat).perform();
        }else {
        ReusableMethods.waitFor(1);
      actions.click(Driver.getDriver().findElement(By.xpath("(//*[@class='fltr-item-text'])[2]"))).perform();
      ReusableMethods.waitFor(1);
    }}

   @Then("koku tipi bolumunden bebek pudrali secenegini secer")
    public void kokuTipiBolumundenBebekPudraliSeceneginiSecer() {
        Driver.getDriver().findElement(By.xpath("(//*[@class='fltr-cntnr-ttl-area'])[2]")).click();
        Driver.getDriver().findElement(By.xpath("(//*[@class='filter-container-description'])[5]")).click();
        ReusableMethods.waitFor(1);
        WebElement kokuTipi = Driver.getDriver().findElement(By.xpath("(//*[@class='fltr-item-wrppr'])[222]"));
        actions.doubleClick(kokuTipi).perform();
        ReusableMethods.waitFor(1);
    }

    @Then("secilen filtrelerin isaretlendigini dogrular")
    public void secilenFiltrelerinIsaretlendiginiDogrular() {
        List<WebElement> secimler = Driver.getDriver().findElements(By.xpath("//*[@class='fltr-item-text chckd']"));
        System.out.println(secimler.size());

        for (WebElement a : secimler) {
            System.out.println(a.getText());
        }
    }

    @Then("hizli teslimat secenegini isaretler")
    public void hizliTeslimatSeceneginiIsaretler() {
        trendyolUrunAramaSayfasi.hizliTeslimat.click();
    }

    @Then("filtrelenen urunleri listeler ve urunlerin {string} icerdigini dogrular")
    public void filtrelenenUrunleriListelerVeUrunlerinIcerdiginiDogrular(String arananKelime) {
        List<WebElement> urunler = Driver.getDriver().findElements(By.xpath("//*[@class='prdct-desc-cntnr-ttl-w']"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        System.out.println(urunler.size());
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println(urunler.get(i).getText());
        }
        for (WebElement eleman : urunler) {
            assert (eleman.getText().contains(arananKelime)) : eleman + " " + arananKelime + " kelimesini içermiyor.";
        }
    }
}
