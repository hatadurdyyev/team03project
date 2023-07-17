@ui_test @US02 @US_02_TC01
Feature: US_02_TC01_UI Admin should be able to see the Guest User List

  Background: Sign in as an admin
    Given admin goes to "https://managementonschools.com/"
    When admin clicks on login link
    And admin enters username "Project09Admin"
    And admin enters password "12345678"
    And admin clicks on login button


  Scenario: Check the Guest List

    Given admin clicks on menu button
    And admin clicks guest user link
    And admin validates guest user list text on the page
    And admin deletes information on the guest user list
    And close the app