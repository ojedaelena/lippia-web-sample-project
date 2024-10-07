package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;

import static com.crowdar.core.actions.ActionManager.setInput;

public class HomeService {
    public static void imageThreeDots() {
        WebActionManager.click( HomeConstants.THREE_DOTS_IMAGE);
    }

    public static void manageWorkspaces() {
        WebActionManager.click( HomeConstants.MANAGE_LINK);
    }

    public static void createNewWorkspaceButton() {
        WebActionManager.click( HomeConstants.CREATE_WORKSPACE_BUTTON);
    }

    public static void setWorkspaceName(String workspaceName) {
        setInput( HomeConstants.WORKSPACE_NAME_INPUT, workspaceName );
    }


    public static void createButton() {
        WebActionManager.click( HomeConstants.WORKSPACE_BUTTON);
    }

    public static void avatarButton() {
        WebActionManager.click( HomeConstants.AVATAR_BUTTON);
    }

}
