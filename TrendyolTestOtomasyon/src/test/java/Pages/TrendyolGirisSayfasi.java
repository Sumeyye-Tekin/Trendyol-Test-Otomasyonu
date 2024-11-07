package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrendyolGirisSayfasi {

    public TrendyolGirisSayfasi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login-email")
    public WebElement emailGiris;

    @FindBy(id = "login-password-input")
    public WebElement sifreGiris;

    @FindBy(xpath = "//*[@class='i-eye-close']")
    public WebElement gozIcon;

    @FindBy(xpath = "//*[(@class='message')]")
    public WebElement hataYazisi;
}
