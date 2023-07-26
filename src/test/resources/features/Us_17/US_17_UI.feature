@US_17_UI
Feature:The teacher should be able to give grades to the students.(Add Student Info)
  Background: Login as a teacher to the web application

    Given teacher goes to "https://managementonschools.com/"
    When teacher clicks on login link
    And teacher enters username "serenteacher" and password "12345678"
    And teacher clicks on login button
    And teacher clicks on menu button
    And teacher clicks on student info management  button


  Scenario: TC01_The lesson, student and semester should be selectable.

    Given teacher clicks on the select Choose lesson dropdown
    And teacher selects a Lesson from the Select Lesson input
    And teacher clicks on the Choose Student dropdown
    And teacher selects a student from the Select Students input
    And teacher clicks on the Choose Education Term dropdown
    And teacher selects a term from the Education Term dropdown
    And the teacher clicks on the Absentee
    And the teacher enters absentee
    And the teacher clicks on the Midterm Exam field.
    And the teacher enters the grade to Midterm Exam field.
    And the teacher clicks on Final Exam field.
    And the teacher enters the grade to Final Exam field.
    And the teacher clicks on Info Note
    And the teacher enters an info note in the Info Note field
    And the teacher clicks on submit button
    Then verify the success message "Student Info saved Successfully" is displayed
