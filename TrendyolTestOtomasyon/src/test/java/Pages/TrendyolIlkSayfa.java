package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendyolIlkSayfa {

    public TrendyolIlkSayfa() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[text()='Giriş Yap'])[1]")
    public WebElement girisYazisi;

    @FindBy(xpath = "(//*[text()='Giriş Yap'])[1]")
    public WebElement girisButonu;

    @FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']")
    public WebElement kapatIcon;

    @FindBy(xpath = "//*[@class='signup-button signup-button-container']")
    public WebElement uyeOlButonu;

    @FindBy(xpath = "//*[@class='V8wbcUhU']" )
    public WebElement SearchBox;

    @FindBy(xpath = "//*[@class = 'dscrptn dscrptn-V2']")
    public WebElement sonucWE;

    @FindBy(xpath = "//*[@id='logo']")
    public WebElement trendyolLogo;

    @FindBy(xpath = "//*[@class='side-menu-button']")
    public WebElement tumKategoriler;
}
