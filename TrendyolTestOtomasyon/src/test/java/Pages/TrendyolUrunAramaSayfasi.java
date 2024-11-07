package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendyolUrunAramaSayfasi {
    public TrendyolUrunAramaSayfasi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='select-w]")
    public WebElement siralamaKutusu;

    @FindBy(xpath = "//*[@class='i-new-sort-icon search-sort-icon']")
    public WebElement siralamaIcon;

    @FindBy(xpath = "//*[@class='quick-filters-item rushDeliveryTimes']")
    public  WebElement hizliTeslimat;

    @FindBy(xpath = "//*[@class='add-to-basket-button']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//*[@class='i-Plus']")
    public WebElement arttir;

    @FindBy(xpath = "//*[@class='link account-basket']")
    public WebElement sepetim;
}

