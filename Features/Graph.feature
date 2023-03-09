Feature: Graph Tab
Background: 
		Given I enter "config_user" and "config_password"
		And I click Login button


  Scenario: Click Graph Get Started button
    Given Click Graph get started button
    And Click Graph Link
    Then User should redirect to Graph Page having try here button
    When User clicks try here button 
    And user redirect to try editor page having run button to test
    And user enter python program "print ('welcome')"
    Then python program print down 
    
    Scenario: Click Graph Get Started button
    Given Click Graph get started button
    And Click Graph Representation Link
    Then User should redirect to Graph Representation Page having try here button
    When User clicks try here button 
    And user redirect to try editor page having run button to test
    And user enter python program "print ('welcome')"
    Then python program print down 