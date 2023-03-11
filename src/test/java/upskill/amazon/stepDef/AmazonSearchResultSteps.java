package upskill.amazon.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonSearchResultActions;

public class AmazonSearchResultSteps {
	AmazonSearchResultActions AmazonSearchResultActionsobj = new AmazonSearchResultActions();
	
	
	@Then("^Item list should have only mobile phone cases related products$")
	public void item_list_should_have_only_mobile_phone_cases_related_products() throws Throwable {
		AmazonSearchResultActionsobj.verifymobilephonecasesItems();
	    
	}
	@Then("^Item list should have only  screen protector related products$")
	public void item_list_should_have_only_screen_protector_related_products() throws Throwable {
		AmazonSearchResultActionsobj.verifyscreenprotectorItems();
	    
	}
	@Then("^Item list should have only camera protector related products$")
	public void item_list_should_have_only_camera_protector_related_products() throws Throwable {
		AmazonSearchResultActionsobj.verifyCameraprotectorItems();
	    
	}
	
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String items) throws Throwable {
		AmazonSearchResultActionsobj.verifyBrandItems(items);
	   
	}

	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
	   
	}
	@Then("^Item list should have only Purina One Natural$")
	public void item_list_should_have_only_Purina_One_Natural() throws Throwable {
		AmazonSearchResultActionsobj.verifyCatfood();
	   
	}
	
	@When("^Click On Kelutd Cat Toys$")
	public void click_On_Kelutd_Cat_Toys() throws Throwable {
		AmazonSearchResultActionsobj.verifyCatToys();
	  
	}



}
