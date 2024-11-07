package StepDefinition;

import Pages.TrendyolSepetSayfasi;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Do;
import org.junit.Assert;

public class SiparisOzetiGoruntulemeStep {
    Double toplamFiyat;
    TrendyolSepetSayfasi trendyolSepetSayfasi = new TrendyolSepetSayfasi();

    @Then("siparis ozetinin gorundugunu dogrular")
    public void siparisOzetininGorundugunuDogrular() {
        Assert.assertTrue(trendyolSepetSayfasi.siparisOzet.isDisplayed());
    }


    @Then("sepetteki urunlerin fiyatını toplar")
    public void sepettekiUrunlerinFiyatınıToplar() {
        String urunFiyatIki = trendyolSepetSayfasi.urunFiyatList.get(0).getText().replaceAll("[^0-9,]", "").replace(",", ".");
        Double urunFiyat2 = Double.parseDouble(urunFiyatIki) ;
        System.out.println(urunFiyat2);
        String urunFiyatBir = trendyolSepetSayfasi.urunFiyatList.get(1).getText().replaceAll("[^0-9,]", "").replace(",", ".");
        Double urunFiyat1 = Double.parseDouble(urunFiyatBir) ;
        System.out.println(urunFiyat1);
        toplamFiyat = urunFiyat1 + urunFiyat2;
        System.out.println(toplamFiyat);
    }

    @Then("toplamın siparis ozetiyle ayni oldugunu dogrular")
    public void toplamınSiparisOzetiyleAyniOldugunuDogrular() {
        System.out.println(toplamFiyat);
        String siparisToplamText = trendyolSepetSayfasi.siparisToplam.getText()
                .replaceAll("[^0-9,]", "").replace(",", ".");
        Double siparisToplam = Double.parseDouble(siparisToplamText);
        System.out.println(siparisToplam);
        Assert.assertEquals(siparisToplam,toplamFiyat);
        }
    }


