@Search
Feature: Google Search

  @Smoke @Automated
  Scenario Outline: Search of the client successful
    Given The client is on google page
    When The client search for word <word>
    Then The client verify that results are shown properly

    Examples:
    |            word|
    | Crowdar Academy|
    |         Calidad|
    |        Software|
    |         Testing|



