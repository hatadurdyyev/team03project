@Check_sent_all_messages_API_TC_01
Feature:Check_lesson

  Scenario Outline: US16_Get_all_sent_messages
    Given send get all request by content"<content>" to get all sent messages
    Then body should contains  name"<name>", email"<email>", subject "<subject>", message "<message>",date "<date>"



    Examples:
   | content       | name  | email           | subject |message       | date      |
   |  true         | Ocean | ocean@dut.com   |Lessons  | How ARE YOU  |2023-07-20 |