@ui_test @US25 @US_25_TC01
Feature: US_25_TC01_UI Admin should be able to add Student

  Background: Sign in as an admin
    Given admin goes to "https://managementonschools.com/"
    When admin clicks on login link
    And admin enters username "Project09Admin" and password "12345678"
    And admin clicks on login button


  Scenario: Add student as an admin

    Given admin clicks on menu button
    When admin clicks to the student management link
    And admin selects an advisory teacher
    And admin enters a student name "<name>"
    And admin enters a student surname
    And admin enters a student birthplace
    And admin enters a student email address
    And admin enters a student phone number
    And admin selects a gender
    And admin enters a student Date of Birth
    And admin enters a student SSN
    And admin enters a student username
    And admin enters a student fathername
    And admin enters a student mothername
    And admin enters a student password
    And admin clicks on submit button
    And admin validates the success alert message
    Then close the app