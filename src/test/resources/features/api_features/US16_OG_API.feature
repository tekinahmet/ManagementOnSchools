@US16_OG_API
  Feature: Vice Dean should see messages sent by users
    Scenario Outline: US16 Vice Dean should see messages sent by users
      Given ViceDean logs in with existed credentials OG
      And set the URL for post OG
      And create the payload OG
      When send the Request and get the Response OG
      Then Verifying message content: name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"

      Examples: test_data
        | name | email              | subject      | message     | date       |
        | oguz | trialApi@gmail.com | trailMessage | hello world | 2024-01-02 |