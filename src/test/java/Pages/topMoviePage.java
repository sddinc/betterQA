package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class topMoviePage {
    public topMoviePage()
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='jss95']")
    public WebElement learnMoreLink;

    @FindBy(xpath = "(//span[@class='jss95'])[1]")
    public WebElement redeptionMovie ;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement releasedActual ;

    @FindBy(xpath = "//*[text()='Close']")
    public WebElement closeButton;

}
