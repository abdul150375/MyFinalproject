package com.myfinalproject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Card {
	
	
	public WebDriver driver;

	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
		
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement cc_num;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cc_type;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement cc_exp_month;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement cc_exp_year;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cc_cvv;
	
	//input[@name='cc_num']
	//select[@name='cc_type']
	//select[@name='cc_exp_month']
	//select[@name='cc_exp_year']
	//input[@name='cc_cvv']
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement book_now;
	
	//input[@name='book_now']
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public Registration_Card(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	

}
