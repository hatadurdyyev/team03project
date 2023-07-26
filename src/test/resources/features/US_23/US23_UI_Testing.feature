@us231
Feature: Admin should be able to add Vice Dean
Scenario: login

    Given The user go to "https://managementonschools.com/"
    When user clicks on login link
    Then The user enter the vice dean’s username
    And  The user enter the vice dean’s password
    And  The user click firstLogin button
    And  The user click  on the menu button
    And  The user click ViceDeanManagement button
    And The admin enter valid name
  And The admin enter valid name
  And The admin enter surname
  And The admin enter Birth Place
  And The admin click gender
  Then The admin enter  date of birth
  And admin enter phone number
  And admin enter ssn
  And admin enter user name
  And admin enter password
  And Admin click submit buton
