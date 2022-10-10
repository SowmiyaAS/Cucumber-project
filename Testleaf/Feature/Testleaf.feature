Feature: To validate the Testleaf Application

Background: 
 Given user launch the application
 
 @sanity
 Scenario: Test login functionality
 When user enter the username
 And user enter the password
 Then user click on the login button
  
@smoke
 Scenario: Test Testleaf homepage functionality
 When user click on the crmsfa button and it naviagte to the home page
 And user click on the lead button
 And user click on the create lead button and it navigate to the create lead page
 When user enter the company name 
 And user enter the firstname
 And user enter the lastname
 And user enter the sourceid
 And user enter the campaign id
 And user enter the firstname local
 And user enter the lastname local
 And user enter the salutation
 And user enter the title
 And user enter the department name
 And user enter the annual revenue
 And user enter the preferred currency
 And user enter the industry
 And user enter the number of employees
 And user enter the Siccode
 And user enter the description
 Then user enter the important note and it navigate to the contact information page
 When user enter the countrycode
 And user enter the area code
 And user enter the phone number
 And user enter the extension
 And use enter the phone ask for me
 And user enter the email
 Then user enter the weburl and it navigate to the primary address page
 When user enter the toname
 And user enter the attention name
 And user enter the address1
 And user enter the address2
 And user enter the city
 And user enter the state
 And user enter the postal code
 And user enter the country
 And user enter the zip postal code
 Then user click on the submit button and user successfully created user lead 
 
 @Rgression
 Scenario: Test Create page Functionality
 When user click on the crmsfa button and it naviagte to the home page
 And user click on the contact button1
 And user click on the create contact button1
 And user enter the firstname1
 And user enter the lastname1
 And user enter the salutation field
 And user enter the title field
 And user enter the department name1
 And user enter the currency id
 And user enter the createdesc
 Then user enter the important note and it navigate to the contact session
 When user enter the country code1
 And user enter the Acode
 And user enter the pnumber
 And user enter the pextension
 And user enter the Paskforme
 Then user enter the Pemail and it navigate to the the primary session
 When user enter the Toname
 And user enter the Attnname
 And user enter the Add1
 And user enter the Add2
 And user enter the Generalcity
 And user enter the Stateid
 And user enter the Pcode
 And user enter the Countryid
 And user enter the Codeextension
 Then user click on the submit button 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
