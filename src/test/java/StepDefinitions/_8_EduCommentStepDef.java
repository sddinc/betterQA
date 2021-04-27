package StepDefinitions;

import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;
import java.util.Map;

public class _8_EduCommentStepDef {
 WebDriver mydriver;

    Pages._7_StudentSetPasswordPage ssPassword =new Pages._7_StudentSetPasswordPage();
    Pages._8_EdCommentsPage putComment =new Pages._8_EdCommentsPage();


    WebDriver driver;

    @And("^user click to image account to switch teacher$")
    public void userClickToImageAccountToSwitchTeacher() {

        Driver.waitAndClick(ssPassword.imgAccount,1);
        Driver.wait(2);
        Driver.waitAndClick(putComment.linkTeacher,1);
    }

    @And("user click to link recordbook")
    public void userClickToSecretayLinkRecordbook() {


        Driver.wait(2);
        Driver.waitAndClick(putComment.linkRecordBook,1);
        Driver.wait(2);
        Driver.waitAndClick(putComment.linkComments,1);

        Driver.wait(2);
        Driver.waitAndClick(putComment.linkTermComment,1);
    }

    @And("user click to termcomment")
    public void userClickToStudentsLinkTermcommentt() {
        Driver.waitAndClick(putComment.linkTermComment,2);
    }

    @And("^user select to dropdown$")
    public void userSelectToDropdown() {
        Driver.waitAndClick(putComment.dropdownList,2);
        Driver.waitAndClick(putComment.clasa7,2);
        Driver.waitAndClick(putComment.radioSem1,1);



    }

    @And("^user enter to commentBox$")
    public void userEnterToCommentBox() {
    }

    @And("^user clcik to sevaComment$")
    public void userClcikToSevaComment() {

    }




    @And("user enter comment excel table")
    public void userEnterStudentNameAndSurnameFromExcelTable() throws InterruptedException{

        String path = "./src/main/resources/contact.xlsx";

        Utilities.ExcelUtil excelUtil;
        List<Map<String, String>> testData;
        excelUtil = new Utilities.ExcelUtil(path, "Sheet1");
        testData = excelUtil.getDataList();

        int i=0;

        for (Map<String, String> appData : testData) {
           i=i+1;

            String strlist = "(//*[text()='7 A'])["+i+"]";
            String categoryLink= "(//ul[@class=\'product-categories\'])//li["+i+"]";

            Driver.waitAndClick(Driver.getDriver().findElement(By.xpath(strlist)),2);
            Driver.wait(1);
            putComment.commnetBox.clear();
            ///////   female   //////
            if(appData.get("Mark").equals("10.0")&&appData.get("Gender").equals("Female"))
                Driver.waitAndSendText(putComment.commnetBox,appData.get("Comment_3"),2);


            if(appData.get("Mark").equals("9.0")&&appData.get("Gender").equals("Female"))
                Driver.waitAndSendText(putComment.commnetBox,appData.get("Comment_2"),2);

            if((appData.get("Mark").equals("8.0")||appData.get("Mark").equals("7.0")) &&appData.get("Gender").equals("Female"))
                Driver.waitAndSendText(putComment.commnetBox,appData.get("Comment_1"),2);
            ///// Male ///////

            if(appData.get("Mark")=="10.0"&&appData.get("Gender")=="Male")
                Driver.waitAndSendText(putComment.commnetBox,appData.get("Comment_6"),2);

            if(appData.get("Mark").equals("9.0")&&appData.get("Gender").equals("Male"))
                Driver.waitAndSendText(putComment.commnetBox,appData.get("Comment_5"),2);

            if((appData.get("Mark").equals("8.0")||appData.get("Mark").equals("7.0")) &&appData.get("Gender").equals("Male"))
                Driver.waitAndSendText(putComment.commnetBox,appData.get("Comment_4"),2);





            Driver.wait(1);
            Driver.waitAndClick(putComment.btnSaveComment,1);

        }
    }



}
