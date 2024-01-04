@US_04_melik_API
  Feature: Admin should be able to add Dean

    Scenario: Admin should be able to add Dean
      Given User sets the Url for Dean Save_MS
      And sets the payLoad for Dean Save_MS
      When sends post request and get response_MS
      Then verify status code_MS is 200
      And verifies response body_MS




