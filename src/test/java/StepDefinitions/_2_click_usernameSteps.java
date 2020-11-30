package StepDefinitions;

import Pages.loginPage;
import cucumber.api.java.en.Given;

public class _2_click_usernameSteps {
    loginPage  loginPage= new loginPage();

    @Given("^click login link$")
    public void clickLoginLink() {

        loginPage.clickFunction(loginPage.loginLink);
    }

//    @Given("^click on username textbox$")
//    public void clickOnUsernameTextbox() {
//
//        loginPage.clickFunction(loginPage.username);
//    }


}
