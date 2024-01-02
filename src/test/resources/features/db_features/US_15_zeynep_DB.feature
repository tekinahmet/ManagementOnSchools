@US_15_DB

  Feature:Vice dean should be able to create a student. ZS
    Scenario:Verify Registered Student Information ZS
      Given connect databasee ZS
      When Send Query to Retrieve Registered Student Information ZS
      Then verifies registered student information ZS
      And terminate connectionn ZS