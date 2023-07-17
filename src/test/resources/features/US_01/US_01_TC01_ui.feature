@e2e  @us_01 @us_01_ui_test
  Feature: Prospective students should be able to register in the system.

    Scenario: Register as student
      Given user goes to "https://managementonschools.com/"
      When user clicks on register button
      And user enters username on the register page
      And user enters password on the register page
      And user enters birthplace on the register page
