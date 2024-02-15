Feature: Sending CV on Career page of RoofStacks Website.

  Scenario: Send CV
    Given user goes to the google home page
    When user enters "Roof Stack Yazılım" into the search box and hit the enter
    And clicks "https://roofstacks.com" link from result list
    And clicks the "CAREER" page link
    And clicks Open Positions under "RoofStacks" title
    And clicks "RoofStacks" tab
    And clicks View Job button near the "Senior Mobile Developer"
    Then user sees "Senior Mobile Developer" title of page
    When user clicks apply button
    And enter full name "fullName", email address "emailAddress" and phone number "phoneNumber"
    And upload a sample CV or resume
    And clicks send button
    Then user sees "All done!" message