Feature: Store

Scenario: Successful store function
	Given user start chrome browser
	When user url  "https://www.urbanladder.com/" in chrome
	And click store option
	Then verify the page title
	And verify the option 
	Then off the browser
	
	