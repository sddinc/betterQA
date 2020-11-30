package StepDefinitions;

import Pages.loginPage;
import cucumber.api.java.en.Given;

public class _3_type_a_valid_username {
    loginPage loginPage= new loginPage();

    @Given("^type a valid username$")
    public void typeAValidUsername() {

        loginPage.username.sendKeys("manager3");
        loginPage.userPassword.sendKeys("M1anager3!");
    }
    @Given("^click on login button$")
    public void clickOnLoginButton() {
        loginPage.loginButton.click();
    }

}
