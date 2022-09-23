Feature: Duplicate Lead 

Background: 
	Given Chrome browser is opened 
	And Load the application URL as "http://leaftaps.com/opentaps/control/login" 
	And Maximize and Set the timeouts 
	
Scenario Outline: TC004- login with valid Credentials 
	Given Enter username as <username> 
	And Enter password as <password> 
	When Login Button is Clicked 
	And click Leads 
	And click Find Leads 
	And Click phone button 
	And Enter Phone Number 
	And Find Leads Button is Clicked 
	When Duplicate Lead Button is Clicked 
	Then Update Button is Clicked,View Lead is Displayed 
	And Close the Browser 
	
	Examples: 
		|username|password|
		|'Demosalesmanager'|'crmsfa'|
		|'DemoCSR'|'crmsfa'|