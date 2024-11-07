package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrenyolYeniUyeSayfasi {

    public TrenyolYeniUyeSayfasi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@type='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement sifre;

    @FindBy(xpath = "(//*[@type='button'])[1]")
    public WebElement kadinButon;

    @FindBy(xpath = "(//*[@class='ty-check'])[1]")
    public WebElement acikRizaKutu;

    @FindBy(xpath = "(//*[@class='ty-check'])[3]")
    public WebElement aydinlatmaMetniKutu;

    @FindBy(xpath = "//*[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']")
    public  WebElement robotDegilim;

    @FindBy(xpath = "//*[@class='q-primary q-fluid q-button-medium q-button submit']")
    public WebElement uyelikTamam;

    @FindBy(xpath = "//*[@name='a-3z9q5wndjsa3']")
    public WebElement iframe;

}
