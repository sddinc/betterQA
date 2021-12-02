package StepDefinitions;

import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Array;
import java.util.Arrays;
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
         List<WebElement> imageAdress = Driver.getDriver().findElements(By.xpath("//div[@class='image']//a//div//img"));
         List<WebElement> description = Driver.getDriver().findElements(By.xpath("//div[@class='description']"));
         List<WebElement> price = Driver.getDriver().findElements(By.xpath("//div[@class='price']"));
         List<WebElement> modelNo = Driver.getDriver().findElements(By.xpath("//span[@class='stat-2']//span"));

          Driver.getDriver().findElement(By.xpath("//button[@class='btn notification-close']")).click();
int maxnr=0;

          int arr[]= new int[listOfElements.size()];
        for (int a = 1; a < 3; a++) {
            if(a==29){
                a++;
            }
            String menuElements ="(//div[@id='content']//div//ul//li//a)["+a+"]";
            System.out.println("a="+a);
            Driver.waitAndClick(Driver.getDriver().findElement(By.xpath(menuElements)),5);
            Driver.waitAndClick(Driver.getDriver().findElement(By.cssSelector("button#btn-list-view")),5);
            String limit ="#input-limit";
            Select limitProduct= new Select(Driver.getDriver().findElement(By.cssSelector(limit)));
            limitProduct.selectByVisibleText("100");


            boolean cv= Driver.waitForInVisibility(By.cssSelector("(//h3[@class='title module-title'])[2]"),5);
            Driver.getDriver().findElement(By.xpath("//h3[@class='title module-title'])[2]")).isDisplayed()
            int b=1;
            while(!cv){
              if(cv){
                    Driver.getDriver().navigate().back();
                }

                String productName ="(//div[@class='name']//a)["+b+"]";
                b++;
                System.out.println("b="+b);
                Driver.scrollToElement(Driver.getDriver().findElement(By.xpath(productName)));


        }
            arr[a]=b;
            System.out.println("array index="+arr[a]);
            Driver.getDriver().navigate().back();
        }








        for (int i = 1; i <=3; i++) {
            if(i==29){
                i++;
            }
            String menuElements ="(//div[@id='content']//div//ul//li//a)["+i+"]";
            System.out.println("i="+i);
            Driver.waitAndClick(Driver.getDriver().findElement(By.xpath(menuElements)),5);
            Driver.waitAndClick(Driver.getDriver().findElement(By.cssSelector("button#btn-list-view")),5);
            String limit ="#input-limit";
            Select limitProduct= new Select(Driver.getDriver().findElement(By.cssSelector(limit)));
            limitProduct.selectByVisibleText("100");
            System.out.println("----------"+Driver.getDriver().findElement(By.xpath(" //h1[@class='title page-title']")).getText());


            for (int j = 1; j <=arr[i]; j++) {

                String productName ="(//div[@class='name']//a)["+j+"]";
                String imageAdressLink ="(//div[@class='product-thumb']//div//img)["+j+"]";
                String descriptionList ="(//div[@class='description'])["+j+"]";
                String priceList ="(//div[@class='price'])["+j+"]";
                String modelList ="(//span[@class='stat-2'])["+j+"]";

                System.out.println("j="+j);
               Driver.scrollToElement(Driver.getDriver().findElement(By.xpath(productName)));
                System.out.println(Driver.getDriver().findElement(By.xpath(productName)).getText());
                System.out.println(Driver.getDriver().findElement(By.xpath(descriptionList)).getText());
                System.out.println(Driver.getDriver().findElement(By.xpath(priceList)).getText());
                System.out.println(Driver.getDriver().findElement(By.xpath(modelList)).getText());
               System.out.println(Driver.getDriver().findElement(By.xpath(imageAdressLink)).getAttribute("src"));

            }
            Driver.getDriver().navigate().back();
        }

    }


}
