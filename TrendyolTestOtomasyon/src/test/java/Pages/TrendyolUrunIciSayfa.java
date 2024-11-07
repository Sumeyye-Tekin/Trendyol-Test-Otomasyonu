package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendyolUrunIciSayfa {
    public TrendyolUrunIciSayfa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[@class='add-to-basket-button-text'])[1]")
    public WebElement sepeteEkle;

    @FindBy(xpath = "(//*[@class='add-to-basket-button-text-success'])[2]")
    public  WebElement sepeteEklendi;
}
