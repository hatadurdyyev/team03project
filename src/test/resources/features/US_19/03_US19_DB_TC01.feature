@US19_DB_Test_TC01 @e2e1
Feature:The teacher should be able to see the added meet(DB)

  Scenario Outline: TC01_US19_Get_the_added_meeting_with_a_student

    Given get the added meeting via advisor_teacher_id "<advisor_teacher_id>" to get all the meetings with students
    Then verify the body should contain advisor_teacher_id "<advisor_teacher_id>" , description "<description>" , date "<date>" , startTime "<startTime>" , stopTime "<stopTime>"

    Examples:
      | advisor_teacher_id | description   | date       | startTime | stopTime |
      | 1569               | First meeting | 2023-11-07 | 09:00:00  | 10:00:00 |

