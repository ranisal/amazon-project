package upskill.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultLocators {
	//validate mobile phone covers
	@FindBy(xpath="//input[@value ='mobile phone cases']")
	public WebElement  txtmobilephonecovers;
	
	//validate screen protector
	@FindBy(xpath="//input[@value ='screen protector']")
	public WebElement  txtmobilescreenprotector;
	
	// validate  camara protector
	@FindBy(xpath="//input[@value ='camera protector']")
	public WebElement  txtcameraprotector;
	
	//checkbox mobile phone covers
	
	@FindBy(xpath="//span[contains(text(),'OtterBox')]")
	public WebElement btnOttorBox ;
	
	
	//  checkbox screen protector
	@FindBy(xpath="//span[contains(text(),'ZAGG')]")
	public WebElement btnScreenProtector;
	
	
	//  checkbox camera protector
	@FindBy(xpath="//span [contains(text(),'Tensea')]")
	public WebElement btncameraProtector;
	
	//checkbox cat food
	@FindBy(xpath = "//span[contains (text(),'Purina One Natural')]")
	public WebElement btnCatFood;
	
	
	
	// checkbox cat toy
	@FindBy(xpath = "//span[contains (text(),'klutz cat toys')]")
	public WebElement btnKlutzCatToy;
	
	
	
	
	
	


}
