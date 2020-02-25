Feature: Test the Application login functionality


Scenario: the user should be able to login with correct username and correct password
Given user is on login page
When user enters correct "john" and correct "john123"
Then user gets confirmation


Scenario: the user should be able to login with correct username and correct password
Given user is on login page
When user enters correct "test" and correct "test123"
Then user gets confirmation