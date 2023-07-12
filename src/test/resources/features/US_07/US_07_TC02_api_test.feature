@e2e @api @api_test @us_07 @us_07_api_test
Feature: Get the messages and validate it

  Scenario: Send a get all request
    Given end the request get all
    Then validate the body
