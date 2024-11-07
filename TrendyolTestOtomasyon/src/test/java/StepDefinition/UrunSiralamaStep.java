package StepDefinition;

import Pages.TrendyolIlkSayfa;
import Pages.TrendyolUrunAramaSayfasi;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UrunSiralamaStep {
    TrendyolIlkSayfa trendyolIlkSayfa = new TrendyolIlkSayfa();
    TrendyolUrunAramaSayfasi trendyolUrunAramaSayfasi = new TrendyolUrunAramaSayfasi();

    @Then("kullanici {string} kelimesini aratir")
    public void kullaniciKelimesiniAratir(String arananKelime) {
        trendyolIlkSayfa.SearchBox.sendKeys(arananKelime, Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @Then("siralama kutucugundan en dusuk fiyat secenegini secer")
    public void siralamaKutucugundanEnDusukFiyatSeceneginiSecer() {
        trendyolUrunAramaSayfasi.siralamaIcon.click();
        ReusableMethods.waitForClickablility(trendyolUrunAramaSayfasi.siralamaIcon,10);
        Driver.getDriver().findElement(By.xpath("(//*[@class='search-dropdown-text'])[3]")).click();
        ReusableMethods.waitFor(1);
    }

    @Then("birinci ve onuncu urunun fiyatlarini karsilastirarak siralamayi dogrular")
    public void inciVeUncuUrununFiyatlariniKarsilastirarakSiralamayiDogrular(){

        String birinciUrunFiyatMetin = Driver.getDriver().findElement(By.xpath("(//*[@class='prc-box-dscntd'])[1]")).getText();
        birinciUrunFiyatMetin = birinciUrunFiyatMetin.replaceAll("[^0-9]", ""); // Sadece rakamları bırak
        int birinciUrunFiyat = (Integer.parseInt(birinciUrunFiyatMetin))/100;
        System.out.println("Birinci ürün fiyatı: " + birinciUrunFiyat);

        String onuncuUrunFiyatMetin = Driver.getDriver().findElement(By.xpath("(//*[@class='prc-box-dscntd'])[10]")).getText();
        onuncuUrunFiyatMetin = onuncuUrunFiyatMetin.replaceAll("[^0-9]", "");
        int onuncuUrunFiyat = (Integer.parseInt(onuncuUrunFiyatMetin))/100;
        System.out.println("Onuncu ürün fiyatı: " + onuncuUrunFiyat);

        if (birinciUrunFiyat > onuncuUrunFiyat) throw new AssertionError();
        System.out.println("Birinci ürünün fiyatı onuncu üründen daha düşüktür.");;
    }

    @Then("siralama kutucugundan en cok degerlendirilen secenegini secer")
    public void siralamaKutucugundanEnCokDegerlendirilenSeceneginiSecer() {
        trendyolUrunAramaSayfasi.siralamaIcon.click();
        ReusableMethods.waitForClickablility(trendyolUrunAramaSayfasi.siralamaIcon,10);
        Driver.getDriver().findElement(By.xpath("(//*[@class='search-dropdown-text'])[8]")).click();
        ReusableMethods.waitFor(1);
    }

    @Then("birinci ve onuncu urunun degerlendirme sayisini karsilastirarak siralamayi dogrular")
    public void birinciVeOnuncuUrununDegerlendirmeSayisiniKarsilastirarakSiralamayiDogrular() {
        String birinciUrunDegerlendrilmeMetin = Driver.getDriver().findElement(By.xpath("(//*[@class='ratingCount'])[1]")).getText();
        birinciUrunDegerlendrilmeMetin = birinciUrunDegerlendrilmeMetin.replaceAll("[^0-9]", "");
        int birinciUrunDegerlendirilme = (Integer.parseInt(birinciUrunDegerlendrilmeMetin));
        System.out.println("Birinci ürün değerlendirilme sayısı: " + birinciUrunDegerlendirilme);

        String onuncuDegerlendirilmeMetin = Driver.getDriver().findElement(By.xpath("(//*[@class='ratingCount'])[10]")).getText();
        onuncuDegerlendirilmeMetin = onuncuDegerlendirilmeMetin.replaceAll("[^0-9]", "");
        int onuncuUrunDegerlendirilme = (Integer.parseInt(onuncuDegerlendirilmeMetin));
        System.out.println("Onuncu ürünün değerlendirilme sayısı: " + onuncuUrunDegerlendirilme);

        if (birinciUrunDegerlendirilme < onuncuUrunDegerlendirilme) throw new AssertionError();
        System.out.println("Birinci ürünün değerlendirilme sayısı onuncu üründen daha fazladır.");;
    }
}