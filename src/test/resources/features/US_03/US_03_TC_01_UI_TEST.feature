@e2e @ui_test
Feature: US_03_TC_1User_Can_Send_Message

  Background: send a message
    Given user goes to "https://managementonschools.com/"


  Scenario Outline: send a message
    When user clicks on contact link
    And user enters name "<Name>"
    And user enters email "<Email>"
    And user enter subject "<Subject>"
    And user enter message "<Message>"
    And user click on save message
    Then validate contact message created successfully alert

    And close application
    Examples:
      | Name | Email             | Subject | Message               |
      | John | John123@gmial.com | Java    | Learn Java earn money |
      | J987 | John123@gmail.com | Java    | Learn Java earn money |