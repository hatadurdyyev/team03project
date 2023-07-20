@e2e @ui_test @us_20 @us_20_tc_02_ui_test
Feature: The teacher should be able to delete meetings

  Scenario: The teacher should be able to delete meetings
    Given user goes to "https://managementonschools.com/"
    When user clicks on Login button
    And user enters "miles_teacher" to the username text box
    And user enters "milesmiles" to the password text box
    And user clicks on Login button on Login page
    And user clicks on Menu button
    And user clicks on Meet Management button
    And user clicks on delete meeting on one of the meetings
    And assert the action