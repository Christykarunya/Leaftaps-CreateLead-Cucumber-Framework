@Leads #tagname
Feature: leaftaps login functionality

#Background:
#Given Open the Chrome Browser
#And Load the application URL 'http://leaftaps.com/opentaps/'

#first Scenario
@funcional @smoke
Scenario Outline: Test wih positive credential
And Enter Username as <username>
And Enter password as <password>
When Click on Login Button
Then Title should be matching with 'Leaftaps - TestLeaf Automation Platform'

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

#Second Scenario (wrong username)
@functional @regression
Scenario: Test wih negative credential
And Enter Username as 'Demo'
And Enter password as 'crmsfa'
When Click on Login Button
But ErrorMessage should be displayed
