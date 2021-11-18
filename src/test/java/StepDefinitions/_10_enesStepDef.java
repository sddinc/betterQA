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
import java.util.List;
import java.util.Map;

public class _10_enesStepDef {


    @Given("^user go to  website \"([^\"]*)\"$")
    public void userGoToWebsite(String url)  {
        Driver.getDriver().get(url);
    }
    @And("^user click to categories$")
    public void userClickToCategories() {
/*
        String scolar="//header/div[1]/div[3]/div[2]/ul[1]/li[2]/a[1]/span[1]";
        String arta="//header/div[1]/div[3]/div[2]/ul[1]/li[3]/a[1]/span[1]";
        String printing="//header/div[1]/div[3]/div[2]/ul[1]/li[4]/a[1]/span[1]";
        Driver.hover(Driver.getDriver().findElement(By.xpath(scolar)));
        Driver.hover(Driver.getDriver().findElement(By.xpath(arta)));
        Driver.hover(Driver.getDriver().findElement(By.xpath(printing)));
*/

//String []arrMenu={"office","scolar","arta","printing","jukari","hartie","prezantari"};
//  office altindakiler->  //li[3]/ul[1]/li[*]/a[1]
        //1. for webelement size main category
        //2. for webelement size subcategory   /9/2/13/0/3/5/9//
        //[class@='j-menu']//ul[1]//li[2]//a[1]
       // (//div//ul//li[1]//li//a)[4]

        String scolar="//header/div[1]/div[3]/div[2]/ul[1]/li[1]/a[1]/span[1]";
        Driver.hover(Driver.getDriver().findElement(By.xpath(scolar)));
        List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//div//ul//li[1]//li//a"));
        int x=listOfElements.size();

        for (int i = 0; i <x; i++) {
            System.out.println(listOfElements.get(i).getText());

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
