package lippia.web.steps;

import io.cucumber.java.en.And;
import lippia.web.services.HomeService;

public class HomeSteps {
    @And("Click on the image of the three dots")
    public void clickOnTheImageOfTheThreeDots() {
        HomeService.imageThreeDots();
    }

    @And("Click on 'Manage workspaces'")
    public void clickOnManageWorkspaces() {
        HomeService.manageWorkspaces();
    }

    @And("Click on 'CREATE NEW WORKSPACE' button")
    public void clickOnCREATENEWWORKSPACEButton() {
        HomeService.createNewWorkspaceButton();
    }

    @And("^Set workspace name (.*)$")
    public void setWorkspaceName(String workspaceName) {
        HomeService.setWorkspaceName( workspaceName );
    }


    @And("Click on button 'CREATE'")
    public void clickOnButtonCREATE() {
        HomeService.createButton();
    }


    @And("Click on the avatar button")
    public void clickOnTheAvatarButton() {
        HomeService.avatarButton();
    }
}
