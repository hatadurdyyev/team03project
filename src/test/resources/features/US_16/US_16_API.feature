@Check_sent_all_messages_API_TC_01
Feature:The Vice Dean should be able to view the messages sent by user

  Scenario Outline: US16_Get_all_sent_messages
    Given send get all request by  to get all sent messages
    Then response body should contains "<content>"
    Examples:
      | content |
      |true     |

  #{
  #  "content": [
  #  {
  #  "name": "Dora",
  #  "email": "nathan.jacobi@gmail.com",
  #  "subject": "Pig (programming tool)",
  #  "message": "Taming a Sea Horse",
  #  "date": "2023-07-21"
  #  },
  #  {
  #  "name": "Freddy",
  #  "email": "errol.bogan@gmail.com",
  #  "subject": "xHarbour",
  #  "message": "Specimen Days",
  #  "date": "2023-07-21"
  #  },
  #  {
  #  "name": "Setsuko",
  #  "email": "clarence.abbott@gmail.com",
  #  "subject": "Ring",
  #  "message": "The Waste Land",
  #  "date": "2023-07-21"
  #  },
