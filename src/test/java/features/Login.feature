Feature: Loging into the portal

@CartTest
Scenario Outline: Login functionality
   Given User is on landing page
   When User clicked on login page
   Then Message display as "Welcome, Please Sign In!"
   When User enters username "<username>" and password "<password>"
   When User click on login button
   Then Validate user account ID
  
Examples:
    |username                 |password|
    |testdemowebshop@gmail.com|Test123 |

  

  

