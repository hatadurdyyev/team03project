@e2e @ui_test @us_13 @us_ui_test @us_13_tc01
Feature: Vice Deans should be able to create a teacher

  Background: Vice_Dean_is_logging_in
    Given User goes to school page "https://managementonschools.com/"
    When user clicks Login button
    And user enters VD username "US13VD" to the username text box
    And user enters VD password "12345678" to the password text box
    And user clicks on login button

  Scenario: Vice Dean is creating a teacher account
  Given user clicks on Menu button
  And  clicks on Teacher Management
  Then verify if user is on Teacher Management page
  When  Click on Select lesson dropdown
  And Click on any lesson
  Then Verify if a lesson is selected
  When Click on name text field
  And Click on submit button
  Then Verify name is required
  When Click on Surname text field
  And Click on submit button
  Then Verify Surname is required
  When Click on Birthplace text field
  And Click on submit button
  Then Verify Birthplace is required
  When Click on Email text field
  And Click on submit button
  Then Verify Email is required
  When Click on phone number text field
  And Click on submit button
  Then Verify phone number is required
  When Click on Advisor Teacher checkbox
  Then Verify if Advisor Teacher is selected
  When Select a lesson
    And Enter name in the name text field
    And Enter surname in the surname text field
    And Enter birth place in the birthplace text field
    And Enter email in the email text field
    And Enter phone number in the phone number text field
    And Enter date of birth in the date of birth field
    And Enter SSN in the SSN field
    And Enter username in the username field
    And Enter password in the password field
    And Click on submit button
  Then Verify if gender is required
  And Clear all fields
  When Click on date of birth field
  And  Click on submit button
  Then Verify date of birth is required
  When Click on SSN field
  And Click on submit button
  Then Verify if SSN is required
  When Click on SSN field
  And Enter any digit in SSN text field
  Then Verify if minimum eleven characters are required
  And Clear all fields
  When Select a lesson
    And Enter name in the name text field
    And Enter surname in the surname text field
    And Enter birth place in the birthplace text field
    And Enter email in the email text field
    And Enter phone number in the phone number text field
    And Select gender female
    And Enter date of birth in the date of birth field
    And Enter username in the username field
    And Enter password in the password field
    And Enter SSN with the hyphen in wrong place
    And Click on submit button
    Then Verify the SSN error message
  And Clear all fields
  When Click on user name text field
  And Click on submit button
  Then Verify if username is required
  When Click on password text field
  And Enter any character
  Then Verify if at least eight character message appears
#  And Clear all fields
#  When Click on password text field
#  And Enter any password which is not the criteria with minimum eight characters
#  Then Verify password must contain uppercase letters, lowercase letters, and a number.
