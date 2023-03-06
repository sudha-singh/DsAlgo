Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User is in Sign in Page
    When User enters valid email "Numpysdet84"
    And User enters valid password  "sdet84batch"
    Then Click on Login button to verify
