package com.myfinalproject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	
public WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement loginButton;
	
	////input[@name='username']
	////input[@name='password']
	////input[@name='login']
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}

	public Home_Page(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}

	
	

}
