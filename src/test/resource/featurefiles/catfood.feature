Feature: Amazon Cat Food Search Funtionality

	Scenario: Search for Cat Food
		Given Open Amazon Homepage
		When Search for Purina One Natural
		Then Item list should have only Purina One Natural
	Scenario: Search for Kelutd Cat Toys
		Given Open Amazon Homepage
		When Search for Cat Toys
		Then Item list should have only Purina One Natura
		