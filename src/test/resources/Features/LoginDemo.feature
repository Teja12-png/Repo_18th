Feature: Test Login Functionality

  Scenario: Check login is succeful with valid credintials
    Given browser is open
    And user is on login page
    When user enters valid username and password
    And user clicks on login
    Then user is navigated to the home page
   
