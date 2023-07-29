@e2e @db_test @us_17 @us_17_tc_01_db_test
Feature: The teacher should be able to give grades to the students.
  Scenario: US_17_TC_DB
    Given send to the database request
    Then verify the database body