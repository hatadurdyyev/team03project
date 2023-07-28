@api_test @US25 @US25_TC02 @apius25
Feature: US25_TC25_API Admin should be able to add Student

  Background: Admin should be able to add Student
    Given https://managementonschools.com/app

  Scenario: Admin should be able to add Student by POST
    Given Admin send a POST request to the URL
    And Response body should be received and saved as actual data
    And Body message should be student saved successfully "Student saved Successfully"
    And Validate the expected data with actual data