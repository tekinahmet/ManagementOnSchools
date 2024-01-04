@US_05_zeynep_API

  Feature: Admin should be able to see and delete deans

    Scenario: Admin see dean's information zs
      Given user authorized as Admin zs
      And send the request and get the response zs
      Then do assertion zs

      Scenario: Admin send delete request for delete dean zs
        Given admin send post request for creating dean zs
        Then verifies status code is int zs
        And verifies response body zs
        And admin gets id of the dean with username zs
        And admin sets the url fot get dean by id zs
        Then send delete request for delete deans zs


