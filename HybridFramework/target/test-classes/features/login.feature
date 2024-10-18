@login
Feature: Login

  Scenario Outline: login with valid credential
    Given the user is on the login page
    When the user enters an valid email "<uname>" 
    And the user enters a valid password "<pass>"
    Then user should be on home page

    Examples: 
      | uname                      | pass   |
      | test+shivaMS2@munchi.co.za | 123456 |
    
   
