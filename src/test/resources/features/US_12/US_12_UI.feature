@e2e @ui_test @us_12 @us_12_ui_test
Feature: Vice dean should see lesson in lesson list

  Background: Sign in as Vice Dean
    Given user goes to "https://managementonschools.com/"
    When user clicks on Login button
    And user enters "umedyusupov2" to the username text box
    And user enters "Umed54321" to the password text box
    And user clicks on Login button on Login page


  Scenario: Vice Deans should be able to select a teacher for the lesson.
    Given user clicks to Menu
    Then user clicks to lesson management
    And user clicks to lesson program
    And user checks the checkbox for the lesson from the list
    And user chooses a teacher
    And user clicks submit button