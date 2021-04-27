package StepDefinitions;

import Pages.SDincMerge;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;

public class _5_MailMergeScenarioOutline {

    SDincMerge sDincMerge = new SDincMerge();
 WebDriver driver;
    @Given("^navigate to sdinc$")
    public void navigateToSdinc() {
        driver=Driver.getDriver();
        driver.manage().deleteAllCookies();
        driver.get("http://www.sdinc.xyz/meet/login.php");
        driver.manage().window().maximize();

    }

    @Given("^enter username as \"([^\"]*)\"$")
    public void enterUsernameAs(String arg0) {
        sDincMerge.sendKeysFunction(sDincMerge.txt_username,arg0);

    }

    @Given("^enter password as \"([^\"]*)\"$")
    public void enterPasswordAs(String arg0) {
        sDincMerge.sendKeysFunction(sDincMerge.txt_password,arg0);
    }

    @Given("^click to authentifica$")
    public void clickToAuthentifica() {
        sDincMerge.clickFunction(sDincMerge.btn_submit);

    }

    @When("^click to message box and trimite$")
    public void clickToMessageBoxAndTrimite() throws InterruptedException {
        //Thread.sleep(3000);
        sDincMerge.clickFunction(sDincMerge.img_messageBox);
        sDincMerge.clickFunction(sDincMerge.link_trimite);
    }





    @When("^select  \"([^\"]*)\"$")
    public void select(String Destination) throws InterruptedException {
        //Thread.sleep(1000);
        sDincMerge.selectDropdown(sDincMerge.dropdown_destination,Destination);

    }

    @When("^enter title \"([^\"]*)\"$")
    public void enterTitle(String Title) throws InterruptedException {
        //Thread.sleep(2000);
 sDincMerge.sendKeysFunction(sDincMerge.title,Title);

    }

    @When("^enter text message \"([^\"]*)\"$")
    public void enterTextMessage(String Text_message) throws InterruptedException {
       // Thread.sleep(2000);
        sDincMerge.sendKeysFunction(sDincMerge.txt_message,Text_message);

    }

    @When("^click to trimite button$")
    public void clickToTrimiteButton() throws InterruptedException {
        sDincMerge.clickFunction(sDincMerge.btn_message);
        sDincMerge.alertAccept(true);



    }


}
