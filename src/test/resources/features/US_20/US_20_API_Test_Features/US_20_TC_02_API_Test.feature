@e2e @api_test @us_20 @us_20_tc_02_api_test
Feature: Teacher should be able to delete the meetings

  Scenario: Teacher should be able to delete the meetings
    Given Send the request and get the response
    Then assert the meeting are deleted