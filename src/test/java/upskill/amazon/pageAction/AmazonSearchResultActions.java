package upskill.amazon.pageAction;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import upskill.amazon.pageElements.AmazonSearchResultLocators;
import upskill.utilities.SetupDrivers;

public class AmazonSearchResultActions {
	AmazonSearchResultLocators  AmazonSearchResultlocatorsobj;
 public  AmazonSearchResultActions() {
	 AmazonSearchResultlocatorsobj = new AmazonSearchResultLocators();
	 PageFactory.initElements(SetupDrivers.driver, AmazonSearchResultlocatorsobj);
	 
	 
 } 
 public void verifymobilephonecasesItems() {
	 Assert.assertTrue(AmazonSearchResultlocatorsobj.txtmobilephonecovers.isDisplayed());
	 // option 2
	 Assert.assertEquals("mobilephonecases", AmazonSearchResultlocatorsobj.txtmobilephonecovers.getText());
	  // option 3
	 AmazonSearchResultlocatorsobj.txtmobilephonecovers.isDisplayed();
 }
 
 public void verifyscreenprotectorItems() {
	 Assert.assertTrue(AmazonSearchResultlocatorsobj.txtmobilescreenprotector.isDisplayed());
    Assert.assertEquals("screen protector", AmazonSearchResultlocatorsobj.txtmobilescreenprotector.getText());
    AmazonSearchResultlocatorsobj.txtmobilescreenprotector.isDisplayed();
    
 }
 public void verifyCameraprotectorItems() {
	 Assert.assertTrue(AmazonSearchResultlocatorsobj.txtcameraprotector.isDisplayed());
    Assert.assertEquals("camera protector", AmazonSearchResultlocatorsobj.txtcameraprotector.getText());
    AmazonSearchResultlocatorsobj.txtcameraprotector.isDisplayed();
    
 }
 public void filterBrand(String brand){
		if(brand.equals("OttorBox")){
			AmazonSearchResultlocatorsobj.btnOttorBox.click();;
		} else if(brand.equals("ZAGG")){
			AmazonSearchResultlocatorsobj.btnScreenProtector.click();;
		}	else if(brand.equals("Tensea")){
			AmazonSearchResultlocatorsobj.btncameraProtector.click();
		}  else {
			System.out.println("Brand not found");
		}
	}
	
	public void verifyBrandItems(String brand){
		if(brand.equals("OttorBox")){
			Assert.assertTrue(AmazonSearchResultlocatorsobj.txtmobilephonecovers.isDisplayed());
		} else if(brand.equals("ZAGG")){
			Assert.assertTrue(AmazonSearchResultlocatorsobj.txtmobilescreenprotector.isDisplayed());
		}	else if(brand.equals("Unbranded")){
			Assert.assertTrue(AmazonSearchResultlocatorsobj.txtcameraprotector.isDisplayed());
			System.out.println("Brand not found");
		} 
		
	}
	public void verifyCatfood() {
		 Assert.assertTrue(AmazonSearchResultlocatorsobj.btnCatFood.isDisplayed());
	    Assert.assertEquals("btnCatFood", AmazonSearchResultlocatorsobj.btnCatFood.getText());
	    AmazonSearchResultlocatorsobj.btnCatFood.isDisplayed();
	    
 
 }
	
	
  public void verifyCatToys() {
	 Assert.assertTrue(AmazonSearchResultlocatorsobj.btnCatFood.isDisplayed());
   Assert.assertEquals("btnKlutzCatToy", AmazonSearchResultlocatorsobj.btnCatFood.getText());
   AmazonSearchResultlocatorsobj.btnCatFood.isDisplayed();
  }
   }
   




