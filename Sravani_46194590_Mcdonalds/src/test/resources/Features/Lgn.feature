Feature: Test login functionality


Scenario Outline: Check login is successful or not
Given Open the browser "https://www.mcdelivery.co.in/"
And user is on Login page
When user enters '<mobilenumber>' and '<password>'
And user click on login button
Then user is navigating to the home page



Examples:
| mobilenumber | password |
| "7330766643" | "Reddy@123" |