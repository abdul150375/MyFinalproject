package com.myfinalproject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary_Page {
	

	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement myItinerary;
	
	
	
	////a[text()='Booked Itinerary']
	
	////input[@name='my_itinerary']
	
//	@FindBy(xpath="//input[@name='total_price']")
//	private WebElement movetoadactin;
//	
//	
//	public WebElement getMovetoadactin() {
//		return movetoadactin;
//	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public Itinerary_Page(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

}
