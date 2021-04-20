package com.myfinalproject.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.myfinalproject.baseclass.Base_Classes;
import com.myfinalproject.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//myfinalproject//featurefile", glue="com.myfinalproject.stepdefinition")

public class Test_Runner {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void set_Up() throws Throwable {
	
		
		try {
			String chromebrowser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
			driver = Base_Classes.getbrowser(chromebrowser);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void tear_Down() throws Exception {
		
		//driver.close();
		Base_Classes.close();
	}

}
