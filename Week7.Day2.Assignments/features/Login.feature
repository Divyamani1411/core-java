Feature: Create Lead 

Background: Create 
	Given Chrome browser is opened 
	And Load the application URL as "http://leaftaps.com/opentaps/control/login" 
	And Maximize and Set the timeouts 
	
Scenario: tc001 - login with valid Credentials

	Given Enter username as "Demosalesmanager" 
	And Enter password as "crmsfa" 
	When Login Button is Clicked 
	And click Leads 
	And click Create Lead 
	And Enter Company Name 
	And Enter First Name 
	And Enter Last Name 
	When Create Lead Button is Clicked 
	Then Close the browser 

Scenario Outline: TC002-login with multiple valid Credentials

	And Enter username as <username> 
	And Enter password as <password> 
	When Login Button is Clicked 
	And click Leads 
	And click Create Lead 
	And Enter Company Name 
	And Enter First Name 
	And Enter Last Name 
	When Create Lead Button is Clicked 
	Then Close the browser 
	
	Examples: 
		|username|password|
		|'Demosalesmanager'|'crmsfa'|
		|'DemoCSR'|'crmsfa'|