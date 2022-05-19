Feature: Contact us

Scenario: Successful check  contact page
	Given user use  browser
	When user url  "https://www.urbanladder.com/" in browser
	Then click contact us
	And verify the contact page title
	Then verify contact page element
	And quit browser