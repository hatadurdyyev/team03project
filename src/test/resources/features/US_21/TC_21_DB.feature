@all_db
Feature: Deans should be able to create a Vice Dean account.




  @programList_db
  Scenario Outline: TC_05_student_should_be_able_to_see_selected_lessons_in_Program_List
    Given get student_lessonprogram via "<student_id>"
    Then body containss "<lesson_program_id>"
    Examples:
      | student_id | lesson_program_id |
      | 7          | 5                 |
      | 7          | 5                 |
      | 7          | 5                 |
      | 7          | 5                 |
      | 7          | 5                 |


  @grades_db
  Scenario Outline: TC_06_student_should_be_able_to_see_exam_grades_db
      Given get grades info via "<student_id>"
      Then body contains "<exam_avarage>"
    Examples:
      | student_id | exam_avarage |
      | 372        | 70           |


  @meeting_db
  Scenario Outline: TC_07_student_should_be_able_to_see_the_meetings
    Given get meeting infos via "<id>"
    Then body contains "<date>", "<description>","<start_time>","<stop_time>","<advisor_teacher_id>"
    Examples:
      | id  | date       | description | start_time | stop_time | advisor_teacher_id |
      | 605 | 2023-12-02 | zorunlu     | 10:00:00   | 23:00:00   | 88                 |





