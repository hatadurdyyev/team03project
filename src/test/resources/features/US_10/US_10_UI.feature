@US_10
Feature: create_lesson_program


  Background: sign in as Vice Deans

    Given user goes to "https://managementonschools.com/"
    When click on login icon
    And user enters "Ozlem1" for user name
    And user enters "12345678" for password
    And user clicks on login button



  Scenario: TC01_create_a_lesson_schedule
    Given user clicks on Lesson Program
    When user clicks on select lesson dropdown
    And user selects a lesson

    And user clicks on select Choose Education Term dropdown
    And user select a semester
    And  user clicks on select choose day dropdown
    And user select a day
    And user clicks on select Start Time dropdown
    And user select a start time
    And user clicks on select Stop Time dropdown
    And user select a stop time
    And user clicks on Submit button
    And user should see Success Message
    Then close the application