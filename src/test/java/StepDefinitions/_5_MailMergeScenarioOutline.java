package StepDefinitions;

import Pages.SDincMerge;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class _5_MailMergeScenarioOutline {

    SDincMerge sDincMerge = new SDincMerge();
 WebDriver driver;
    @Given("^navigate to sdinc$")
    public void navigateToSdinc() {

        Driver.getDriver().get("http://www.sdinc.xyz/meet/login.php");
        //driver.get("http://www.sdinc.xyz/meet/login.php");
    }

    @Given("^enter username as \"([^\"]*)\"$")
    public void enterUsernameAs(String arg0) {
        sDincMerge.sendKeysFunction(sDincMerge.txt_username,"volkan");

    }

    @Given("^enter password as \"([^\"]*)\"$")
    public void enterPasswordAs(String arg0) {
        sDincMerge.sendKeysFunction(sDincMerge.txt_password,"123456");
    }

    @Given("^click to authentifica$")
    public void clickToAuthentifica() {
        sDincMerge.clickFunction(sDincMerge.btn_submit);

    }

    @When("^click to message box and trimite$")
    public void clickToMessageBoxAndTrimite() throws InterruptedException {
        Thread.sleep(3000);
        sDincMerge.clickFunction(sDincMerge.img_messageBox);
        sDincMerge.clickFunction(sDincMerge.link_trimite);
    }





    @When("^select  \"([^\"]*)\"$")
    public void select(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        sDincMerge.selectDropdown(sDincMerge.dropdown_destination,"Destination");

    }

    @When("^enter title \"([^\"]*)\"$")
    public void enterTitle(String arg0) throws InterruptedException {
        Thread.sleep(2000);
 sDincMerge.sendKeysFunction(sDincMerge.title,"Title");

    }

    @When("^enter text message \"([^\"]*)\"$")
    public void enterTextMessage(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        sDincMerge.sendKeysFunction(sDincMerge.txt_message,"Text_message");

    }

    @When("^click to trimite button$")
    public void clickToTrimiteButton() {
        sDincMerge.clickFunction(sDincMerge.btn_message);


    }


}
