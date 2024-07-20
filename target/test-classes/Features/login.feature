Feature: To validate the login functionality of facebook application


Scenario: To validate facebook login invalid username and valid password


Given User have a to launch the facebook applications through chrome browser


When User have to enter the invalid username and  valid password

And User have to click the login button 

Then User have to reach invalid credentials page



Scenario: To validate facebook login valid username and invalid password
  
Given User have a to launch the facebook applications through chrome browser
 
When  User have to enter the valid username and invalid password
 
And User have to click the login button

Then User have to reach invalid credentials page 
