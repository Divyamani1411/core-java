Feature: Duplicate Lead 

Background: 
	Given Chrome browser is opened 
	And Load the application URL as "http://leaftaps.com/opentaps/control/login" 
	And Maximize and Set the timeouts 
	
Scenario Outline: TC004- login with valid Credentials 
	Given Enter username as <username> 
	And Enter password as <password> 
	When Login Button is Clicked 
	And Leads Button is Clicked 
	And Merge Leads is Clicked 
	And Click on Widget of From Contact 
	And windowHandles 
	And First Resulting Contact is Clicked 
	And Widget of To Contact is Clicked 
	And to windowHandles 
	And Second Resulting Contact is Clicked 
	Then Merge button is clicked 
	And Alert is Accepted 
	And Title of Page is Verified 
	And browser is closed 
	
	Examples: 
		|username|password|
		|'Demosalesmanager'|'crmsfa'|
		|'DemoCSR'|'crmsfa'|