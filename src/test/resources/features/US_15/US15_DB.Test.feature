@US15_DB
Feature: Vice Deans should be able to create a student

  Scenario Outline: US_15_GetStudentUser

    Given get student user via username "<username>"
    Then body contains birth_day "<birth_day>",gender "<gender>",name "<name>",phone_number"<phone_number>",ssn "<ssn>",surname"<surname>",username"<username>",email"<email>",father_name"<father_name>",mother_name "<mother_name>"
    Examples:
      | username | birth_day   | gender | name | phone_number | ssn         | surname | email             | father_name | mother_name |
      | Kaipitt  | 15 Oct 2000 | 0      | Kai  | 897-987-9999 | 456-67-8976 | Pitt    | Pittkai@gamil.com | Tom         | Alana       |

