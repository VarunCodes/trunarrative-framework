Feature: TruNarrative Navigation 


Scenario: Finding TruNarrative through Google 
	Given I run a search for "TruNarrative" on Google
	And it appears as the first search result 
	When I select the link to the homepage 
	Then I can view the TruNarrative strap line 
	
Scenario: Viewing the leadership team from homepage
	Given I click on the link to the TruNarrative Team
	When I view "8" leadership team members 
	Then that the following members have their respective roles
#		| name           | role                    |
#		| John Lord      | Founder and CEO         |
#		| David Eastaugh | CTO                     |
#		| Nicola Janney  | Human Resources Manager |
		