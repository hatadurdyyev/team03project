@us11_Api
# /* @e2e @api @api_test @us_11 @us_11_api_test */
Feature:Vice Dean should be able to see created lesson information(Api)
  Scenario Outline: US11_Get_created_lesson_by_lesson_name
    Given send get request by lesson_name "<lesson_name>" to get the lesson schedule
    Then body should contains lesson_name "<lesson_name>" , start_time "<start_time>", stop_time "<stop_time>", day "<day>"
    Examples:
      | lesson_name | start_time | stop_time | day      |
      | Java        | 08:37:00   | 08:48:00  | THURSDAY |