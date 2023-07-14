@e2e @us05_DB
Feature: Admin should be able to update Deans Information

  Scenario Outline: : US05_GetTheUpdatedDean

    Given get the updated dean via "<username>"
    Then body will contains birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>" , phone_number "<phone_number>" , ssn "<ssn>" , surname "<surname>" , username "<username>"

    Examples:
      | username  | birth_day  | birth_place | gender | name   | phone_number | ssn         | surname |
      | Jeremy001 | 1998-09-13 | London      | 1      | Jeremy | 198-182-3914 | 182-32-4621 | Doe     |

