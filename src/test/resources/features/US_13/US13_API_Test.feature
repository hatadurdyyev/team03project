@api_test @e2e @US13_API
Feature: Vice Deans should be able to create a teacher.

  Scenario Outline: US13_GetTeacherByUsername
    Given send get request by username "<username>"
    Then body should contain birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>" , phone_number "<phone_number>" , ssn "<ssn>" , surname "<surname>" , username "<username>"

    Examples:
      | username  | birth_day  | birth_place | gender | name   | phone_number | ssn         | surname |
      | Feiton.Teacheri | 1111-11-11 | Frankfurt | FEMALE | Feiton | 654-987-3215 | 688-65-9849 | Teacheri |