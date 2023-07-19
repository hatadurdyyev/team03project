
Feature: Add admin

  Background: User is logged in as an admin
    Given User goes to school page "https://managementonschools.com/"
    When user clicks Login button
    And user enters VD username "Project09Admin" to the username text box
    And user enters VD password "12345678" to the password text box
    And user clicks on login button

  Scenario: TC_01 "Name" must be entered and cannot be left blank.
    Given user clicks on admin name field
    When user clicks on submit button
    Then user verifies admin name required message

  Scenario: TC_02 "Surname" must be entered and cannot be left blank
    Given user clicks on admin surname field
    When user clicks on submit button
    Then user verifies admin surname required message

  Scenario: TC_03 "Birth Place" must be entered and cannot be left blank.
    Given user clicks on admin birthplace field
    When user clicks on submit button
    Then verify admin birthplace required message

  Scenario: TC_04 Gender must be selected and cannot be left blank.
    Given user enters admin name in the name field
    When user enters admin surname in the surname field
    And user enters admin birthplace in the birthplace field
    And user enters admin date of birth in the date of birth field
    And user enters admin phone number in the phone number field
    And user enters admin SSN in the SSN field
    And user enters admin username in the user name field
    And user enters admin password in the password field
    And user clicks on submit button
    Then verify gender required message

  Scenario: TC_05 Date of birth must be entered and cannot be left blank.
    Given user clicks on admin date of birth field
    When user clicks on submit button
    Then verify admin date of birth required message

  Scenario: TC_06 Phone number must be entered and cannot be left blank.
    Given user clicks on admin phone number field
    When user clicks on submit button
    Then verify phone number required message

  @US_22
  Scenario: TC_07 SSN must be entered and must contain a "-" after the 3rd and 5th digits and must consist of 9 digits in total and cannot be left blank.
    Given user clicks on admin SSN field
    When user clicks on submit button
    Then user verifies SSN required message
    When user enters any digit in admin SSN field
    Then user verifies must enter eleven characters message
    When user enters admin name in the name field
    And user enters admin surname in the surname field
    And user enters admin birthplace in the birthplace field
    And user selects female admin gender
    And user enters admin date of birth in the date of birth field
    And user enters admin phone number in the phone number field
    And user enters admin SSN with the first hyphen in wrong place in the SSN field
    And user enters admin username in the user name field
    And user enters admin password in the password field
    And user clicks on submit button
    Then verify wrong SSN message
    When user enters admin SSN with the second hyphen in wrong place in the SSN field
    And user clicks on submit button
    Then verify wrong SSN message
    When user enters admin SSN with both hyphen in wrong place in the SSN field
    And user clicks on submit button
    Then verify wrong SSN message

  Scenario: TC_08 User Name must be entered and cannot be left blank.
    Given user clicks on admin user name field
    When user clicks on submit button
    Then verify admin user name required message

  Scenario: TC_09 Password can be entered and must consist of at least 8 characters.
    Given user clicks on admin password field
    When user clicks on submit button
    Then user verifies admin password required message
    When user enters any digit in admin password field
    And user clicks on submit button
    Then verify minimum eight character required message

  Scenario: TC_10 Password must contain uppercase letters, lowercase letters, and a number.
    When user enters admin name in the name field
    And user enters admin surname in the surname field
    And user enters admin birthplace in the birthplace field
    And user selects female admin gender
    And user enters admin date of birth in the date of birth field
    And user enters admin phone number in the phone number field
    And user enters admin SSN in the SSN field
    And user enters admin username in the user name field
    And user enters admin password which is not the criteria in the password field
    And user clicks on submit button
    Then verify password error message
