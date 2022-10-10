Feature: To validate Account page for testleaf application

@sanity
Scenario Outline: To validate login functionality

Given User launch the testleaf application

When User enter the value to username "<username>" textfield

And User enter the value password "<password>" textfield

Then user click on the login button


Examples:
|username|password|
|demosalesmanager|crmsfa|

@smoke
Scenario: To validate account functionality

When user click on the crmsfa button and it navigate to the home page 

And user click on the account button and it navigate to the account page

Then user click on the create account button and it navigate to the create account page

 @Regression
 Scenario Outline: To  validate create account page
 
 When user enter the value to accname "<accountname>" textfield
 
 And user enter the value to accdesc "<description>" textfield
 
 And user enter the value to areacode "<areacode>" textfield
 
 And user enter the value to email "<email>" textfield
 
 And user enter the value to toname "<toname>" textfield
 
 And user enter the value to state "<state>" textfield
 
 And user enter the value to countryid "<countryid>" textfield
 
 Then user click on the submit button and user account successfully created
 
 Examples:
 
 |accountname|description                 |areacode|email         |toname|state|countryid|
 |Sowmiya    |check all fields fill or not|09      |saso@gmail.com|kavin |AA   |ARG|
