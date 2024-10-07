package lippia.web.steps;

import io.cucumber.java.en.And;
import lippia.web.services.LogoutService;

public class LogoutSteps {
    @And("Click the 'Log out'")
    public void clickTheLogOut() {
        LogoutService.theLogOutButton();
    }
}
