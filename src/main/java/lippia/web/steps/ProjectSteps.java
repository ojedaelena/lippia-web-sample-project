package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.LogInService;
import lippia.web.services.ProjectService;

public class ProjectSteps {
    @And("Click on 'Project'")
    public void clickOnProject() {
        ProjectService.createdProject();
    }

    @And("Click on 'Create new project'")
    public void clickOnCreateNewProject() {
        ProjectService.createdNewProject();
    }

    @And("^Set project name (.*)$")
    public void setProjectName(String projectName) {
        ProjectService.setProjectName( projectName );
    }


    @And("Click on 'CREATE' button")
    public void clickOnCREATEButton() {
        ProjectService.createButton();
    }

    @Then("^The user verify project name (.*) in project$")
    public void theUserVerifyProjectNameInProject(String projectName) {
        ProjectService.verifyProjectName(projectName);
    }
}
