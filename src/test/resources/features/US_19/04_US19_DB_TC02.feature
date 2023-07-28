@US19_DB_Test_TC02 @e2e1
Feature:The teacher should be able to see the added meet(DB)

  Scenario Outline: TC02_US19_Get_the_added_meeting_with_a_student

    Given get added meeting via description "<description>" to get all the meetings with students
    Then verify body contains advisor_teacher_id "<advisor_teacher_id>" , description "<description>" , date "<date>" , startTime "<startTime>" , stopTime "<stopTime>"

    Examples:
      | advisor_teacher_id | description    | date       | startTime | stopTime |
      | 1569               | Second meeting | 2023-10-09 | 13:00:00  | 15:00:00 |
