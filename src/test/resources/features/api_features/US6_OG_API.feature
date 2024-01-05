@US6_OG_API
  Feature: Dean should add ViceDean
    Scenario: Dean Should add ViceDean
      Given Dean logs in with existed credentials
      Then set the URL for post
      And create the payload
      When send the Request and get the Response
      Then do the assertion