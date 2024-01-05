@DB_US19
Feature: Validate the meeting Created
  Scenario Outline: Validate if the meeting Created successfully
    Given Set connection to DATABASE_us19SY
    And Gets the column "*" from the table "meet" SY
    Then verify table "<table_name>" and column "<column_name>" contains data "<data_name>" SY
    Examples: data
      | table_name | column_name | data_name  |
      | meet       | id          | 1914       |
      | meet       | date        | 2024-02-01 |
      | meet       | description | importante |
      | meet       | start_time  | 01:00      |
      | meet       | stop_time   | 02:00      |

#        payload = new CreateMeeting("2024-02-01", "important", "01:00", "02:00", 2697);
