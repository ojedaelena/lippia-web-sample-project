package lippia.web.steps;

import io.cucumber.java.en.Then;
import lippia.web.services.ProjectService;
import lippia.web.services.WorkspaceService;

public class WorkspaceSteps {
    @Then("^The user verify workspace name (.*) in Workspaces list$")
    public void theUserVerifyWorkspaceNameInWorkspacesList(String workspaceName) {
        WorkspaceService.verifyWorkspaceName(workspaceName);
    }


}
