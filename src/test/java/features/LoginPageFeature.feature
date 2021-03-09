Feature: Lanka MIP Login

@Sanity
Scenario Outline:
Given User is on Lanka MIP Platform
When User enters valid <username> and valid <password>
Then User clicks on login button
And User must be successfully logged in

Examples:

| username | password  |
| DA455    | Dialog123!|

@Sanity
Scenario Outline:
Given User is on Lanka MIP Platform
When User enters invalid <username> and valid <password>
Then User clicks on login button
And User must be displayed with appropriate error message

Examples:

| username | password  |
| DA45     | Dialog123!|

@Sanity
Scenario Outline:
Given User is on Lanka MIP Platform
When User enters valid <username> and invalid <password>
Then User clicks on login button
And User must be displayed with appropriate error message

Examples:

| username | password  |
| DA455    | Dialog123 |

@Sanity
Scenario Outline:
Given User is on Lanka MIP Platform
When User enters invalid <username> and invalid <password>
Then User clicks on login button
And User must be displayed with appropriate error message

Examples:

| username | password  |
| DA23     | Dialog123 |

@Sanity
Scenario Outline:
Given User is on Lanka MIP Platform
When User enters valid <username> and valid <password>
Then User clicks on clear button
And login credentials must be cleared

Examples:

| username | password  |
| DA455    | Dialog123!|

Scenario:
Given User is on Lanka MIP Platform
When User click on forgot password link
Then user enters the loginid and submit
And User must succesfully reset the password

