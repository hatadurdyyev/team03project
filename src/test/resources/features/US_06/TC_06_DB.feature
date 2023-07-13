@all_db
Feature: Deans should be able to create a Vice Dean account.


  @positive_db
  Scenario Outline: TC_01_Dean_creates_Vice_Dean_account_with_all_credentials_api
    And get vice dean with username "<username>"
    And body contains birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" ,name "<name>" , phone_number "<phone_number>" , ssn "<ssn>" , surname "<surname>" , username "<username>"
    Examples:
      | username        | birth_day  | birth_place | gender | name   | phone_number | ssn         | surname |
      | UserStorypass03 | 2000-01-01 | New Jersey  | 0      | George | 303-703-1019 | 403-03-0853 | White   |


  @negative_db
  Scenario Outline: TC_02_Dean_creates_Vice_Dean_account_with_improper_password_credentials_api
    And get vice dean with usernamef "<usernamef>"
    Examples:
      | usernamef       |
      | UserStoryfail01 |
