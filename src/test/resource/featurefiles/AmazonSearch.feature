@regression @smoke @SKYW-15 @E2E
Feature: Amazon Search Functionality

	Scenario: Search for Mobile Phone cases
		Given Open Amazon Homepage
		When Search for Mobile Phone cases
		Then Item list should have only mobile phone cases related products
		
	Scenario: Search for Screen proctector
		Given Open Amazon Homepage
		When Search for screen protector
		Then Item list should have only  screen protector related products
	
	Scenario: Search for camera protector
		Given Open Amazon Homepage
		When Search for camera protector
		Then Item list should have only camera protector related products
	
	