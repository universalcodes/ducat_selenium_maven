@validLoginTC1
Feature:  Login Testcases set
Background: Verify user must have valid Credentails
Scenario: User is able to login into Application
Given Open Application & Enter URL
#And User Takes Screenshot
When User Enter valid Username
#And User Takes Screenshot
And User Enters Valid Password
#And User Takes Screenshot
And User clicked on Login Button 
#And User Takes Screenshot
Then User is Logged into Application Successfully


