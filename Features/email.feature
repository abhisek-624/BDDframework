Feature: Email verification

Scenario: Successful verify Email
	Given  open  any browser
	When user open url 
	And user enter "abhisekdas.edu@gmail.com"
	Then user clicks on the subscribe button
	And close the brower