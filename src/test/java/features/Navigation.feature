Feature: TruNarrative Navigation


Scenario: Finding TruNarrative on Google
Given that I open a browser and navigate to Google
When I run a search for the keyword TruNarrative
Then the first result points to the TruNarrative website

Scenario: Home page navigation and validation
Given I click on the TruNarrative website link
When User logs in with "John" and password "4321"
Then The strap line is displayed
And Cards displayed is true

Scenario: Team page validation
Given User opens a new browser
And User navigates to Google
When User runs a search for "TruNarrative" 
Then Verify the search term is the first result

Given that I run a Google search for "TruNarrative"
And it appears as the first search result
When I select the link to the homepage
And view the TruNarrative strap line
Then I can navigate to the Team page
And view "8" leadership team members
And that the following members have the respective roles
| Name | Role |
| John Lord | Founder and CEO |
| David Eastaugh | CTO |
| Nicola Janney | Human Resources Manager |

