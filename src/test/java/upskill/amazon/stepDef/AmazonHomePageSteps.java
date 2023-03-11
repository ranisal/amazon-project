package upskill.amazon.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.amazon.pageAction.AmazonHomePageActions;

public class AmazonHomePageSteps {
	AmazonHomePageActions AmazonHomePageActionsobj = new AmazonHomePageActions();

	@Given("^Open Amazon Homepage$")
	public void open_Amazon_Homepage() throws Throwable {
	
		
	}
	@When("^Search for Mobile Phone cases$")
	public void search_for_Mobile_Phone_cases() throws Throwable {
		AmazonHomePageActionsobj.Searchmobilephonecases();
	    
	}
	@When("^Search for screen protector$")
	public void search_for_screen_protector() throws Throwable {
		AmazonHomePageActionsobj.searchscreenprotector();
	    
	}
	@When("^Search for camera protector$")
	public void search_for_camera_protector() throws Throwable {
		AmazonHomePageActionsobj.searchcameraprotector();
	    
	}
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		AmazonHomePageActionsobj.searchItems(items);;
	   
	}
	@When("^Search for Purina One Natural$")
	public void search_for_Purina_One_Natural() throws Throwable {
		AmazonHomePageActionsobj.searchCatfood();
	    
	}
	@When("^Search for Cat Toys$")
	public void search_for_Cat_Toys() throws Throwable {
		AmazonHomePageActionsobj.searchCatToys();
	    
	}
	

	

}
