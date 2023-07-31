US_21_TC0_api
Feature:Students choose lesson, grades and announcement
  Scenario Outline:US_21 Students choose lesson, grades and announcement
    Given sent post request to select the desired lesson or lessons
    Then   student should be able to see the day "<day>", lesson_name "<lessonName>", lessonProgramId "<lessonProgramId>", start_time "<startTime>", stop Time "<stopTime>" in body
    Examples:
      | lessonName | day    | startTime | stopTime |lessonProgramId|
      | English    | MONDAY | 17:08     | 18:20    |2633           |

 # {
 #  "lessonProgramId": 2633,
 #  "startTime": "17:08:00",
 #  "stopTime": "18:20:00",
 #  "lessonName": [
 #  {
 #  "lessonId": 18,
 #  "lessonName": "English",
 #  "creditScore": 7,
 #  "compulsory": true
 #  }