package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.LogInService;

public class TimeTrackerSteps extends PageSteps {


    @Then("The user verifies the time tracker page is displayed")
    public void verifyTheTimeTrackerPageIsDisplayed() {
        LogInService.verifyMessage();
        LogInService.verifyUrl("https://app.clockify.me/tracker#");
    }


}
