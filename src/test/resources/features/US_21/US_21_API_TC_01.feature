@US_21_TC01_api
Feature:Students choose lesson, grades and announcement
  Scenario Outline:US_21 The student should be able to select the desired lesoon or lessons.
    Given sent getAll request by lessonName "<lessonName>"
    Then   student should be able to see the day "<day>", lesson_name "<lessonName>", start_time "<startTime>", stop Time "<stopTime>" in body
    Examples:
      | lessonName | day    | startTime | stopTime |
      | Flesson    | MONDAY | 15:00:00  | 18:00:00 |

#  {
#    "content": [
#        {
#            "lessonProgramId": 2599,
#            "startTime": "15:00:00",
#            "stopTime": "18:00:00",
#            "lessonName": [
#                {
#                    "lessonId": 2119,
#                    "lessonName": "Flesson",
#                    "creditScore": 5,
#                    "compulsory": true
#                }
#            ],
#            "teachers": [
#
#            ],
#            "students": [
#
#            ],
#            "day": "MONDAY"
#        },