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
         List<WebElement> listOfproduct = Driver.getDriver().findElements(By.xpath("//div[@class='name']//a"));

    //    Thread.sleep(10);
//50 left side nr of the products
        Driver.getDriver().findElement(By.xpath("//button[@class='btn notification-close']")).click();
        for (int i = 1; i <=10; i++) {
            String menuElements ="(//div[@id='content']//div//ul//li//a)["+i+"]";
            Driver.waitAndClick(Driver.getDriver().findElement(By.xpath(menuElements)),5);


            System.out.println("-----------------------"+Driver.getDriver().findElement(By.xpath(" //h1[@class='title page-title']")).getText());
            for (int j = 1; j <=5; j++) {
                String productName ="(//div[@class='name']//a)["+j+"]";


                System.out.println(Driver.getDriver().findElement(By.xpath(productName)).getText());

            }
            Driver.getDriver().navigate().back();

        }

    }


}
