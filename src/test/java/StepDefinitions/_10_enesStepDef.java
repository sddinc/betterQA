package StepDefinitions;

import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

public class _10_enesStepDef {


    @Given("^user go to  website \"([^\"]*)\"$")
    public void userGoToWebsite(String url)  {
        Driver.getDriver().get(url);
    }
    @And("^user click to categories$")
    public void userClickToCategories() {





        List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//li[*]/ul[1]/li[*]"));


        for (int i = 1; i <=listOfElements.size(); i++) {

            String menuElements ="(//li[*]/ul[1]/li[*])["+i+"]";
            Driver.waitAndClick(Driver.getDriver().findElement(By.xpath(menuElements)),5);
           // Driver.hover(Driver.getDriver().findElement(By.xpath(menuElements)));

            //String pruductList="(//div[@id='content']//a)[1]";

           // String str1=Driver.getDriver().findElement(By.xpath(pruductList)).getText();
           // System.out.println(str1);
            Driver.getDriver().navigate().back();
            // System.out.println(i+"-"+listOfElements.get(i).getText());

        }






/*

        for (int i = 1; i < 9; i++) {

            List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//li["+i+"]/ul[1]/li[*]"));

            for (int j = 1; j <listOfElements.size() ; j++) {

                String menuElements ="//li["+i+"]/ul[1]/li["+j+"]/a[1]";

                Driver.hover(Driver.getDriver().findElement(By.xpath(menuElements)));
               Driver.scrollToElement(Driver.getDriver().findElement(By.xpath(menuElements)));
               // Driver.waitAndClick(Driver.getDriver().findElement(By.xpath(menuElements)),1);
               // Driver.getDriver().navigate().back();
            }

        }

*/




    }


}
