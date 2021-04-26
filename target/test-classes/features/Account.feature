Feature: Portal Login

Background:
Given Validate the browser
When Browser was triggered
Then Check if browser displayed

  @PortalTest
  Scenario: Home page default login
  Given User is on NetBanking landing page
  When User login into the appilication with "Aravind" and "1234"
  Then Home page is populated
  And Cards are displayed "true"
  
  @PortalTest
  Scenario: Home page default login
  Given User is on NetBanking landing page
  When User login into the appilication with "Ajay" and "4321"
  Then Home page is populated
  And Cards are displayed "false"
  
  @PortalTest
  Scenario: Home page default signup
  Given User is on NetBanking landing page
  When User signup with following details
  | Aravind | 1234 | aravind@gmail.com | 7416674136 | Hyderabad |
  
  @PortalTest
  Scenario Outline: Home page default login
  Given User is on NetBanking landing page
  When User login in to the appilication with <Username> and <Password>
  Then Home page is populated
  And Cards are displayed "true"
  
  Examples:
  |Username|Password|
  |Aravind |1234|
  |Ajay    |4321|
  |Karthik |5231|
  |Avinash |5678|
  
  

