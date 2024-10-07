package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LandingService;
import lippia.web.services.LogInService;

public class LoginSteps extends PageSteps {

    @Given("The user is on the landing page")
    public void theUserIsOnTheLandingPage() {
        LandingService.navegarWeb();
    }

    @When("The user click on 'Log In'")
    public void theUserClickOnLogIn() {
        LandingService.clickOnLogIn();
    }

    @And("Click on 'Log In manually'")
    public void clickOnLogInManually() {
        LogInService.logInManually();
    }

    @And("Set the email {string}")
    public void setTheEmail(String email) {
        LogInService.setTheEmail( email );
    }

    @And("Set the password {string}")
    public void setThePassword(String password) {
        LogInService.setThePassword( password );
    }

    @And("Click on 'Log In' button")
    public void clickOnButtonLogIn() {
        LogInService.buttonLogIn();
    }


    @When("^The user login with credentials email (.*) and password (.*)$")
    public void login(String email, String password) {
        LandingService.clickOnLogIn();
        LogInService.logInManually();
        LogInService.setTheEmail( email );
        LogInService.setThePassword( password );
        LogInService.buttonLogIn();
    }


    @Then("The user verify the login page is displayed")
    public void theUserVerifyTheLoginPageIsDisplayed() {
        LogInService.verifyMessageLoginPage();
        LogInService.verifyUrlLoginPage("https://app.clockify.me/en/login");
    }
}
