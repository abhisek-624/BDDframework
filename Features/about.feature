Feature: about us page

Scenario: Successful verify about us page  
	Given  open chrome browser
	When user enter url  "https://www.urbanladder.com/"
	Then click about us option 
	And verify the about page title 
	Then close chrome browser