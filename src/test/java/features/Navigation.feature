Feature: TruNarrative Navigation 

#
#Scenario: Finding TruNarrative through Google 
#	Given I run a search for "TruNarrative" on Google
#	And it appears as the first search result 
#	And it points to "https://trunarrative.com/"
#	When I click the first result
#	Then I can view the TruNarrative strap line 
#	

Scenario: Viewing the leadership team from homepage 
	Given I am on the TruNarrative homepage 
	When I click on the link to the TruNarrative Team 
	Then I view "8" leadership team members 
	And the following members have their respective roles: 
		| name           | role                     |
		| John Lord      | Founder & CEO            |
		| David Eastaugh | Chief Technology Officer |
		| Nicola Janney  | Human Resources Manager  |
		
