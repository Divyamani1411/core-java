Feature: Delete Lead

Scenario: login with valid Credentials
Given Chrome browser is opened 
And Load the application URL as "http://leaftaps.com/opentaps/control/login" 
And Maximize and Set the timeouts
Given Enter username
And Enter password
When Login Button is Clicked
And click Leads
And click Find Leads
And Click phone button
And Enter Phone Number
And Find Leads Button is Clicked
And LeadID is clicked
When Delete Button is Clicked
And Again Find leads is Clicked
And Enter LeadID
When Find Leads is clicked
Then Lead is Deleted,No records to displayed
And Close the browser