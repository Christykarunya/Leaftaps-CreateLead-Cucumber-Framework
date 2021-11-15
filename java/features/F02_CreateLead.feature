@Leads #tagname
Feature: leaftaps CreateLead functionality

#Background:
#Given Open the Chrome Browser
#And Load the application URL 'http://leaftaps.com/opentaps/'

#first Scenario
@regression
Scenario: Test wih positive credential
And Enter Username as 'Demosalesmanager'
And Enter password as 'crmsfa'
When Click on Login Button
Then Title should be matching with 'Leaftaps - TestLeaf Automation Platform'
When Click on CRMSFA link

