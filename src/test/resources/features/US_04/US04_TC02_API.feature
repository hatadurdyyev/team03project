@api_test @US04 @US_04_TC02
Feature: US_04_TC02_API Admin should be able to add Dean

  Background: Admin should be able to add Dean
    Given https://managementonschools.com/app

  Scenario: Admin should be able to add Dean
    Given Admin send a POST request to the URL
    Then HTTP Status Code should be "200"
    And Response content type is "application/json"
    And Response body should be received and id is stored
    And Body message should be "Dean Saved"
    And Body httpStatus should be "CREATED"