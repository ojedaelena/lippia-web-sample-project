@login
Feature: login

  Background:
    Given The user is on the landing page

  @loginSuccessful @Do
  Scenario: Login manually successful
    When The user click on 'Log In'
    And Click on 'Log In manually'
    And Set the email "ojedaelena121@gmail.com"
    And Set the password "contraseña123"
    And Click on 'Log In' button
    Then The user verifies the time tracker page is displayed







