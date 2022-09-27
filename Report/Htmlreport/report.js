$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 2,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "User Login In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-adactin-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user Launch the Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username In Username Feild",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Password In Password Feild",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_the_Adactin_Application()"
});
formatter.result({
  "duration": 11704707900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Username_In_Username_Feild()"
});
formatter.result({
  "duration": 188636800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Password_In_Password_Feild()"
});
formatter.result({
  "duration": 105942500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1142187100,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User Search Hotel In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-search-hotel-in-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user Select The Location In Location Drop Down List",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user Select The Hotel In Hotels Drop Down List",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select The Room Type In Room Type Drop Down List",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select The Number Of Rooms in Number Of Rooms Drop Down List",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Enter The Check In Date In Check In Date Text Feild",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Enter The Check Out Date In Check Out Date Text Feild",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Select Number Of Adults In Adults Per Room Drop Down List",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select Number Of Children In Children Per Room Drop Down List",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Click The Search Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Location_In_Location_Drop_Down_List()"
});
formatter.result({
  "duration": 289242400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_In_Hotels_Drop_Down_List()"
});
formatter.result({
  "duration": 138205900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Room_Type_In_Room_Type_Drop_Down_List()"
});
formatter.result({
  "duration": 143315500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_Of_Rooms_in_Number_Of_Rooms_Drop_Down_List()"
});
formatter.result({
  "duration": 160164400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Check_In_Date_In_Check_In_Date_Text_Feild()"
});
formatter.result({
  "duration": 123593700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Check_Out_Date_In_Check_Out_Date_Text_Feild()"
});
formatter.result({
  "duration": 108185200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Number_Of_Adults_In_Adults_Per_Room_Drop_Down_List()"
});
formatter.result({
  "duration": 134992000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Number_Of_Children_In_Children_Per_Room_Drop_Down_List()"
});
formatter.result({
  "duration": 139656100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 633111900,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "User Verify The Details Of Selected Hotel In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-verify-the-details-of-selected-hotel-in-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user Select The Radio Button After Verification Of Hotel Details",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user Click The Continue Button And It Navigates to",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Radio_Button_After_Verification_Of_Hotel_Details()"
});
formatter.result({
  "duration": 61179800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Continue_Button_And_It_Navigates_to()"
});
formatter.result({
  "duration": 654837000,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User Entering Personal Details And Payment Details",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-entering-personal-details-and-payment-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user Enter First Name In First Name Text Feild",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user Enter Second Name In Second Name Text Feild",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Enter Billing Address In Billing Address Text Feild",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enter Credit Card Number In Credit Card No Text Feild",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Select Credit Card Type In Credit Card Type Drop Down List",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Select Expiry Date In Expiry Date Month And Year Drop Down List",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Enter Cvv Number In Cvv Number Text Feild",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Click The Search Button and It Navigates to Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_First_Name_In_First_Name_Text_Feild()"
});
formatter.result({
  "duration": 88379900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_Second_Name_In_Second_Name_Text_Feild()"
});
formatter.result({
  "duration": 122453100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_Billing_Address_In_Billing_Address_Text_Feild()"
});
formatter.result({
  "duration": 95305600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_Credit_Card_Number_In_Credit_Card_No_Text_Feild()"
});
formatter.result({
  "duration": 97923400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Credit_Card_Type_In_Credit_Card_Type_Drop_Down_List()"
});
formatter.result({
  "duration": 159423400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_Expiry_Date_In_Expiry_Date_Month_And_Year_Drop_Down_List()"
});
formatter.result({
  "duration": 352783800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_Cvv_Number_In_Cvv_Number_Text_Feild()"
});
formatter.result({
  "duration": 105030100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Search_Button_and_It_Navigates_to_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 98444700,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "User Verifying The Booking Confirmation Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-verifying-the-booking-confirmation-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "user Click Logout Button And Application  Exits",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_Logout_Button_And_Application_Exits()"
});
formatter.result({
  "duration": 5971183700,
  "status": "passed"
});
});