@US6_Oguz_API
Feature: Dean should create Vice Dean
  Scenario: Dean should add Vice Dean
    Given Dean logs in with existed credentials OG
    Then set the url to post vice dean OG
    And create the payload for vice dean OG
    When send the Request and get the Response_OG
    Then do the assertion OG