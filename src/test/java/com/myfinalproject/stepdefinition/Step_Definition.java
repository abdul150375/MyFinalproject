package com.myfinalproject.stepdefinition;

import org.openqa.selenium.WebDriver;

//import com.myfinalproject.pom.Itinerary_Page;
//import com.myfinalproject.pom.Logout_Page;
//import com.myfinalproject.pom.Registration_Card;
//import com.myfinalproject.pom.Search_Hotel;
//import com.myfinalproject.pom.Select_Hotel;
import com.myfinalproject.baseclass.Base_Classes;
import com.myfinalproject.helper.FileReaderManager;
import com.myfinalproject.helper.PageObjectManager;
//import com.myfinalproject.pom.Home_Page;

import com.myfinalproject.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Classes {
	

	public static WebDriver driver= Test_Runner.driver;
	
	//Home_Page home = new Home_Page(driver);
	//Search_Hotel search = new Search_Hotel(driver);
	//Select_Hotel selectHotel = new Select_Hotel(driver);
	//Registration_Card registerHotel = new Registration_Card(driver);
	//Itinerary_Page itinerary1 = new Itinerary_Page(driver);
	//Logout_Page logoutHotel = new Logout_Page(driver);
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	

@Given("^user Launch the application$")
public void user_Launch_the_application() throws Throwable {
	String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
	getUrl(url);
	//getUrl("https://adactinhotelapp.com/index.php");
	
}

@When("^user Enters The Username In The Username Field$")
public void user_Enters_The_Username_In_The_Username_Field() throws Throwable {
	inputvalueElement(pom.getInstancehomepage().getUsername(),"abdul150375");
}

@When("^user Enters The Password In The Password Field$")
public void user_Enters_The_Password_In_The_Password_Field() throws Throwable {
	inputvalueElement(pom.getInstancehomepage().getPassword(),"abdul150375");
}

@Then("^user Click On The Login Button To Navigate To Search Hotel Page$")
public void user_Click_On_The_Login_Button_To_Navigate_To_Search_Hotel_Page() throws Throwable {
	clickonElement(pom.getInstancehomepage().getLoginButton());
	Thread.sleep(1000);
}

@When("^user Select The Location From The Location Dropdown Field$")
public void user_Select_The_Location_From_The_Location_Dropdown_Field() throws Throwable {
	dropdown(pom.getSearch_Hotel().getLocation(),"byindex","3");
}

@When("^user Select The Hotels From The Hotels Dropdown Field$")
public void user_Select_The_Hotels_From_The_Hotels_Dropdown_Field() throws Throwable {
	dropdown(pom.getSearch_Hotel().getHotels(),"byindex","2");
}

@When("^user Select The Room Type From The Room Type Dropdown Field$")
public void user_Select_The_Room_Type_From_The_Room_Type_Dropdown_Field() throws Throwable {
	dropdown(pom.getSearch_Hotel().getRoom_type(),"byindex","2");
}

@When("^user Select The Number of Rooms From The Number of Rooms Dropdown Field$")
public void user_Select_The_Number_of_Rooms_From_The_Number_of_Rooms_Dropdown_Field() throws Throwable {
	dropdown(pom.getSearch_Hotel().getRoom_nos(),"byindex","5");
}

@When("^user Select The Adults per Room From The Adults per Room Dropdown Field$")
public void user_Select_The_Adults_per_Room_From_The_Adults_per_Room_Dropdown_Field() throws Throwable {
	dropdown(pom.getSearch_Hotel().getAdult_room(),"byindex","2");
}

@When("^user Select The Children per Room From The Children per Room Dropdown Field$")
public void user_Select_The_Children_per_Room_From_The_Children_per_Room_Dropdown_Field() throws Throwable {
	dropdown(pom.getSearch_Hotel().getChild_room(),"byindex","1");
}

@Then("^user Click On The Search Button To Navigate To Select Hotel Page$")
public void user_Click_On_The_Search_Button_To_Navigate_To_Select_Hotel_Page() throws Throwable {
	clickonElement(pom.getSearch_Hotel().getHotelSearch());
	Thread.sleep(1000);
}

@When("^user Select The Option From The Option Field$")
public void user_Select_The_Option_From_The_Option_Field() throws Throwable {
	clickonElement(pom.getSelect_Hotel().getSelecthotel());
}

@Then("^user Click On The Continue Button To Navigate To Book A Hotel Page$")
public void user_Click_On_The_Continue_Button_To_Navigate_To_Book_A_Hotel_Page() throws Throwable {
	clickonElement(pom.getSelect_Hotel().getContinuehotel());
	Thread.sleep(1000);
}

@When("^user Enters The First Name In The First Name Field$")
public void user_Enters_The_First_Name_In_The_First_Name_Field() throws Throwable {
	inputvalueElement(pom.getRegistration_Card().getFirstName(),"Abdul2");
}

@When("^user Enters The Last Name In The Last Name Field$")
public void user_Enters_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
	inputvalueElement(pom.getRegistration_Card().getLastName(),"Rahuman2");
}

