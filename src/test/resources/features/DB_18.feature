@e2e  @db_test @us_18_db
Feature: US_18 update student grade
  Scenario Outline: Read updated student grade data
    Given user connects to the application database for teacher account
    And user gets students data via "<id>"
    Then verify teacher db if body after update contains midtermExam "<midtermExam>" , finalExam "<finalExam>"
    Examples:
      | midtermExam  | finalExam | id |
      | 100          |90      |896 |



