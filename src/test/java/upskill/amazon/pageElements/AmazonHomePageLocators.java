package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePageLocators {
	
	// seach text box locator
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement txtbxSearch;
	
	// search button
	@FindBy(xpath="//input[@type='submit']")
	public WebElement txtbtnSearch;
	
	
}
