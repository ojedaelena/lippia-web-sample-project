package lippia.web.services;

import junit.framework.Assert;
import lippia.web.constants.ProjectConstants;

import static com.crowdar.core.actions.ActionManager.*;
import static com.crowdar.core.actions.WebActionManager.click;

public class ProjectService {

    public static void createdProject(){
        click(ProjectConstants.PROJECT_BUTTON);
    }

    public static void createdNewProject() {
        click(ProjectConstants.CREATED_PROJECT_BUTTON);
    }

    public static void setProjectName(String projectName) {
        setInput( ProjectConstants.PROJECT_NAME_INPUT, projectName );
    }


    public static void createButton() {
        click(ProjectConstants.CREATE_BUTTON);
    }

    public static void verifyProjectName(String projectName) {
        waitVisibility(ProjectConstants.PROJECT_MENU);
        click(ProjectConstants.PROJECT_MENU);
        setInput(ProjectConstants.PROJECT_INPUT, projectName);
        Assert.assertEquals(projectName, getText(ProjectConstants.PROJECT_NAME_LIST), "El proyecto no se creo");
    }
}
