@db_test @US25 @US25_TC02 @dbus25
Feature: Admin should be able to add Student
  Scenario Outline: US25_GetStudent
    Given send the get request by username "<username>"
    Then  body should contains birth_day "<birth_day>",gender "<gender>",name "<name>", phone_number "<phone_number>",ssn "<ssn>" , surname "<surname>" , username "<username>", email "<email>" , father_name "<father_name>" , mother_name "<mother_name>"
    Examples:
      | username | birth_day  | gender | name | phone_number | ssn         | surname | email             | father_name | mother_name |
      | Kaipitt  | 2000-10-15 | 0      | Kai  | 897-987-9999 | 456-67-8976 | Piit    | Pittkai@gamil.com | Tom         | Alana       |