@When("^user Enters The Billing Address In The Billing Address Field$")
public void user_Enters_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
	inputvalueElement(pom.getRegistration_Card().getAddress(),"151 - Main road");
}

@When("^user Enters The Credit Card No In The Credit Card No Field$")
public void user_Enters_The_Credit_Card_No_In_The_Credit_Card_No_Field() throws Throwable {
	
	String credit_Card_No = FileReaderManager.getInstance().getInstanceCR().getCreditCardNo();
	inputvalueElement(pom.getRegistration_Card().getCc_num(),credit_Card_No);
}

@When("^user Select The Credit Card Type From The Credit Card Type Dropdown Field$")
public void user_Select_The_Credit_Card_Type_From_The_Credit_Card_Type_Dropdown_Field() throws Throwable {
	String Credit_Card_Type = FileReaderManager.getInstance().getInstanceCR().getCreditCardType();
	dropdown(pom.getRegistration_Card().getCc_type(),"byvisibletext",Credit_Card_Type);
}

@When("^user Select The Expiry Date Month From The Expiry Date Month Dropdown Field$")
public void user_Select_The_Expiry_Date_Month_From_The_Expiry_Date_Month_Dropdown_Field() throws Throwable {
	String Expiry_Date_Month = FileReaderManager.getInstance().getInstanceCR().getExpiryDateMonth();
	dropdown(pom.getRegistration_Card().getCc_exp_month(),"byindex",Expiry_Date_Month);
}

@When("^user Select The Expiry Date Year From The Expiry Date Year Dropdown Field$")
public void user_Select_The_Expiry_Date_Year_From_The_Expiry_Date_Year_Dropdown_Field() throws Throwable {
	String Expiry_Date_Year = FileReaderManager.getInstance().getInstanceCR().getExpiryDateYear();
	dropdown(pom.getRegistration_Card().getCc_exp_year(),"byvalue",Expiry_Date_Year);
}

@When("^user Enters The CVV Number In The CVV Number Field$")
public void user_Enters_The_CVV_Number_In_The_CVV_Number_Field() throws Throwable {
	String CVV = FileReaderManager.getInstance().getInstanceCR().getCVVNumber();
	inputvalueElement(pom.getRegistration_Card().getCc_cvv(),CVV);
}

@Then("^user Click On The Book Now button To Navigate To Booking Confirmation Page$")
public void user_Click_On_The_Book_Now_button_To_Navigate_To_Booking_Confirmation_Page() throws Throwable {
	clickonElement(pom.getRegistration_Card().getBook_now());
	
	Thread.sleep(3000);
}

@Then("^user Click On The My Itinerary Button To Navigate To Booked Itinerary Page$")
public void user_Click_On_The_My_Itinerary_Button_To_Navigate_To_Booked_Itinerary_Page() throws Throwable {
	Thread.sleep(5000);
	clickonElement(pom.getItinerary_Page().getMyItinerary());
}

@Then("^user Click On The Logout Button To Logout From The Page$")
public void user_Click_On_The_Logout_Button_To_Logout_From_The_Page() throws Throwable {
	clickonElement(pom.getLogout_Page().getLogout());
}


}
