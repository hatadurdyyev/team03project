@e2e @us_22_api @api_test
Feature: US_22 Add admin

  Scenario Outline: US22_GetAdminByUsername
    Given send get request by admin
    Then body should contain admin birth_day "<birthDay>" , birth_place "<birthPlace>" , gender "<gender>" , name "<name>" , phone_number "<phoneNumber>" , ssn "<ssn>" , surname "<surname>" , username "<username>"
    Examples:
      | username | birthDay | birthPlace | gender | name | phoneNumber | ssn | surname |
      |admin.admini|1111-11-11|Administan|FEMALE|Admin|333-666-9999|466-22-8888|Admini|