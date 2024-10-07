@logout
Feature: logout

  @logoutSuccessful @Do
  Scenario: Logout successful
    Given The user is on the landing page
    When The user login with credentials email ojedaelena121@gmail.com and password contraseña123
    And Click on the avatar button
    And Click the 'Log out'
    Then The user verify the login page is displayed