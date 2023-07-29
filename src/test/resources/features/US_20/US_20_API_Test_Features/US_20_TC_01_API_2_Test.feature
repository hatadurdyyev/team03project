@e2e @api_test @us_20 @us_20_tc_01_02_api_test
Feature: The teacher should be able to update the meetings

  Scenario: The teacher should be able to view and update meetings
    Given send the update request
    When verify the update request