@all_api
Feature: Deans should be able to create a Vice Dean account.


  @positive_api
  Scenario: TC_01_Dean_creates_Vice_Dean_account_with_all_credentials_api
    And user enters all the credentials under given conditions api
    And verify Vice Dean account created api


  @negative_api
  Scenario: TC_02_Dean_creates_Vice_Dean_account_with_improper_password_credentials_api
    And user enters all the credentials under given conditions but password api
    And verify if Vice Dean account created api