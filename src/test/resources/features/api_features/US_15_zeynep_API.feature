@US_15_zeynep_API
  Feature: Vice dean should be able to create a student.

    Scenario:Vice dean create student zs
      Given set the url for create a student zs
      And payload zs
      When send a post request zs
      Then verifies status code is 200 zs
      And verifies response body  zs


