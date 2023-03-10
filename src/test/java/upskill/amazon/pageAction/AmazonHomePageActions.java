package upskill.amazon.pageAction;

import upskill.amazon.pageElements.AmazonHomePageLocators;
import upskill.utilities.SetupDrivers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageActions {
	AmazonHomePageLocators AmazonHomePageLocatorsObj;
	
	public AmazonHomePageActions() {
		AmazonHomePageLocators obj = new AmazonHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonHomePageLocatorsObj);
		
		
	}
	public void Searchmobilephonecases() {
		AmazonHomePageLocatorsObj.txtbxSearch.sendKeys("mobile phone cases");
		JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;
	}
	
	public void searchscreenprotector() {
		AmazonHomePageLocatorsObj.txtbxSearch.sendKeys("screen protector");
		AmazonHomePageLocatorsObj.txtbtnSearch.click();
		
	}
	public void searchcameraprotector() {
		AmazonHomePageLocatorsObj.txtbxSearch.sendKeys("camera protector");
		AmazonHomePageLocatorsObj.txtbtnSearch.click(); 
		}
		
	public void searchItems(String items){
		AmazonHomePageLocatorsObj.txtbxSearch.sendKeys(items);
//		EbayHomePageLocatorsObj.btnSearch.click();
		AmazonHomePageLocatorsObj.txtbtnSearch.sendKeys(Keys.ENTER);
		
	}
	public void searchCatfood() {
		AmazonHomePageLocatorsObj.txtbxSearch.sendKeys("Purina One Natural");
		AmazonHomePageLocatorsObj.txtbtnSearch.click(); 
		}
	public void searchCatToys(){
		AmazonHomePageLocatorsObj.txtbxSearch.sendKeys("Kelutd Cat Toys");
		AmazonHomePageLocatorsObj.txtbtnSearch.click(); 
	
	} }
