@e2e_US6_OG
  Feature: US6_OG
    Scenario: Dean should be able to add viceDean
      Given user goes to the https://managementonschools.com/ websiteOG
      Then user clicks on Login buttonOG
      And user enters userNameOG
      And user enters passwordOG
      And user clicks loginOG
      Then user clicks menuOG
      And user clicks viceDeanManagementOG
      And user enters "Silverado" in nameBoxOG
      And user enters "Chevrolet" in surnameBoxOG
      And user enters "HighCountry" in birthPlaceBoxOG
      And user selects "Male" as genderOG
      And user enters "04.04.1994" in birthDateBoxOG
      And user enters "654-875-2145" in phoneBoxOG
      And user enters "787-87-1452" in SSNBOXOG
      And user enters "Sierra" in userNameBoxOG
      And user enters "deneME*543" in passwordBoxOG
      Then user clicks on submitButtonOG
      Then user verifies viceDean is createdOG
      And user closes the pageOG

 Scenario: getting info of the saved viceDan
   Given Dean goes to the https://managementonschools.com/ websiteOG
   Then Dean gets the info of the saved viceDean via ID infoOG
   And URL is set for Vice Dean GetManagerById
   And expected data is created for Vice Dean GetManagerById
   When send GET request for Vice Dean GetManagerById and take Response
   Then verify status code is 200 OG
#   And verify Response body for Vice Dean GetManagerById

  Scenario: verifying saved viceDean account infoOG
    Given set the URL OG
    And expected data is created for Vice Dean GetManagerById
    When send GET Request for saved viceDean OG
    Then verify saved viceDean info
    And verify status code is 200 OG
    And close the page

  Scenario: Deleting saved viceDean  account info
    Given Dean goes to the https://managementonschools.com/ websiteOG
    And get viceDean account info by ID
    Then set URL to delete viceDean
    When send DELETE Request and take Response
    Then verify status code is 200 OG









