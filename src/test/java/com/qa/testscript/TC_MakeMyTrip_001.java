package com.qa.testscript;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_MakeMyTrip_001 extends TestBase{
   @Test
   public void checkLogo() throws IOException, InterruptedException {
	   Thread.sleep(10000);	   
	   MakeMyTripPages.offerPopup().click();
	   if(MakeMyTripPages.getMakeMyTripLogo().isDisplayed())
	   {
	   Assert.assertTrue(true);
	   }
	   else {
		   captureScreenshot(driver, "VerificationOfLogo");
		   Assert.assertTrue(false,"MakeMyTrip logo is not present inside the home Page");
	   }
   }
}
