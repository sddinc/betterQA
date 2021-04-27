package StepDefinitions;

import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class _7_StudentSetPassStepDef {


    Pages._7_StudentSetPasswordPage ssPassword =new Pages._7_StudentSetPasswordPage();


    WebDriver driver;

    @Given("^user go to login \"([^\"]*)\"$")
    public void userGoToLogin(String loginLink) {

            Driver.getDriver().get(loginLink);
    }

    @And("^user enter username as  \"([^\"]*)\"$")
    public void userEnterUsernameAs(String val_username)  {
        Driver.waitAndSendText(
                ssPassword.txtLoginUsername,val_username,1);

    }

    @And("^user enter password as \"([^\"]*)\"$")
    public void userEnterPasswordAs(String val_password) {
        Driver.waitAndSendText(ssPassword.txtLoginUserpass,val_password,2);
    }


    @And("user click to sign in button")
    public void userClickToSignInButton() {

        Driver.waitAndClick(ssPassword.btnLogin,2);


    }

    @And("user click to image account to switch secretay")
    public void userClickToImageAccountToSwitchSecretay() {
        Driver.waitAndClick(ssPassword.imgAccount,2);
    }

    @And("user click to secretay link")
    public void userClickToSecretayLink() {
        Driver.waitAndClick(ssPassword.linkSecretary,2);
    }

    @And("user click to students link")
    public void userClickToStudentsLink() {
        Driver.waitAndClick(ssPassword.linkStudents,2);
        Driver.waitAndClick(ssPassword.linkStudents2,2);
    }

    @And("user click to students list link")
    public void userClickToStudentsListLink() {
        Driver.waitAndClick(ssPassword.linkStudentList,2);
    }



    // gmibank.utilities.ExcelUtil excelUtil;




    @And("user enter student name and surname from excel table")
    public void userEnterStudentNameAndSurnameFromExcelTable() throws InterruptedException{

        String path = "./src/main/resources/contact.xlsx";

        Utilities.ExcelUtil excelUtil;
        List<Map<String, String>> testData;
        excelUtil = new Utilities.ExcelUtil(path, "ClassList");
        testData = excelUtil.getDataList();

        for (Map<String, String> appData : testData) {

            Driver.waitAndSendText(ssPassword.txtStudentName,appData.get("Name"),2);
            Driver.waitAndSendText(ssPassword.txtStudentSurname,appData.get("Surname"),2);
            Driver.wait(1);
            Driver.waitAndClick(ssPassword.listFirstElement,2);
            Driver.waitAndClick(ssPassword.btnSetPass,2);
            Driver.wait(1);


            Driver.waitAndSendText(ssPassword.txtNewPass,appData.get("Password"),2);
            Driver.wait(1);
            Driver.waitAndClick(ssPassword.btnSaveNewPass,2);
            Driver.waitAndClick(ssPassword.clickStudentListTab,2);
            ssPassword.txtStudentName.clear();
            ssPassword.txtStudentSurname.clear();

        }



    }


}
