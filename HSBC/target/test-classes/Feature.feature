
Feature: Login functionality

Scenario Outline: Login with multiple creds
Given user is on the login page
When User provide the "<username>" and "<Password>"
And User cllick on the Sublit button
Then User should be login to the Amazon

Examples:
		| username | Password |
		| user1		 | Pass@1   |
		| user2		 | Pass@2145|		
		
		
