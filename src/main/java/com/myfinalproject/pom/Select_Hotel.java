package com.myfinalproject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	
public WebDriver driver;
	
	@FindBy(xpath="//input[@name=\"radiobutton_0\"]")
	private WebElement selecthotel;
	
	@FindBy(xpath="//input[@name=\"continue\"]")
	private WebElement continuehotel;
	
	
	
	
	public Select_Hotel(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getContinuehotel() {
		return continuehotel;
	}
	
}
