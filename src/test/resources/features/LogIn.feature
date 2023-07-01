@regression
Feature: Log in functionality

  Background:
    Given user is already on the log in page

@smoke
    Scenario: Log in with correct credentials
    When user puts correct username and password and clicks Login button
      Then user should see 'Products' page

    Scenario: Log in with locked out user
      When user puts locked out username and password and clicks Login button
      Then user should 'Epic sadface: Sorry, this user has been locked out.' message

    Scenario: Log in with invalid username
      When user puts incorrect username and correct password and clicks Login button
      Then user should see 'Epic sadface: Username and password do not match any user in this service' message

    Scenario: Log in with invalid password
      When user puts correct username and incorrect password and clicks Login button
      Then user should see 'Epic sadface: Username and password do not match any user in this service' message

