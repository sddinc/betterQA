package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _6_messagePage extends _Parent {
    public _6_messagePage()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement txt_username;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement txt_password;


    @FindBy(xpath = "//input[@type='submit']")
    public WebElement btn_submit;


    @FindBy(xpath = "//a[@id='messagesDropdown']")
    public WebElement img_messageBox;


    @FindBy(xpath = "//a[text()='Trimite']")
    public WebElement link_trimite;

    @FindBy(xpath = "//*[@id=\"f_ad\"]")
    public WebElement dropdown_destination;


    @FindBy(xpath = "//input[@name='f_baslik']")
    public WebElement title;


    @FindBy(xpath = "//textarea[@name='f_mesaj']")
    public WebElement txt_message;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement btn_message;


}
