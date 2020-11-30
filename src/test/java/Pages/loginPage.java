package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage extends _Parent {

    public loginPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="//input[@id='UserName']")
    public  WebElement username;

    @FindBy(xpath = "//*[@id=\'navLogon\']/a")
    public WebElement loginLink;

    @FindBy (xpath = "//input[@id='Password']")
    public WebElement userPassword;

    @FindBy(xpath="//input[@id='btnSubmit']")
    public WebElement loginButton;



}
