@e2e @ui_test @us_20 @us_20_tc_01_ui_test
  Feature: The teacher should be able to view and update meetings

    Scenario: The teacher should be able to view and update meetings
      Given user goes to "https://managementonschools.com/"
      When user clicks on Login button
      And user enters "miles_teacher" to the username text box
      And user enters "milesmiles" to the password text box
      And user clicks on Login button on Login page
      And user clicks on Menu button
      And user clicks on Meet Management button
      And user clicks edit button in one of the meetings
      And user chooses a student
      And user changes date of meet
      And user changes start time
      And user changes stop time
      And user changes description
      And user clicks on "Submit" button
      And verify the meeting is changed

