@all_api
Feature: Students, choose lesson, grades and announcement


  @lessonHeaders_api
  Scenario Outline: TC_01_Student_should_see_all_choose_lesson_headers
    Given sent getAll request by lessonName "<lessonName>"
    Then   student should be able to see the day "<day>", lesson_name "<lessonName>", start_time "<startTime>", stop Time "<stopTime>" in body
    Examples:
      | lessonName | day    | startTime | stopTime |
      | Flesson    | MONDAY | 15:00:00  | 18:00:00 |




  @meeting_api
  Scenario Outline: TC_07_student_should_be_able_to_see_the_meetings
    Given sent get request to see meetings by "<advisorTeacherId>"
    And student should be able to see "<advisorTeacherId>","<description>","<startTime>","<stopTime>","<teacherName>"
    Examples:
      | advisorTeacherId | description | startTime | stopTime | teacherName |
      | 1637             | note        | 14:25:00  | 15:26:00 | jessica     |


