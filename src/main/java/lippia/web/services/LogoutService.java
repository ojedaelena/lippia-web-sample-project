package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.LogoutConstants;

public class LogoutService {

    public static void theLogOutButton() {
        WebActionManager.click(LogoutConstants.LOGOUT_BUTTON);
    }
}
