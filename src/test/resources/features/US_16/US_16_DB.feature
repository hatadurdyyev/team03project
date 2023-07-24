@US_16_dataBaseTest
Feature:The Vice Dean should be able to view the messages sent by user

  Scenario Outline: US16_Get_all_sent_messages_by_email
    Given send get all sent messages via email "<email>"
    Then response body contains email "<email>",date "<date>", message "<message>",name  "<name>", subject  "<subject>"

    Examples:
      | email                 | date     | message | name  | subject |
      | deneme123@gmaail.com  |2023-06-12|deneme   |Deneme |Deneme2  |