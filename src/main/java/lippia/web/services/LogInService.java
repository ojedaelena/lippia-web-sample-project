package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.LogInConstants;

import static com.crowdar.core.actions.ActionManager.isVisible;
import static com.crowdar.core.actions.ActionManager.waitVisibility;

public class LogInService {
    public static void logInManually() {
        WebActionManager.click( LogInConstants.LOGIN_MANUALLY_BUTTON);
    }

    public static void setTheEmail(String email) {
        WebActionManager.setInput( LogInConstants.EMAIL_INPUT, email );
    }

    public static void setThePassword(String password) {
        WebActionManager.setInput( LogInConstants.PASSWORD_INPUT, password );
    }

    public static void buttonLogIn() {
        WebActionManager.click( LogInConstants.LOG_IN_BUTTON );
    }

    public static void verifyMessage() {
        waitVisibility(LogInConstants.TRACKER_MESSAGE);
        Assert.assertTrue(isVisible(LogInConstants.TRACKER_MESSAGE));
    }

    public static void verifyUrl(String url) {
        Assert.assertEquals(url, DriverManager.getDriverInstance().getCurrentUrl(), "URL no coincide");
    }


    public static void verifyMessageLoginPage() {
        waitVisibility(LogInConstants.LOGIN_MANUALLY_MESSAGE);
        Assert.assertTrue(isVisible(LogInConstants.LOGIN_MANUALLY_MESSAGE));
    }

    public static void verifyUrlLoginPage(String url) {
        Assert.assertEquals(url, DriverManager.getDriverInstance().getCurrentUrl(), "URL no coincide");
    }
}
