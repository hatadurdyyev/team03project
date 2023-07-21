@us_8_ui_test @Vice_Dean_Add_Lesson
Feature: search_feature

  Background: user_goes_to_google
    Given user goes to "https://managementonschools.com/"
    And user clicks on login link
    And user enters the vice deans "username" and "password"
    And user clicks on the menu button
    And user  selects Lesson Management on the main page
    And user clicks Lessons button

  Scenario: TC01_add_new_lesson
    And user enters the lessonName and creditScore
    And user marks whether the course is compulsory or not
    When user clicks the Submit button
    Then validate lesson created alert
    Then close the application

Scenario: TC02_using_invalid_characters_in_lessonAddition
  And user enters the lessonName as number and special character and creditScore
  And user marks whether the course is compulsory or not
  When user clicks the Submit button
  Then assert the success alert is not displayed
  Then close the application


  Scenario: TC03_using_numbers_other_than_between_0-500_onThe_lesson_CreditScore
    And user enters the lessonName and creditScore as other than numbers between zero and five hundred
    And user marks whether the course is compulsory or not
    When user clicks the Submit button
    Then assert the success alert is not displayed
    Then close the application


