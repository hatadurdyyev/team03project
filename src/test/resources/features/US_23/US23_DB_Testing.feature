@us23db
Feature:Admin should add ViceDean
  Scenario Outline: US23Get Request_and_Assert_DB
    Given send query  by username "<username>"
    Then  verify the resultSet  contains username "<username>" , name "<name>", surname "<surname>", birth_place "<birth_place>", birth_day "<birth_day>", phone_number "<phone_number>", ssn "<ssn>",gender "<gender>"
    Examples:
      | username  | name   | surname | birth_place | birth_day | phone_number | ssn        | gender |
      | QATester1 | Ramazan| OZMEN   | Turkey      |2000-01-01 | 742-312-1234 | 123-45-2981| 0   |