package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TrendyolSepetSayfasi {
    public TrendyolSepetSayfasi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='ty-numeric-counter-button'])[1]")
    public WebElement sepetAzalt;

    @FindBy(xpath = "(//*[@class='ty-numeric-counter-button'])[2]")
    public WebElement sepetArttir;

    @FindBy(xpath = "//*[text()='Sepetinde ürün bulunmamaktadır.']")
    public WebElement urunYokText;

    @FindBy(xpath = "//*[@class='counter-content']")
    public WebElement urunSayiText;

    @FindBy(xpath = "//*[@class='checkout-saving-remove-button']")
    public WebElement sepetSil;

    @FindBy(xpath = "//*[@class='pb-basket-item-removed-item-information-label single']")
    public WebElement urunKaldirildi;

    @FindBy(xpath = "//*[@class='link account-basket']")
    public WebElement sepetim;

    @FindBy(xpath = "basket-preview-popup-container display-block")
    public WebElement popUpAcik;

    @FindBy(xpath = "//*[@class='pb-merchant-group']")
    public WebElement sepetteUrun;

    @FindBy(xpath = "//*[text()='Sipariş Özeti']")
    public WebElement siparisOzet;

    @FindBy(xpath = "//*[@class='counter-content']")
    public List<WebElement> urunSayiList;

    @FindBy(xpath = "//*[@class='pb-basket-item-price']")
    public List<WebElement> urunFiyatList;

    @FindBy(xpath = "//*[@id=\"pb-container\"]/aside/div/div[2]/ul/li[1]/strong")
    public  WebElement siparisToplam;
}
