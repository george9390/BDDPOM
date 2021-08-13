Feature: CRM Login Feature

Scenario: Free CRM Login test scenario

Given User is already on login page
When User enters credentials
	| username | password |
    | reachtogeorgemathew@gmail.com | Godhod123? |
Then Should display Home page
Then close the browser