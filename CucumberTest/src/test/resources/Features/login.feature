Feature: Feature to test login functionality

#Scenario: Check login is successful with valid credentials
#
#Given User is on login page
#When user enters username and password
#And clicks on the login button
#Then user is navigated to the home page

Scenario Outline: Check login is successful with valid credentials

Given User is on login page
When user enters "<username>" and "<password>"
And clicks on the login button
Then user is navigated to the home page

Examples:
|username|password|
|student|Password123|
|stu|password|
