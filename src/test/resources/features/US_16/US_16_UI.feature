@us_16_ui_test @Vice_Dean_deletes_messages
Feature:The Vice Dean should be able to view the messages sent by user

  Background: user_goes_to_google
    Given user goes to "https://managementonschools.com/"
    And user clicks on login link
    And user enters the vice deans "username" and "password"
    And user clicks on the menu button
    And user  clicks Contact Get All button  on the main page

  Scenario: TC01_se_all_messages
    And user views the "Contact Message"
    Then user assert the messages, their authors, emails, sending date and subject information
    Then close the application

  Scenario: TC02_should_delete_messages
    And ses the delete button
    And deletes messages.
    Then logouts page
    Then close the application