@US_22_fatma_DB
  Feature: US_22 Admin Controller
    Scenario:TC_01 User should find the admin that already created
      When Connected with database FK22
      And Select the admin query already exist FK22
      Then Verify it FK22