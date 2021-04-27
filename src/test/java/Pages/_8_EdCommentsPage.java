package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _8_EdCommentsPage {
    public _8_EdCommentsPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[contains(text(),'Teacher - SPEC.IASI')]")

    public WebElement linkTeacher;

    @FindBy(xpath = "//span[contains(text(),'Record Book')]")
    public WebElement linkRecordBook;

    @FindBy(xpath = "//*[@id=\"sidebarnav\"]/li[2]/ul/li[2]/a/span")


    public WebElement linkComments;


    @FindBy(xpath = "//*[@id=\"sidebarnav\"]/li[2]/ul/li[2]/ul/li[2]/a/span")
    public WebElement linkTermComment;

    @FindBy(xpath = "//label[contains(text(),'Please Choose')]']")
    public WebElement dropdownList;


    @FindBy(xpath = "//*[text()='Semester 1 14-09-2020 / 29-01-2021']")
    public WebElement radioSem1;


    @FindBy(xpath = "//li[contains(text(),'Elem. de Tehn. Inf. si Comunic | 7 A | All Student')]")


    public WebElement clasa7;

    @FindBy(id = "listside")

    public List<WebElement> list7;






    @FindBy(xpath = "//textarea[@id='term_comment_']")

    public WebElement commnetBox;

    @FindBy(xpath = "//*[text()='SAVE COMMENT']")
    public WebElement btnSaveComment;

    @FindBy(xpath = "//*[text()='Successful Registration.']")
    public WebElement messageControl;







    //@FindBy(xpath = "//*[@id=\"listside\"]/ul[1]/li[1]")
    @FindBy(xpath = "(//*[text()='7 A'])[2]")
    public WebElement listSide;

}
