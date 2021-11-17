package StepDefinitions;

import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;

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




//String []arrMenu={"office","scolar","arta","printing",jukari,hartie,"prezantari"}
//
//        for (int i = 1; i < 8; i++) {
//
//        }

        String office="//header/div[1]/div[3]/div[2]/ul[1]/li["+i+"]/a[1]/span[1]";
        String scolar="//header/div[1]/div[3]/div[2]/ul[1]/li[2]/a[1]/span[1]";
        String arta="//header/div[1]/div[3]/div[2]/ul[1]/li[3]/a[1]/span[1]";
        String printing="//header/div[1]/div[3]/div[2]/ul[1]/li[4]/a[1]/span[1]";

        Driver.hover(Driver.getDriver().findElement(By.xpath(arrMenu[i])));
        Driver.hover(Driver.getDriver().findElement(By.xpath(scolar)));
        Driver.hover(Driver.getDriver().findElement(By.xpath(arta)));
        Driver.hover(Driver.getDriver().findElement(By.xpath(printing)));



    }


}
