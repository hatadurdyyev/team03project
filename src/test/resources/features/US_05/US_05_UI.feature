@e2e @ui_test @dean_mng_login
Feature: admin_goes_to_dean_management_page_to_edit_dean_information

  Background:Admin goes to the home page
  Scenario: admin_goes_to_login_page
    Given admin navigates to url "https://managementonschools.com/"
    When admin clicks to login icon
    And admin enters username "Project09Admin" and password "12345678"
    And admin click to login button

  Scenario Outline:TC02_admin_should_update_deans
    Given admin clicks menu button
    When admin clicks dean management option
    And admin clicks on edit button
    And admin enters dean name "<deanName>"
    And admin enters dean surname "<deanSurname>"
    And admin enters dean birthplace "<deanBirthPlace>"
    And admin selects dean gender
    And admin enters dean dateofbirth "<deanDateOfBirth>"
    And admin enters dean phonenumber "<deanPhoneNumber>"
    And admin enters dean SSN "<deanSSN>"
    And admin enters dean username "<deanUsername>"
    And admin enters dean password "<deanPassword>"
    And admin clicks submit button in edit page
    Then assert "Dean Successfully Updated" message displayed
    And admin clicks on cross sign
    And close the website

    Examples:
      | deanName | deanSurname | deanBirthPlace | deanDateOfBirth | deanPhoneNumber | deanSSN     | deanUsername | deanPassword |
      | Jeremy   | Doe         | London         | 13/09/1998      | 198-182-3914    | 182-32-4621 | Jeremy001    | 12345678     |