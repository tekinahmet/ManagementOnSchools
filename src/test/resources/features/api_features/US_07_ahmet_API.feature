@US_07_ahmet_API
  Feature: Deans should be able to see the messages sent by users.

    Scenario Outline: Deans should be able to view messages, authors, emails, sending dates and subject information.
      Given set the url T
      When send GET request to get all the messages T
      Then verify body T "<name>", "<email>", "<subject>", "<message>", "<date>"
      And status code is 200 T


      Examples: test_data
      |name     |email               |subject             |message                   |date          |
      |ahmet    | itsme@gmail.com    | end of the course  | this is an api test      | 2023-12-25   |
