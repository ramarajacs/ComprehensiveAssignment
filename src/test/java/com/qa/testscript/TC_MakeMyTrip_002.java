package com.qa.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_MakeMyTrip_002 extends TestBase {
	@Test(priority = 1)
	public void CheckFlightsFromToCity() throws InterruptedException, IOException {
		Thread.sleep(10000);
		MakeMyTripPages.offerPopup().click();
		MakeMyTripPages.getFlightsButton().click();
		Thread.sleep(2000);
		if (driver.getCurrentUrl().contains("flights")) {
			Assert.assertTrue(true);
		} else {
			captureScreenshot(driver, "CheckFlightsFromToCity");
			Assert.assertTrue(false, "Flights is not available");
		}
		MakeMyTripPages.getFlightsOneWay().click();
		MakeMyTripPages.getFromCity().click();
		MakeMyTripPages.getFromCityInputBox().sendKeys("Madurai");
		Thread.sleep(1000);
		for (int i = 0; i < MakeMyTripPages.getCitySuggestions().size(); i++) {
			if (MakeMyTripPages.getCitySuggestions().get(i).getText().contains("Madurai")) {
				MakeMyTripPages.getCitySuggestions().get(i).click();
			}
		}
		if (MakeMyTripPages.getFromCity().getAttribute("value").contains("Madurai")) {
			Assert.assertTrue(true);
		} else {
			captureScreenshot(driver, "CheckFlightsFromToCity");
			Assert.assertTrue(false, "From City is not selected");
		}
		MakeMyTripPages.getToCity().click();
		MakeMyTripPages.getToCityInputBox().sendKeys("Chennai");
		Thread.sleep(1000);
		for (int i = 0; i < MakeMyTripPages.getCitySuggestions().size(); i++) {
			if (MakeMyTripPages.getCitySuggestions().get(i).getText().contains("Chennai")) {
				MakeMyTripPages.getCitySuggestions().get(i).click();
			}
		}
		Thread.sleep(1000);
		if (MakeMyTripPages.getToCity().getAttribute("value").contains("Chennai")) {
			Assert.assertTrue(true);
		} else {
			captureScreenshot(driver, "CheckFlightsFromToCity");
			Assert.assertTrue(false, "To City is not selected by the user");
		}
	}
}
