package com.myfinalproject.helper;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	public Configuration_Reader() throws Throwable
	{
		File f = new File ("C:\\Users\\ABDUL\\eclipse-workspace\\MyFinalProject\\src\\test\\java\\com\\myfinalproject\\properties\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		//Properties p = new Properties();
		p=new Properties();
		p.load(fis);
	}
	
	public String getBrowser()
	{
		String browser = p.getProperty("browser");
		return browser;
	}
	public String getUrl()
	{
		String url = p.getProperty("url");
		return url;
	}
	public String getCreditCardNo()
	{
		String cNo = p.getProperty("Credit_Card_No");
		//int index = Integer.parseInt(cNo);
		return cNo;
	}
	public String getCreditCardType()
	{
		String Credit_Card_Type = p.getProperty("Credit_Card_Type");
		return Credit_Card_Type;
	}
	public String getExpiryDateMonth()
	{
		String eMonth = p.getProperty("Expiry_Date_Month");
		//int month = Integer.parseInt(eMonth);
		return eMonth;
	}
	public String getExpiryDateYear()
	{
		String eYear = p.getProperty("Expiry_Date_Year");
		//int year = Integer.parseInt(eYear);
		return eYear;
	}
	public String getCVVNumber()
	{
		String CVVnumber = p.getProperty("CVV_Number");
		//int cNumber = Integer.parseInt(CVVnumber);
		return CVVnumber;
	}
//	Credit_Card_No=1234567812345678
//			Credit_Card_Type=VISA
//			Expiry_Date_Month=7
//			Expiry_Date_Year=2021
//			CVV_Number=1212
	
	
	
	
	
}
