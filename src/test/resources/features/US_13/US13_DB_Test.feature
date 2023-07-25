@db_read

  Feature: US_13 Vice Deans should be able to create a teacher.
    Scenario Outline: read_techer_info_created_by_vd_in_db
      Given user connects to the application database
      And user gets the teacher data via "<username>"
      Then verify if body contains birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>" , phone_number "<phone_number>" , ssn "<ssn>" , surname "<surname>" , username "<username>"
      Examples:
        | username | birth_day | birth_place | gender | name | phone_number | ssn | surname |
        |Feiton.Teacheri|11.11.1111 |Frankfurt | 1 |Feiton| 654-987-3215 | 688-65-9849 | Teacheri |
