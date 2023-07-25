@us10_Api
Feature:Vice Dean should be able to see created lesson information(Api)
  Scenario Outline: US10_Get_created_lesson_by_lesson_name
    Given send get request by lesson_name "<lesson_name>" to get the lesson schedule
    Then body should contains lesson_name "<lesson_name>" , start_time "<start_time>", stop_time "<stop_time>", day "<day>"
    Examples:
      | lesson_name | start_time | stop_time | day     |
      | Phyton      | 09:09:00   | 17:17:00  | TUESDAY |