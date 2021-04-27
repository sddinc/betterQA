package StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class _9_habilStepDef {
    @Given("^user go to site \"([^\"]*)\"$")
    public void userGoToSite(String site) throws IOException {

        Driver.getDriver().get(site);

        String path = "./src/main/resources/contact.xlsx";

        Utilities.ExcelUtil excelUtil;
        List<Map<String, String>> testData;
        excelUtil = new Utilities.ExcelUtil(path, "HabilProduct");
        testData = excelUtil.getDataList();

        String path2="./src/main/resources/contact.xlsx";

        FileInputStream inputStream= new FileInputStream(path2);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet= workbook.getSheet("HabilProduct");




        for (int i=1;i<2;i++){
            String categoryLink= "(//ul[@class=\'product-categories\'])//li["+i+"]";
            Driver.waitAndClick(Driver.getDriver().findElement(By.xpath(categoryLink)),2);

            for(int x=1;x<21;x++){
                String orderNumber ="(//div[@class='product-info']//span//div)["+x+"]";
                String ahrefLink ="(//div [@class='product-info']//h3//a)["+x+"]";
                String price="(//div [@class='product-info']//span//span)["+x+"]";

                String strOrderNumber=Driver.getDriver().findElement(By.xpath(orderNumber)).getText();
                String strProductName=Driver.getDriver().findElement(By.xpath(ahrefLink)).getText();
                String strPrice= Driver.getDriver().findElement(By.xpath(price)).getText();
                System.out.println(strOrderNumber+"--"+strProductName+"--"+strPrice+"--");

                Row row=sheet.createRow(x);
                Cell cell=row.createCell(i);

                Row row2=sheet.createRow(x+1);
                Cell cell2=row2.createCell(i+1);

                cell.setCellValue(strOrderNumber);
                cell2.setCellValue(strProductName);
                inputStream.close();

                FileOutputStream outputStream=new FileOutputStream(path);
                workbook.write(outputStream);
                outputStream.close();




             //  excelUtil.setCellData(strOrderNumber,i,x);
//                excelUtil.setCellData(strProductName,x,2);
//                excelUtil.setCellData(strPrice,x,3);


            }


            String pageTitle="/html/body/div[1]/div/div/div[1]/div[1]/div[1]/h1";
            System.out.println("---new categoryname: "+Driver.getDriver().findElement(By.xpath(pageTitle)).getText());


        }


    }

    @And("^user click to each category$")
    public void userClickToEachCategory() {


    }
}
