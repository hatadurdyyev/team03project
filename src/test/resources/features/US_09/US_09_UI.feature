@US_09_UI
Feature: Vice Deans should be able to view the lesson list and make updates
  Background: Sign in ManagementSchool
    Given The user go to "https://managementonschools.com/"
    When user clicks on login link
    Then The user enter the vice dean’s username
    And  The user enter the vice dean’s password
    And  The user click firstLogin button
    And  The user click  on the menu button
    And The user  click Lesson Management on the main page
    And  The user click Lessons

  Scenario:TC01_Vice Deans should be  able to view the lesson list ,compulsory and credit score created
    Given The user view Lesson Name,Compulsory and Credit Score
    And The user close the page


  Scenario:TC02_Vice Deans should be  able to delete the lesson
    Given   The user click delete button
    And The user close the page


  Scenario:TC03_Vice Dean should be able to update the lesson information
    Given The user click first lesson
    And The user close the page