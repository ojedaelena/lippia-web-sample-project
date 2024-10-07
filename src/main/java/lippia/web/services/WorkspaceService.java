package lippia.web.services;

import junit.framework.Assert;
import lippia.web.constants.WorkspaceConstants;

import static com.crowdar.core.actions.ActionManager.*;

public class WorkspaceService {
    public static void verifyWorkspaceName(String workspaceName) {
        waitVisibility(WorkspaceConstants.WORKSPACE_NAME_LIST);
        Assert.assertEquals(workspaceName, getText(WorkspaceConstants.WORKSPACE_NAME_LIST), "El espacio de trabajo no se creo");
    }




}
