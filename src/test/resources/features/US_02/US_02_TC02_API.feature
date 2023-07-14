@US02 @US_02_TC02
Feature: US_02_TC02_API Admin should be able to see the Guest User List

  Background: Admin should be able to get guest user list and delete a guest user
    Given https://managementonschools.com/app

  Scenario: Admin should be able to see guest user list and delete a guest user
    Given Admin send a GET request to the URL
    Then HTTP Status Code should be "200"
    And Response content type is "application/json"
    And Response body should be received and id is stored

    And Admin send a DELETE request to the URL
    And HTTP Status Code should be "200" after deleting
    And Body message should be " Guest User deleted Successful"