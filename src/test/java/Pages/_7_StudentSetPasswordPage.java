package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _7_StudentSetPasswordPage {
    public _7_StudentSetPasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"signup\"]/div[1]/input")
    public WebElement txtLoginUsername;

    @FindBy(xpath = "//*[@id=\"user-pass\"]")
    public WebElement txtLoginUserpass;

    @FindBy(xpath = "//*[@id=\"login_btn\"]")

    public WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li/a/img[2]")


    public WebElement imgAccount;

    @FindBy(xpath = "//*[@id=\"profileDiv\"]/div[3]/div[2]/ul/li[3]/a")

    public WebElement linkSecretary;

    @FindBy(xpath = "//*[@id=\"sidebarnav\"]/li[1]/a/span")

    public WebElement linkStudents;

    @FindBy(xpath = "//*[@id=\"sidebarnav\"]/li[1]/ul/li[1]/a/span")

    public WebElement linkStudents2;

    @FindBy(xpath = "//*[@id=\"sidebarnav\"]/li[1]/ul/li[1]/ul/li[2]/a/span")
    public WebElement linkStudentList;

    @FindBy(xpath = "//*[@id=\"ui-id-1\"]/input")
    public WebElement txtStudentName;

    @FindBy(xpath = "//*[@id=\"ui-id-2\"]/input")
    public WebElement txtStudentSurname;

    @FindBy(xpath = "//*[@id=\"studentList\"]/div[1]/table/tbody/tr/td[2]")

    public WebElement listFirstElement;

    @FindBy(xpath = "//*[text()='Set password']")

    public WebElement btnSetPass;

    @FindBy(xpath = "//*[@id=\"newpassword\"]")
    public WebElement txtNewPass;


    @FindBy(xpath = "//*[@id=\"dlgChgPass\"]/div[3]/button[1]/span[2]")
    public WebElement btnSaveNewPass;


    @FindBy(xpath = "//*[@id=\"index2\"]/a")
    public WebElement clickStudentListTab;









}
