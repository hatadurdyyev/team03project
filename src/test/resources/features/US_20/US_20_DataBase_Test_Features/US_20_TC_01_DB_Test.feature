@e2e @db_test @us_20 @us_20_tc_01_db_test
Feature: Teacher should be able to see the meetings

  Scenario: US_20_TC_01

    Given get all of the meetings
    Then assert the response body