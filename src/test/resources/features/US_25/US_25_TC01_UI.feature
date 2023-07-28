@ui_test @US25 @US_25_TC01
Feature: US_25_TC01_UI Admin should be able to add Student

  Background: Sign in as an admin
    Given admin goes to "https://managementonschools.com/"
    When admin clicks on login link
    And admin enters username "Project09Admin" and password "12345678"
    And admin clicks on login button


  Scenario Outline: Add student as an admin

    Given admin clicks on menu button
    When admin clicks to the student management link
    And admin selects an advisory teacher
    And admin enters a student name "<name>"
    And admin enters a student surname "<surname>"
    And admin enters a student birthplace "<birthplace>"
    And admin enters a student email address "<email>"
    And admin enters a student phone number "<phone>"
    And admin selects a gender "<gender>"
    And admin enters a student Date of Birth "<dateofbirth>"
    And admin enters a student SSN "<ssn>"
    And admin enters a student username "<username>"
    And admin enters a student fathername "<fathername>"
    And admin enters a student mothername "<mothername>"
    And admin enters a student password "<password>"
    And admin clicks on submit button
    And admin validates the success alert message
    Then close the app
    Examples:
      | name | surname | birthplace | email          | phone        | gender | dateofbirth | ssn         | username   | fathername | mothername | password |
      | Kyle | Johnson | Toronto    | kyle4@kyle.com | 123-123-9334 | 1      | 12-12-2012  | 321-12-9334 | kylejt9334 | kylefather | kylemother | kyle9334 |
      | Kyle | Johnson | Toronto    | kyle4@kyle.com | 123-123-9334 | 1      | 12-12-2012  | 321-12-9334 | kylejt9334 | kylefather | kylemother | kyle9334 |
      |      |         |            |                |              | 0      |             |             |            |            |            |          |