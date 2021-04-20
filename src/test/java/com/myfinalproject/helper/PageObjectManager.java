package com.myfinalproject.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.myfinalproject.pom.Home_Page;
import com.myfinalproject.pom.Itinerary_Page;
import com.myfinalproject.pom.Logout_Page;
import com.myfinalproject.pom.Registration_Card;
import com.myfinalproject.pom.Search_Hotel;
import com.myfinalproject.pom.Select_Hotel;

public class PageObjectManager {
	
	private Home_Page login;
	private Search_Hotel search;
	private Select_Hotel selectHotel;
	private Registration_Card registerHotel;
	private Itinerary_Page itinerary1;
	private Logout_Page logoutHotel;
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver2)
	{
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}
	
	public Home_Page getInstancehomepage()
	{
		login = new Home_Page(driver);
		return login;
		
	}
	public Search_Hotel getSearch_Hotel()
	{
		search = new Search_Hotel(driver);
		return search;
		
	}

	public Select_Hotel getSelect_Hotel()
	{
		selectHotel = new Select_Hotel(driver);
		return selectHotel;
		
	}
	public Registration_Card getRegistration_Card()
	{
		registerHotel = new Registration_Card(driver);
		return registerHotel;
		
	}
	public Itinerary_Page getItinerary_Page()
	{
		itinerary1 = new Itinerary_Page(driver);
		return itinerary1;
		
	}
	public Logout_Page getLogout_Page()
	{
		logoutHotel = new Logout_Page(driver);
		return logoutHotel;
		
	}

}
