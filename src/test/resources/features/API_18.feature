@us18_Api
Feature: US_18 Add admin

  Scenario Outline: US18_Update_Students_Grade
    Given send get request by id
    Then validate the body after update midtermExam "<midtermExam>" , finalExam "<finalExam>" ,"<id>"
    Examples:
      | midtermExam | finalExam | id |
      |  100.0      |  90.0     | 896 |


