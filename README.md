#  TruNarrative Automation Framework 

>A Java based UI automation testing framework setup with Maven and Cucumber's behavior driven business logic approach, for running test scripts on Chrome and Firefox.
The tests include navigating to the TruNarrative website and validating various team members. 

## TODO

- Reporting/Logging functionality
- CI/CD Integration
- Adding testing modules (Verification, Fraud, etc)

## User stories

```
As a user 
To find TruNarrative through Google 
I'd like to run a search and view the first result
```

```
As a user 
To ensure I'm on the TruNarrative homepage
I'd like to see the offial strap line
```

```
As a user
To learn about the TruNarrative team
I'd like to view profiles on the Team page
```

## Tech Stack

| Tech | Description |
| ------ | ------ |
| Selenium WebDriver | Web automation framework |
| Cucumber | Automation tool supporting BDD and the Gherkin syntax |
| Maven | Provides version control for dependencies and project file structure |
| TestNG | Testing framework for test case functionality |

## Misc

| Tech | Description |
| ------ | ------ |
| Tidy Gherkin | Browser-based plugin for generating stepDefinitions using Feature steps |

## My approach

- Using Maven to create a filestructure which facilitates Cucumber's BDD syntax
- Adding the correct dependencies for Selenium, JUnit, and Cucumber
- Setting up Chrome and Firefox drivers for multi-browser support
- Writing Feature file (Gherkin syntax) based on MVP requirements
- Creating a testBase class for generic methods and connecting it with data.properties
- Integrating stepDefinitions/Cucumber and TestNG by creating a TestRunner file
- Writing the test cases using Gherkin syntax for business logic
