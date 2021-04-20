package com.myfinalproject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	
	public WebElement getLogout() {
		return logout;
	}

	public Logout_Page(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


}
