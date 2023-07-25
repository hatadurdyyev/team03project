@US_18
Feature: update_students_grade
  #Background: sign in as a teacher
  Scenario: TC01_check_the_student_info_list3

    Given user navigates to the "https://managementonschools.com/"
    When click on the login icon
    And user enters the "alade" for user name
    And user enters the "12345678" for password
    And user clicks on the login button

  Scenario: TC01_check_the_student_info_list
    Given user checks if name,Lesson Name,Absentee,Midterm,Final Exam,Note,Info Note,Average exist in the student info list


  Scenario: TC02_update_the_student_grade_information

    Given user should be able to click on Edit Button in the student info list
    When user should be able to update the grade in Midterm Exam
    And user should be able to update the grade in Final Exam
    And user should be able to click on Submit button

#  Scenario: TC03_delete_the_student_grade_information

   # Given user should be able to click on Edit Button in the student info list
  #  When user should be able to delete the grade in Midterm Exam
   # And user should be able to delete the grade in Final Exam
    #And user should be able to click on Submit button

