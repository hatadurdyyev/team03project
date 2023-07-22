
@api_test @Check_created_new_lessons_API_TC_01
  Feature:Check_lesson

    Scenario Outline: US8_Get_created_lesson_by_lesson_name
      Given send get request by lesson_name "<lessonName>" to get the lesson schedule
      Then body should contains lesson_name "<lessonName>" , compulsory "<compulsory>", creditScore "<creditScore>"



      Examples:
        | lessonName | compulsory | creditScore |
        |abc3        |true        | 230         |






