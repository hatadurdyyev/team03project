<<<<<<< HEAD
@Api_test @e2e
=======
@api_test @e2e @US_03_API
>>>>>>> main
Feature: US_03_TC_1User_Can_Send_Message(API)

  Scenario Outline: US_03 ContactMessageBySubject

<<<<<<< HEAD
    Given send get request by "<subject>"
=======
    Given send get request by subject "<subject>"
>>>>>>> main
    Then  body should contains name "<name>",email "<email>",subject "<subject>",message "<message>", date "<date>"

    Examples:
      | subject | name | email             | message               | date       |
      | Java    | John | John123@gmial.com | Learn Java earn money | 2023-07-11 |
<<<<<<< HEAD





=======
>>>>>>> main
