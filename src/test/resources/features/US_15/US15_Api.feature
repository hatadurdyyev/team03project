@US15_Api
Feature: Vice Deans should be able to create a student

  Scenario Outline: US15_ViceDeansStudentByUsername

    Given send the get request by username "<username>"
    Then  body should contains name "<name>", username "<username>", surname "<surname>", birthDay "<birthDay>", birthPlace "<birthPlace>" , phoneNumber "<phoneNumber>" , gender "<gender>", studentNumber "<studentNumber>" , motherName "<motherName>" , fatherName "<fatherName>" , email "<email>" , active "<active>"
    Examples:
      | username | name | surname | birthDay   | birthPlace | phoneNumber  | gender | studentNumber | motherName | fatherName | email             | active |
      | Kaipitt  | Kai  | Piit    | 2000-10-15 | London     | 897-987-9999 | MALE   | 2326          | Alana      | Tom        | Pittkai@gamil.com | true   |