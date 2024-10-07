package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LandingConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LandingService {
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickOnLogIn() {
        WebActionManager.click( LandingConstants.BUTTON_LOG_IN );
    }
}
