@project
Feature: project

  @projectSuccessful
  Scenario: Created project successful
    Given The user is on the landing page
    When The user login with credentials email ojedaelena121@gmail.com and password contraseña123
    And Click on 'Project'
    And Click on 'Create new project'
    And Set project name prueba16
    And Click on 'CREATE' button
    Then The user verify project name prueba16 in project