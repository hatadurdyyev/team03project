@US_19_API_Test @e2e1
Feature:The teacher should be able to see the added meet(API)

  Scenario Outline: TC01_US19_Get_the_added_meeting_with_a_student

    Given send getAll request by teacherName "<teacherName>" to get all the meetings with students
    Then verify the body contains teacherName "<teacherName>" , description "<description>" , date "<date>" , startTime "<startTime>" , stopTime "<stopTime>"
    Examples:
      | teacherName | description   | date       | startTime | stopTime |
      | sumeyra     | First meeting | 2023-11-07 | 09:00:00  | 10:00:00 |

  Scenario Outline: TC02_US19_Get_the_added_meeting_with_three_student

    Given send getAll request by teacherName "<teacherName>" to get the meetings with three students
    Then verify the body with teacherName "<teacherName>" , description "<description>" , date "<date>" , startTime "<startTime>" , stopTime "<stopTime>"
    Examples:
      | teacherName | description    | date       | startTime | stopTime |
      | sumeyra     | Second meeting | 2023-10-09 | 13:00:00  | 15:00:00 |