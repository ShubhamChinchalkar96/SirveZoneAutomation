@signup
Feature: Signup or registration

  @invalidFieldTest
  Scenario Outline: Check email field are not accepts invalid email
    Given The user should be on registration page
    When Enter invalid emailid <emailid> into email field
    And Hit the signup button
    Then verify the alert message "The Email field is not a valid e-mail address."

    Examples: 
      | emailid                              |
      | userexample.com                      |
       | user@.com                            |
      | user@example                         |
      | user@domain@example.com              |
      | user@exam!ple.com                    |
      | user name@example.co                 |
      | user@sub1.sub2.sub3.sub4.example.com |
      | ser@example.c                        |
      | user@example..com                    |
      | user$%*@example.com                 |
      | user@\\u0001example.com              |
      | user@example@.com                    |
      | user@example,com                     |
      | user@example\\u2002.com              |
      | @example.com                         |
      |sd1@gm|
     
     
    