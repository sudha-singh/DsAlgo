@stack
Feature: Stack

Background: The User is logged into DS Algo portal
Given The user is on signin page of DsAlgo portal
When The user enter valid email "Numpysdet84" 
And  The user enter valid password "sdet84batch"
And The user click on login button
Then The user redirected to homepage
 
@stack01
Scenario: The User able to navigate to operation in stack  page
Given The user is in Ds Algo home page
When The user clicks on Get Started tab of stack box
Then The user directed to stack data structure page
When The user click on operation in stack link
Then The user directed to operation in stack page
When The user click on practice question link it navigates to  practice page 
Then The user directed to practice page
When The user click on try here button on operations in stack page
Then The user directed to Try Editor page of operations in stack page having run button to test
When The user enter valid python code in tryEditor 
And The user clicks on run button
Then The user should be getting run result
@stack02
Scenario: The User able to navigate to implementation page
Given The user is in Ds Algo home page
When The user clicks on Get Started tab of stack box
Then The user directed to stack data structure page
When The user click on implementation link
Then The user directed to implementation page
When The user click on try here button on implementation page
Then The user directed to Try Editor page of implementation page having run button to test
When The user enter valid python code in tryEditor 
And The user clicks on run button
Then The user should be getting run result
@stack03
Scenario: The User able to navigate to Application page
Given The user is in Ds Algo home page
When The user clicks on Get Started tab of stack box
Then The user directed to stack data structure page
When The user click on application link
Then The user directed to application page
When The user click on try here button on application page
Then The user directed to Try Editor page of application page having run button to test
When The user enter valid python code in tryEditor 
And The user clicks on run button
Then The user should be getting run result
@stack04
Scenario: The User able to navigate to practice question page
Given The user is in Ds Algo home page
When The user clicks on Get Started tab of stack box
Then The user directed to stack data structure page
When The user click on operation in stack link
Then The user directed to operation in stack page
When The user click on practice question link it navigates to  practice page 
Then The user directed to practice page