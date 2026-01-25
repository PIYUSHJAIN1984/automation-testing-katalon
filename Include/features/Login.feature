@tag
Feature: Login Feature

  @tag1
  Scenario Outline: Test Login with valid credentials
    Given User navigate to login page
    When User enter <login> and <password>
    And I click on Login button
    Then user is navigated to registation page

    Examples: 
      | login | password |
      | name1 |        5 |
      | name2 |        7 |
