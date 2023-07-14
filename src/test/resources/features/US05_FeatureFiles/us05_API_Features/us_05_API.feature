@e2e @Api
Feature:Admin should be able to see updated deans Information(API)

  Scenario Outline: US05_Get_updatedDean_by_username
    Given send get request by "<username>" to get the dean
    Then body should contains username "<username>" , name "<name>", surname "<surname>", birth_place "<birth_place>", birth_day "<birth_day>", phone_number "<phone_number>", ssn "<ssn>",gender "<gender>"
    Examples:
      | username  | name   | surname | birth_place | birth_day  | phone_number | ssn         | gender |
      | Jeremy001 | Jeremy | Doe     | London      | 1998-09-13 | 198-182-3914 | 182-32-4621 | FEMALE |

