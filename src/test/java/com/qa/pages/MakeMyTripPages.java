package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.JavascriptExecutor;

public class MakeMyTripPages {
	WebDriver driver;
	
	@FindBy(xpath = "//i[@class='wewidgeticon we_close']")
	WebElement PopupClose;
	public WebElement getPopupClose() {
		return PopupClose;
	}
	
    @FindBy(xpath="//img[@alt='Make My Trip']")
    WebElement MakeMyTripLogo;
    public WebElement getMakeMyTripLogo() {
    	return MakeMyTripLogo;
    }
    
    @FindBy(xpath="//*[@class='chNavText darkGreyText']")
    WebElement FlightsButton;
    public WebElement getFlightsButton() {
    	return FlightsButton;
    }
    
    @FindBy(xpath = "(//*[starts-with(@class,'tabsCircle')])[1]")
    WebElement FlightsOneWay;
    public WebElement getFlightsOneWay() {
    	return FlightsOneWay;
    }
    
    @FindBy(xpath="//input[contains(@id,'fromCity')]")
    WebElement FromCity;
    public WebElement getFromCity() {
    	return FromCity;
    }
  
    @FindBy(xpath="//input[contains(@id,'fromCity')]")
    WebElement FromCityInputBox;
    public WebElement getFromCityInputBox() {
    	return FromCityInputBox;
    }
    @FindBy(xpath="//div[@class='imageSlideContainer']/section/span[@class='commonModal__close']")
    WebElement offerPopup;
    public WebElement offerPopup() {
    	return offerPopup;
    }
    @FindAll(@FindBy(xpath="//div[@class='calc60']"))
    List<WebElement> CitySuggestions;
    public List<WebElement> getCitySuggestions(){
    	return CitySuggestions;
    }
    
    @FindBy(xpath ="//input[contains(@id,'toCity')]")
    WebElement ToCity;
    public WebElement getToCity() {
    	return ToCity;
    }
    
    @FindBy(xpath ="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")
    WebElement ToCityInputBox;
    public WebElement getToCityInputBox() {
    	return ToCityInputBox;
    }
    
    public void clickbyJS(WebElement element)
    {
    	WebElement m=driver.findElement(By.linkText("Company"));
 	   org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
 	   js.executeScript("arguments[0].click();", element);
    }
    public MakeMyTripPages(WebDriver rDriver) {
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
}
