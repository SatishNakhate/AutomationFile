
Feature: Application Login
Scenario: Default Login Page

Given User on netbanking page
When User login into Application with "admin" and password "1245"
Then Home page is display  
Then Cards are displayed 
 
#Reusable

Scenario: User Login Page

Given User on netbanking page
When User login into Application with "user" and password "0214"
Then Home page is display  
Then Cards are displayed 

#here we can reuse the code 
#But if we use same code multiple time it will show a confusion  
#so avoid that confusion we used on more annotation i.e. outline
#Outline help you to execute code agian and again
#we need to do parameterization <>

 
Scenario Outline: User Login Page

Given User on netbanking page
When User login into Application with "<username>" and password "<password>" 
Then Home page is display  
Then Cards are displayed  

Examples: 
| username | password |
| debituser| 12458		|
| credituser| 58784		|

#Here we cann start regex pattern
#Regex pattern means we can pass any value like not only string, float or integer
#On top we used string only 
#but if user wants to change the value into the interger
#by using some anotation like in main method we have to right in method 
#at start point ^ and at last end$ and in betn, need to wright (.+)and for pass (.+)
#example- @When("^User login into Application with (.+) and password (.+) $") -- this is nothing but 
# a regex method 

Scenario Outline: User Signup Page

Given User on practice page
When User Signup into Application 
| Satish |
| Nakhate |
| snakhate@gmail.com |
| 875946875 |

Then Home page is display  
Then Cards are displayed 


