@e2e @ui_test @us_03_tc_02_ui
Feature: US_03_TC_02

  Background: send a message
    Given user goes to "https://managementonschools.com/"


  Scenario Outline: send a message
    When user clicks on contact link
    And user enters name "<Name>"
    And user enters email "<Email>"
    And user enter subject "<Subject>"
    And user enter message "<Message>"
    And user click on save message
    Then assert the error alert

    And close application
    Examples:
      | Name | Email           | Subject | Message               |
      | J987 | John123gmailcom | Java    | Learn Java earn money |