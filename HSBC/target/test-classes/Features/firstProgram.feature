	
Feature: Application Login
Scenario: Admin login default page
Given User is on the netbanking page
When User login into application user "Snakhate" Pass "1124"
Then Home page is displayed
And Cards are dispayed 

Scenario Outline: Admin login default page
Given User is on the netbanking page
When User login into application user "<Username>" Pass "<Password>"
Then Home page is displayed
And Cards are dispayed 

Examples:
|Username | Password |
|carduser | 2145			|
|debituser | 5875    |