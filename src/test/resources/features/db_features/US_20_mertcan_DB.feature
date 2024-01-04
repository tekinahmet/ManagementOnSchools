Feature:Teacher should be create meeting

  Scenario Outline: Test to verify meet created
    Given Take Meet by "<id>"
    Then verify resultSet body id="<id>",date="<date>",description="<description>",start_time ="<start_time>", stop_time="<stop_time>", advisor_teacher_id="<advisor_teacher_id>"
    Examples:
      | id   | date       | description    | start_time | stop_time | advisor_teacher_id |
      | 1020 | 2023-10-26 | Don't be late! | 09:00:00   | 10:00:00  | 1257                   |
