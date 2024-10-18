Feature: Forgot Password
  
  Scenario Outline: Check forgot password
  
  Given First step for forgot password
  When  Second step for forgot "<uname>" and "<pass>" password
  Then Third step for forgot password

  Examples: 
      | uname                      | pass   |
      | test+shivaMS2@munchi.co.za | 123456 |
      