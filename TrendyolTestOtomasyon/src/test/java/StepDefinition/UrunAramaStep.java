package StepDefinition;

import Pages.TrendyolIlkSayfa;
import Utilities.Driver;
import Utilities.ReusableMethods;
import Utilities.TestBaseCross;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.security.Key;

public class UrunAramaStep extends TestBaseCross {
    TrendyolIlkSayfa trendyolIlkSayfa = new TrendyolIlkSayfa();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();

    @Then("{string} kelimesini aratir")
    public void kelimesini_aratir(String arananKelime) {
        actions.click(trendyolIlkSayfa.SearchBox).perform();
        trendyolIlkSayfa.SearchBox.clear();
        trendyolIlkSayfa.SearchBox.sendKeys(arananKelime, Keys.ENTER);
        ReusableMethods.waitFor(1);
    }
    @Then("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String dogrulananKelime) {
        Assert.assertTrue(trendyolIlkSayfa.sonucWE.getText().contains(dogrulananKelime));
        softAssert.assertFalse(trendyolIlkSayfa.sonucWE.getText().contains("ürün bulunamadı"),"Aranan ürün bulunamadı");
        ReusableMethods.waitFor(1);

    }}
