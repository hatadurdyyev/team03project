@all_ui
Feature: Students, choose lesson, grades and announcement


    @lessonHeaders_ui
    Scenario: TC_01_Student_should_see_all_choose_lesson_headers
      Given student login with username and password
      And student clicks menu button then choose lesson link
      And verify if all choose lesson headers is visible
      Then close the application

    @selectDesiredLesson_ui
    Scenario: TC_02_student_should_be_able_to_select_desired_lessons
      Given student login with username and password
      And student clicks menu button then choose lesson link
      And verify if student is able to select first four and last four lessons
      Then close the application

    @coincideLessons_ui
    Scenario: TC_03_student_shouldn't_be_able_to_select_lessons_same_day_time
      Given student login with username and password
      And student clicks menu button then choose lesson link
      And verify if student is able to select two lessons coincides with same time period
      Then close the application

    @deleteLesson_ui
    Scenario: TC_04_student_should_be_able_to delete_a_lesson
      Given student login with username and password
      And student clicks menu button then choose lesson link
      And student add a lesson
      And verify if student should be able to delete a lesson
      Then close the application

    @programList_ui
    Scenario: TC_05_student_should_be_able_to_see_selected_lessons_in_Program_List
      Given student login with username and password
      And student clicks menu button then choose lesson link
      And verify id student see the selected lessons in Program List
      Then close the application

    @grades_ui
    Scenario: TC_06_student_should_be_able_to_see_exam_grades
      Given student login with username and password
      And student clicks menu button then grades and announcements link
      And verify if grade displayed
      Then close the application

    @meeting_ui
    Scenario: TC_07_student_should_be_able_to_see_the_meetings
      Given student login with username and password
      And student clicks menu button then grades and announcements link
      And verify if meeting displayed
      Then close the application
