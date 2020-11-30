package StepDefinitions;

import Pages.addUserFromPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class _4_addUserSteps {

 addUserFromPage addUserFromPage = new addUserFromPage();

    @Given("^click to  add user button$")
    public void clickToAddUserButton() {
       addUserFromPage.clickFunction(addUserFromPage.AddUserButton);
    }

    @When("^create username to register form$")
    public void createUsernameToRegisterForm() {
       addUserFromPage.sendKeysFunction(addUserFromPage.usernameAdduser,"admin sedat");
    }

    @When("^create password to register form$")
    public void createPasswordToRegisterForm() {
       addUserFromPage.sendKeysFunction(addUserFromPage.passwordAdduser,"Pas1234!");
    }

    @When("^crete email to regfister form$")
    public void creteEmailToRegfisterForm() {
       addUserFromPage.sendKeysFunction(addUserFromPage.emailAdduser,"sedat@gmail.com");
    }

    @When("^create fullname to register form$")
    public void createFullnameToRegisterForm() {
       addUserFromPage.sendKeysFunction(addUserFromPage.fullnameAdduser,"sedat can");
    }

    @When("^crete Phone No to regfister form$")
    public void cretePhoneNoToRegfisterForm() {
       addUserFromPage.sendKeysFunction(addUserFromPage.phoneNoAdduser,"1234567899");
    }

    @When("^create Social Security Number to register form$")
    public void createSocialSecurityNumberToRegisterForm() {
       addUserFromPage.sendKeysFunction(addUserFromPage.ssnAdduser,"123456789");
    }

    @When("^create Driving License to register from$")
    public void createDrivingLicenseToRegisterFrom() {
       addUserFromPage.sendKeysFunction(addUserFromPage.DrivingLicenseAdduser,"B");
    }

    @When("^select country on register form$")
    public void selectCountryOnRegisterForm() {

       addUserFromPage.selectDropdown(addUserFromPage.CountryAdduser,43);

    }

    @When("^create State to register form$")
    public void createStateToRegisterForm() {
    }

    @When("^create Address to register from$")
    public void createAddressToRegisterFrom() {
       addUserFromPage.sendKeysFunction(addUserFromPage.AddressAdduser,"Buca");
    }

    @When("^select Date of Birth on register from$")
    public void selectDateOfBirthOnRegisterFrom() {
       addUserFromPage.clickFunction(addUserFromPage.BirthDateAdduser);
            addUserFromPage.sendKeysFunction(addUserFromPage.BirthDateAdduser,"05/02/1966");
    }

    @When("^create WorkingSector on register from$")
    public void createWorkingSectorOnRegisterFrom() {
       addUserFromPage.sendKeysFunction(addUserFromPage.WorkingSectorAdduser,"IT");
    }

    @When("^select Role on register from$")
    public void selectRoleOnRegisterFrom() {
       addUserFromPage.selectDropdown(addUserFromPage.RoleAdduser,"Customer");
    }

    @When("^select Approved on register from$")
    public void selectApprovedOnRegisterFrom() {
       addUserFromPage.clickFunction(addUserFromPage.approvedAdduser);
    }


   @When("^click on save button$")
   public void clickOnSaveButton() {
       addUserFromPage.clickFunction(addUserFromPage.saveButtonAdduser);
       addUserFromPage.verifyElementContainsText(addUserFromPage.textMessage,"User was inserted successfully");
       addUserFromPage.clickFunction(addUserFromPage.popOKButton);

   }
}
