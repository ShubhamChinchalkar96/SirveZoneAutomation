@serviceOrder
Feature: Service Orders
  Use this feature file for service order test casess

  
  Scenario Outline: Service order flow
    Given Navigate to landing page
    And click on login button
    When login with user  "<Uid>" and "<Upass>"
    And Go for find service
    And select one service
    And select staff
    And Click on book service button
    And Make payment
    And Navigate to service order page
    And log out
    When login with staff "<Sid>" and "<Spass>"
    And click on notification
    And click on select button
    And Accept service order
    And click to back to service
    Then Complete service order

   Examples: 
      | Uid                  | Upass       | Sid                       | Spass  |
      | shivatest13@gmail.com| S123456     |  test+shivaS2@munchi.co.za | 123456 |
      

   
   Scenario Outline: Book service using chams
    Given Navigate to landing page
    And click on login button
    When login with user  "<Uid>" and "<Upass>"
    And Go for find service
    And select one service
    And select staff
    And Enter credit chams "5"
    And Click on book service button
    And Make payment
    And Navigate to service order page
    And log out
    When login with staff "<Sid>" and "<Spass>"
    And click on notification
    And click on select button
    And Accept service order
    And click to back to service
    Then Complete service order

    Examples: 
      | Uid                  | Upass       | Sid                       | Spass  |
      | shivatest13@gmail.com| S123456     |  test+shivaS2@munchi.co.za | 123456 |
      
      
    Scenario Outline: Book service using Negative chams amount
    Given Navigate to landing page
    And click on login button
    When login with user  "<Uid>" and "<Upass>"
    And Go for find service
    And select one service
    And select staff
    And Enter credit chams "-1"
    And Click on book service button
    Then Accept the alert 
      
      Examples: 
      | Uid                  | Upass  | 
      | shivatest13@gmail.com| S123456 | 
      
    
    Scenario Outline: Enter chams amount same as callout fee
    Given Navigate to landing page
    And click on login button
    When login with user  "<Uid>" and "<Upass>"
    And Go for find service
    And select one service
    And select staff
    And Enter credit chams "2000"
    And Click on book service button
    Then Chams message should be appear <Amount can not be less than R 70.0000>
     Examples: 
      | Uid                  | Upass  | 
      | shivatest13@gmail.com| S123456 | 
      
      
    Scenario Outline: Book service using non verified user
    Given Navigate to landing page
    And click on login button
    When login with user  "<Uid>" and "<Upass>"
    And Go for find service
    Then User should not be allow for booking
      
     Examples: 
      | Uid                  | Upass  | 
      | test+shivaU1@munchi.co.za | 123456 |   
      
      
     Scenario Outline: Book service from landing page
    Given Navigate to landing page
    When Click on Show all Service option
    And Cilck on Electrician service
    And Click to hermanus zone
    Then select S2 staff
    And Click on login to book pro button
    When login with user  "<Uid>" and "<Upass>"
    And Enter credit chams "5"
    And Click on book service button
    And Make payment
    And Navigate to service order page
    And log out
    When login with staff "<Sid>" and "<Spass>"
    And click on notification
    And click on select button
    And Accept service order
    And click to back to service
    Then Complete service order

    Examples: 
      | Uid                  | Upass       | Sid                       | Spass  |
      | shivatest13@gmail.com| S123456     |  test+shivaS2@munchi.co.za | 123456 | 
      
      
      
      
      
       
      
      