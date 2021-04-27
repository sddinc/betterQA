package StepDefinitions;
import Pages._6_messagePage;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.Map;
import Utilities.*;

public class _6_mailMergeExcelAuto {

    _6_messagePage messagePage = new _6_messagePage();
    WebDriver driver;

    @Given("^navigate to site sdinc$")
    public void navigateToSiteSdinc() {
        driver = Driver.getDriver();
        driver.manage().deleteAllCookies();
        driver.get("http://www.sdinc.xyz/meet/login.php");
        driver.manage().window().maximize();
    }

    @Given("^enter username  \"([^\"]*)\"$")
    public void enterUsername(String arg0) {
        messagePage.sendKeysFunction(messagePage.txt_username, arg0);

    }

    @Given("^enter password  \"([^\"]*)\"$")
    public void enterPassword(String arg0) {
        messagePage.sendKeysFunction(messagePage.txt_password, arg0);
    }

    @Given("^click to auth$")
    public void clickToAuth() {
        messagePage.clickFunction(messagePage.btn_submit);
    }

    @When("^click to message box  trimite$")
    public void clickToMessageBoxTrimite() {
        messagePage.clickFunction(messagePage.img_messageBox);
        messagePage.clickFunction(messagePage.link_trimite);
    }

    @When("^select  Destination$")
    public void selectDestination() throws InterruptedException {
        String path = "./src/main/resources/contact.xlsx";

        Utilities.ExcelUtil excelUtil;
        List<Map<String, String>> testData;
        excelUtil = new Utilities.ExcelUtil(path, "Sheet1");
        testData = excelUtil.getDataList();

        for (Map<String, String> appData : testData) {
            messagePage.selectDropdown(messagePage.dropdown_destination, appData.get("Destination"));
            messagePage.sendKeysFunction(messagePage.title, appData.get("Title"));
            messagePage.sendKeysFunction(messagePage.txt_message, appData.get("Message"));
            messagePage.clickFunction(messagePage.btn_message);
            Thread.sleep(2000);
            messagePage.alertAccept(true);
            driver.get("http://www.sdinc.xyz/meet/index.php?page_select=mesaj_add");
        }
    }
}
