@workspace
Feature: workspace

  @workspaceSuccessful
  Scenario: Created workspace successful
    Given The user is on the landing page
    When The user login with credentials email ojedaelena121@gmail.com and password contraseña123
    And Click on the image of the three dots
    And Click on 'Manage workspaces'
    And Click on 'CREATE NEW WORKSPACE' button
    And Set workspace name Espacio
    And Click on button 'CREATE'
    Then The user verify workspace name Espacio in Workspaces list