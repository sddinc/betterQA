package StepDefinitions;

import Utilities.Driver;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class _1_navigateSteps {

    WebDriver driver;

    @Given("^navigate to koala$")
    public void navigate_to_koala()   {
        Driver.getDriver().get("https://www.kaolapalace.com/");

        //driver.manage().window().maximize();
    }








    }

