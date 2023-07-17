@ui_test @all_ui
Feature: Deans should be able to create a Vice Dean account.


  @positive_ui
  Scenario: TC_01_Dean_creates_Vice_Dean_account_with_all_credentials
    And user enters all the credentials under given conditions
    And verify Vice Dean account created
    Then close the application

  @negative_ui
  Scenario: TC_02_Dean_creates_Vice_Dean_account_with_improper_password_credentials
    And user enters all the credentials under given conditions but password
    And verify if Vice Dean account created
    Then close the application