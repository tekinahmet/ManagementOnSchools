@US_04_melik_API
  Feature: Admin should be able to add Dean

    @US_04_Melik_Api_TC01
    Scenario: Admin should be able to add Dean
      Given User sets the Url for Dean Save_MS
      And sets the payLoad for Dean Save_MS
      When sends post request and get response_MS
      Then verify status code_MS is 200
      And verifies response body_MS

      @US_04_Melik_Api_TC02
      Scenario: Verify the Dean account created with Admin
        Given User sets the Url for Dean Get_MS
        And sets the expected Data for Dean Get_MS
        When sends getMethod request and get response_MS
        Then verify status code for getMethod_MS is 200
        And verify response body for getMethod_MS




