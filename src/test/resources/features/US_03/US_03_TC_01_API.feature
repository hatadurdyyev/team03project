@Api_test @e2e
Feature: US_03_TC_1User_Can_Send_Message(API)

  Scenario Outline: US_03 ContactMessageBySubject

    Given send get request by "<subject>"
    Then  body should contains name "<name>",email "<email>",subject "<subject>",message "<message>", date "<date>"

    Examples:
      | subject | name | email             | message               | date       |
      | Java    | John | John123@gmial.com | Learn Java earn money | 2023-07-11 |





