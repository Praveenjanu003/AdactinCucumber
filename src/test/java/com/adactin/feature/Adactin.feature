@test
Feature: Hotel Booking In Adactin Application
Scenario: User Login In Adactin Application
Given user Launch the Adactin Application
When user Enter The Username In Username Feild
And user Enter The Password In Password Feild
Then user Click The Login Button And It Navigates To Search Hotel Page

@test
Scenario: User Search Hotel In Adactin Application
When user Select The Location In Location Drop Down List
And user Select The Hotel In Hotels Drop Down List
And user Select The Room Type In Room Type Drop Down List
And user Select The Number Of Rooms in Number Of Rooms Drop Down List
And user Enter The Check In Date In Check In Date Text Feild
And user Enter The Check Out Date In Check Out Date Text Feild
And user Select Number Of Adults In Adults Per Room Drop Down List
And user Select Number Of Children In Children Per Room Drop Down List
Then user Click The Search Button And It Navigates To Select Hotel Page

@test
Scenario: User Verify The Details Of Selected Hotel In Adactin Application
When user Select The Radio Button After Verification Of Hotel Details
Then user Click The Continue Button And It Navigates to 

@test
Scenario: User Entering Personal Details And Payment Details
When user Enter First Name In First Name Text Feild
And user Enter Second Name In Second Name Text Feild
And user Enter Billing Address In Billing Address Text Feild
And user Enter Credit Card Number In Credit Card No Text Feild
And user Select Credit Card Type In Credit Card Type Drop Down List
And user Select Expiry Date In Expiry Date Month And Year Drop Down List
And user Enter Cvv Number In Cvv Number Text Feild
Then user Click The Search Button and It Navigates to Booking Confirmation Page

@test
Scenario: User Verifying The Booking Confirmation Page
Then user Click Logout Button And Application  Exits
