package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addUserFromPage extends _Parent {

    public addUserFromPage()
    {
        PageFactory.initElements(driver, this);
    }

   @FindBy(xpath = "//div[@class='actions']//span")
  public WebElement AddUserButton;

    @FindBy(xpath = "//*[@id=\"UserName\"]")
    public   WebElement usernameAdduser;

    @FindBy(xpath = "//*[@id=\"txtPassword\"]")
    public  WebElement passwordAdduser;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    public WebElement emailAdduser;

    @FindBy(xpath = "//*[@id=\"NameSurname\"]")
    public WebElement fullnameAdduser;

    @FindBy(xpath = "//*[@id=\"PhoneNo\"]")
    public WebElement phoneNoAdduser;

    @FindBy(xpath = "//*[@id=\"SSN\"]")
    public WebElement ssnAdduser;

    @FindBy(xpath = "//*[@id=\"DrivingLicense\"]")
    public WebElement DrivingLicenseAdduser;

    @FindBy(xpath = "//*[@id=\"IDCountry\"]")
    public WebElement CountryAdduser;

    @FindBy(xpath = "//*[@id=\"IDState\"]")
    public WebElement StateAdduser;

    @FindBy(xpath = "//*[@id=\"Address\"]")
    public WebElement AddressAdduser;

    @FindBy(xpath = "//*[@id=\"BirthDate\"]")
    public WebElement BirthDateAdduser;

    @FindBy(xpath = "//*[@id=\"WorkingSector\"]")
    public WebElement WorkingSectorAdduser;

    @FindBy(xpath = "//*[@id=\"IDRole\"]")
    public WebElement RoleAdduser;

  @FindBy(xpath = "(//div[@id='uniform-Approved'])[1]")
  public WebElement approvedAdduser;

  @FindBy(xpath = "//*[@id=\"btnSubmit\"]")
  public WebElement saveButtonAdduser;

  @FindBy(xpath = "//div[text()=\'User was inserted successfully\']")
  public  WebElement textMessage;

  @FindBy(xpath = "//button[text()='OK']")
  public  WebElement popOKButton;









}
