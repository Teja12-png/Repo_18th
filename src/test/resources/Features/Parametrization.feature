Feature: Test Login Functioanality

  Scenario Outline: Check login is successfully with valid credintials
    Given browser is opened
    And user is on login page
    When user enters <username> and <password>
    And user click on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin123 |
