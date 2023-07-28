@e2e  @db_test @us_22_db
Feature: US_22 Add admin
  Scenario Outline: Read created admin data
    Given user connects to the application database for admin account
    And user gets admin data via "<username>"
    Then verify admin db if body contains birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>" , phone_number "<phone_number>" , ssn "<ssn>" , surname "<surname>" , username "<username>"
    Examples:
      | username | birth_day | birth_place | gender | name | phone_number | ssn | surname |
      |admin.admini|1111-11-11 |Administan | 1 |Admin| 333-666-9999 | 466-22-8888 | Admini |