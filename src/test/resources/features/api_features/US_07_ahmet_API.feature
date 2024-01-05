@US_07_ahmet_API
  Feature: Deans should be able to see the messages sent by users.

    Scenario Outline: Deans should be able to view messages, authors, emails, sending dates and subject information.
      Given get all messages with GET REQUEST_07
      Then verify body_07 "<name>", "<email>", "<subject>", "<message>", "<date>"


      Examples: test_data
      |name     |email               |subject             |message                   |date          |
      |ahmet    | itsme@gmail.com    | end of the course  | this is an api test      | 2023-12-25   |
