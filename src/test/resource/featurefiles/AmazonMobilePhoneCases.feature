Feature: Amazon phone cases Outline

Description: User should able to filter items by Brand

	Background: 
		Given Open Amazon Homepage
	
	Scenario Outline: Filter items by Brand
		Given Search for "<Items>"
		When Filter by "<Brand>"
		Then Item list should have products of "<Brand>"
	
	Examples:
		|Items		              	|Brand		|
		|mobile phone cases 	  	|Otterbox	|
		|screen protector		    |ZAGG		|
		|camera protector		 	|Tensea	    |