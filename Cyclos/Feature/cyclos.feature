Feature: Test Cyclos Banking Application
Scenario: Test cyclos home page
Given User launch the application
When user click on the login button
And user enter valid username
And user enter tha valid password
Then user click the submit button And it navigate to the Dashboard page
When user click the payuser button
And user click contact list
And user select the contact list
And user enter the amount
And click scheduling and select the paynow option
And user enter the description
Then user click the next button and it navigate to the payment confirmation page
