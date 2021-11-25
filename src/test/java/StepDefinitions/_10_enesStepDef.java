package StepDefinitions;

import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
    public void userClickToCategories() throws InterruptedException {





         List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//div[@id='content']//div//ul//li//a"));



        Thread.sleep(10);
        //Driver.getDriver().findElement(By.className("btn notification-close")).click();
       // Driver.waitAndClick(Driver.getDriver().findElement(By.className("btn notification-close")),2);
       //


        for (int i = 1; i <=listOfElements.size(); i++) {


            String menuElements ="(//div[@id='content']//div//ul//li//a)["+i+"]";
//
//            Actions actions = new Actions(Driver.getDriver());
//            actions.moveToElement(Driver.getDriver().findElement(By.xpath(menuElements)));
//           // actions.click();
//           actions.perform();



            Driver.waitAndClick(Driver.getDriver().findElement(By.xpath(menuElements)),5);
            Driver.scrollToElement(Driver.getDriver().findElement(By.xpath(menuElements)));
            Driver.getDriver().navigate().back();


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
