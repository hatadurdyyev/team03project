@e2e @ui_test @us_07 @us_07_ui_test
  Feature: US_07_Deans_can_see_messages

    Background: Sign in as Dean
      Given user goes to "https://managementonschools.com/"
      When user clicks on Login button
      And user enters "miles" to the username text box
      And user enters "milesmiles" to the password text box
      And user clicks on Login button on Login page


      Scenario: Look at the messages
        Given user clicks on Menu button
        When user clicks on Contact Get All button
        And close the app