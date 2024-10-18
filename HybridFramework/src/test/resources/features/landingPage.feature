@landingPage
Feature: Landing page functions
  By clicking on element this script ensure that landing page functions are working or not

  Scenario: Check About us function
    Given User should be on landing page
    When Click on about us option
    And verify the text is present <What is Sirve Zone?> On page

Scenario: Check Contact us function
    Given User should be on landing page
    When Click on Contact us option
    And verify the text is present <Get quick answers about Sirve Zone> On page
   Then Click on first qustion that is what is sirve zone
   And verify the text is present <Sirve Zone is an online platform where we list qualified people like plumbers, electricians, and more.> Under drop down

Scenario: Check Blog function
    Given User should be on landing page
    When Click on Blog option
    And verify tital text is present <Keep busy with our latest blogs> On page
 
 Scenario: Check Get water function
    Given User should be on landing page
    When Click on Get water label option
    And verify tital text is present <Giveaway information> On page
 
 Scenario: Check Talk to chami function
    Given User should be on landing page
    When Click on Talk to chami label option
    And verify tital text is present <Talk to Chami - Sirve Zone's friendly AI Chameleon> On page
    
Scenario: Check List your services function
    Given User should be on landing page
    When Click on slider
    Then click on list your service option
    And verify tital text is present <Benefits of listing your services> On page
    
Scenario: Check collect chams function
    Given User should be on landing page
    When Click on slider two times
    Then click on Colect chams option
    And verify tital text is present <Earn Sirve Zone Chams> On page        
  
 Scenario: Check show all services functions
    Given User should be on landing page
    When Click on Show all Service option
    And Cilck on Electrician service
    And Click to hermanus zone
    Then select S2 staff
    Then verify staff name <Shiva S2> on screen
   
 Scenario: Check By zone services functions
    Given User should be on landing page
    When Click on By zone Service option
    And Cilck on Hermanus Zone
    And Click to Electrician service
    Then select S2 staff
    Then verify staff name <Shiva S2> on screen 
  