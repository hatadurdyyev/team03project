@US_19_UI_TEST @e2e1
Feature:The teacher should be able to add meeting with a student
  Background: Login as a teacher to the web application

    Given teacher goes to "https://managementonschools.com/"
    When teacher clicks on login link
    And teacher enters username "Sumeyra" and password "12345678"
    And teacher clicks on login button

    Scenario Outline: TC01_The teacher should be able to add meeting with a student

      Given teacher clicks on menu button
      When teacher clicks on meet management category button
      And teacher clicks on Select Students dropdown list
      And teacher selects a student from the dropdown list
      And teacher enters future_time "<future_time>" date of meet
      And teacher enters start_time "<start_time>"
      And teacher enters stop_time "<stop_time>"
      And teacher enters a description "<description>" in the description field
      And teacher clicks on submit button
      Then verify the meet saved successfully alert message
      And close the web application
      Examples:
        | future_time | start_time | stop_time | description    |
        | 09/10/2023  | 13:00      | 15:00     | Second meeting |


  Scenario Outline: TC02_The teacher should be able to add meeting with more than one student

        Given teacher clicks on menu button
        When teacher clicks on meet management category button
        And teacher clicks on Select Students dropdown list
        And teacher selects a student from the dropdown list
        And teacher clicks on Select Students dropdown list
        And teacher selects a second student from the dropdown list
        And teacher clicks on Select Students dropdown list
        And teacher selects a third student from the dropdown list
        And teacher enters future_time "<future_time>" date of meet
        And teacher enters start_time "<start_time>"
        And teacher enters stop_time "<stop_time>"
        And teacher enters a description "<description>" in the description field
        And teacher clicks on submit button
        Then verify the meet saved successfully alert message
        And close the web application
    Examples:
      | future_time | start_time | stop_time | description   |
      | 07/11/2023  | 09:00      | 10.00     | First meeting |


  Scenario Outline: TC03_The teacher should NOT be able to add meet in past-time

          Given teacher clicks on menu button
          When teacher clicks on meet management category button
          And teacher clicks on Select Students dropdown list
          And teacher selects a student from the dropdown list
          And the teacher enters a past_time "<past_time>" date for meeting
          And teacher enters start_time "<start_time>"
          And teacher enters stop_time "<stop_time>"
          And teacher enters a description "<description>" in the description field
          And teacher clicks on submit button
          Then verify the must be a future date error alert message is displayed
          And close the web application
    Examples:
      | past_time  | start_time | stop_time | description     |
      | 10/10/2020 | 17:00      | 18:00     | The java lesson |


  Scenario Outline: TC04_The teacher cannot make the start time of the meeting greater than the stop time or equal to the stop time

            Given teacher clicks on menu button
            When teacher clicks on meet management category button
            And teacher clicks on Select Students dropdown list
            And teacher selects a student from the dropdown list
            And teacher enters future_time "<future_time>" date of meet
            And teacher enters grater start_time "<start_time>" than the stop_time
            And teacher enters stop_time "<stop_time>" less than start time
            And teacher enters a description "<description>" in the description field
            And teacher clicks on submit button
            Then verify the error alert message Error: start time must not be greater than or equal to stop time is displayed
            And close the web application
            Examples:
              | future_time | start_time | stop_time | description   |
              | 08/12/2023  | 10:00      | 09:00     | Third meeting |
              | 01/01/2024  | 11:00      | 11:00     | Intro meeting |

