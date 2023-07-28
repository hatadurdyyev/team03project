@ui_test @US04 @US_04_TC01
Feature: US_04_TC01_UI Admin should be able to add Dean

  Background: Sign in as an admin
    Given admin goes to "https://managementonschools.com/"
    When admin clicks on login link
    And admin enters username "Project09Admin" and password "12345678"
    And admin clicks on login button


  Scenario Outline: Add a new Dean with valid information

    Given admin clicks on menu button
    And admin clicks dean management link
    And admin enters dean name "<addDeanName>" to add dean section
    And admin enters dean surname "<addDeanSurname>" to add dean section
    And admin enters dean birthplace "<addDeanBirthPlace>" to add dean section
    And admin selects dean gender "<selectDeanGender>" from add dean section
    And admin enters dean dateofbirth "<addDeanDateOfBirth>" to add dean section
    And admin enters dean phonenumber "<addDeanPhoneNumber>" to add dean section
    And admin enters dean SSN "<addDeanSSN>" to add dean section
    And admin enters dean username "<addDeanUsername>" to add dean section
    And admin enters dean password "<addDeanPassword>" to add dean section
    And admin click submit button
    And admin validates dean saved alert message
    And close the app

    Examples:
      | addDeanName | addDeanSurname | addDeanBirthPlace | addDeanDateOfBirth | selectDeanGender | addDeanPhoneNumber | addDeanSSN  | addDeanUsername | addDeanPassword |
      | John        | Doe            | Toronto           | 01/01/2001         | 1                | 123-123-4358       | 321-12-4358 | johndoe58       | JDoe2001@       |

  Scenario Outline: Add a new Dean with invalid information

    Given admin clicks on menu button
    And admin clicks dean management link
    And admin enters dean name "<addDeanName>" to add dean section
    And admin enters dean surname "<addDeanSurname>" to add dean section
    And admin enters dean birthplace "<addDeanBirthPlace>" to add dean section
    And admin selects dean gender "<selectDeanGender>" from add dean section
    And admin enters dean dateofbirth "<addDeanDateOfBirth>" to add dean section
    And admin enters dean phonenumber "<addDeanPhoneNumber>" to add dean section
    And admin enters dean SSN "<addDeanSSN>" to add dean section
    And admin enters dean username "<addDeanUsername>" to add dean section
    And admin enters dean password "<addDeanPassword>" to add dean section
    And admin click submit button
    And admin validates dean saved alert message
    And close the app

    Examples:
      | addDeanName | addDeanSurname | addDeanBirthPlace | addDeanDateOfBirth | selectDeanGender | addDeanPhoneNumber | addDeanSSN  | addDeanUsername | addDeanPassword |
      |             | Witcher        | Ottawa            | 02.02.2002         | 0                | 123-123-4343       | 321-12-4357 |                 | ottawaW         |
      | Mage        | Witcher        | Montreal          | 01.01.01           | 1                |                    | 321-12-4333 | magewitcher     | magewitcher     |
      | Ris e       | Kings          | ROK               | 01-01-2001         | 0                | 123-123-4343       | 321-12 4344 | ris ekings      | Ris eKings@1    |
      |             |                |                   |                    | 0                |                    |             |                 |                 |