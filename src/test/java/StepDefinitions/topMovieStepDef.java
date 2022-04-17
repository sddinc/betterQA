package StepDefinitions;

import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class topMovieStepDef {
    Pages.topMoviePage topMovie =new Pages.topMoviePage();

    @Given("^User go to site \"([^\"]*)\"$")
    public void userGoToSite(String url)  {
        Driver.getDriver().get(url);
    }

    @And("^user verifies all movie card is dsiplayed$")
    public void userVerifiesAllMovieTitleIsDsiplayed() {
        List<WebElement> movieImageList = Driver.getDriver().findElements(By.xpath("//div[@class='jss89 movie-image']"));
        List<WebElement> movieTitleList = Driver.getDriver().findElements(By.xpath("//h2"));
        List<WebElement> movieDescriptiionList = Driver.getDriver().findElements(By.xpath("//p[@class='jss39 jss48']"));
        List<WebElement> movieMoreList = Driver.getDriver().findElements(By.xpath("//span[@class='jss95']"));

        for (int i = 1; i <movieTitleList.size() ; i++) {
            Assert.assertTrue("Title not Displayed",Driver.getDriver().findElement(By.xpath("(//h2)["+i+"]")).isDisplayed());
            Assert.assertTrue("Image not Displayed",Driver.getDriver().findElement(By.xpath("(//div[@class='jss89 movie-image'])["+i+"]")).isDisplayed());
            Assert.assertTrue("Description  Displayed",Driver.getDriver().findElement(By.xpath("(//p[@class='jss39 jss48'])["+i+"]")).isDisplayed());
            Assert.assertTrue("Button more not Displayed",Driver.getDriver().findElement(By.xpath("(//span[@class='jss95'])["+i+"]")).isDisplayed());

        }
    }

    @And("^user verify movie \"([^\"]*)\" make sure the release date \"([^\"]*)\" is correctly displayed\\.$")
    public void userVerifyMovieMakeSureTheReleaseDateIsCorrectlyDisplayed(String checkMovie, String ReleasedDate)  {
        topMovie.redeptionMovie.click();
        Driver.wait(2);
        Driver.waitForVisibility(topMovie.releasedActual,2);
        System.out.println(topMovie.releasedActual.getText());
        boolean isReleased=topMovie.releasedActual.getText().contains(ReleasedDate);
        Assert.assertFalse("Released date not same",isReleased);// expected is false
        Driver.wait(2);
        topMovie.closeButton.click();
    }

    @And("^user search for \"([^\"]*)\" and make sure that \"([^\"]*)\" is displayed and \"([^\"]*)\" is not displayed$")
    public void userSearchForAndMakeSureThatIsDisplayedAndIsNotDisplayed(String searchForMovie, String displayedMovie, String notDisplayedMovie)  {
        Driver.waitAndSendText(topMovie.searchBox,searchForMovie,2);
        topMovie.searchBox.sendKeys(Keys.ENTER);
        boolean isDisplayedMovie = false;
        boolean isNotDisplayed=true;
        List<WebElement> movieTitleList = Driver.getDriver().findElements(By.xpath("//h2"));
        for (int i = 1; i <movieTitleList.size() ; i++){
             if(Driver.getDriver().findElement(By.xpath("(//h2)["+i+"]")).getText().equalsIgnoreCase(displayedMovie)){
                     isDisplayedMovie =true;
             }
             else if(Driver.getDriver().findElement(By.xpath("(//h2)["+i+"]")).getText().equalsIgnoreCase(notDisplayedMovie)){
                    isNotDisplayed =false;
                }
        }
        Assert.assertTrue("Movie found",isDisplayedMovie);
        Driver.wait(1);
        Assert.assertTrue("Movie not found",isNotDisplayed);

    }


    @Then("^verifies that the movie name \"([^\"]*)\" Released on \"([^\"]*)\" popularity \"([^\"]*)\" vote average \"([^\"]*)\" and vote \"([^\"]*)\"$")
    public void verifiesThatTheMovieNameReleasedOnPopularityVoteAverageAndVote(String movieName, String released, String popularity, String voteAverage, String voteCount){
        Driver.getDriver().get("https://top-movies-qhyuvdwmzt.now.sh/");
        Driver.waitAndClick(topMovie.learnMoreLink,2);
        Driver.wait(2);
        Assert.assertTrue("wrong released",Driver.getDriver().findElement(By.xpath("(//input[@class='jss71 jss73'])[1]")).getAttribute("value").contains(released));
        Assert.assertTrue("wrong released",Driver.getDriver().findElement(By.xpath("(//input[@class='jss71 jss73'])[2]")).getAttribute("value").contains(popularity));
        Assert.assertTrue("wrong released",Driver.getDriver().findElement(By.xpath("(//input[@class='jss71 jss73'])[3]")).getAttribute("value").contains(voteAverage));
        Assert.assertTrue("wrong released",Driver.getDriver().findElement(By.xpath("(//input[@class='jss71 jss73'])[4]")).getAttribute("value").contains(voteCount));
    }


}
