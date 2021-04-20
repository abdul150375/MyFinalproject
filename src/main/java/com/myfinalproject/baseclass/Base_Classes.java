package com.myfinalproject.baseclass;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Classes {
	
public static WebDriver driver;	
	
	public static WebDriver getbrowser(String typeofbrowser)
	{
		if(typeofbrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
//		else if(typeofbrowser.equalsIgnoreCase("firefox")){
//			//create firefox instance
//			System.setProperty("webdriver.firefox.driver", 
//					System.getProperty("user.dir") + "//Driver//geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
		else if(typeofbrowser.equalsIgnoreCase("Edge")){
			//set path to Edge.exe
			System.setProperty("webdriver.edge.driver", 
					System.getProperty("user.dir") + "//Driver//msedgedriver.exe");
			//create Edge instance
			driver = new EdgeDriver();
		}
		else{
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static void clickonElement(WebElement element)
	{
		element.click();
	}
	
	public static void getUrl(String url)
	{
		driver.get(url);
	}
	public static void getCurrentUrl()
	{
		driver.getCurrentUrl();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void switchTo(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public static void defaultContent()
	{
		driver.switchTo().defaultContent();
		
	}
	public static void inputvalueElement(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	
	public static WebElement findElement(String xpath)
	{
		return driver.findElement(By.xpath(xpath));
	}
	
	public static WebElement findElementByName(String name)
	{
		return driver.findElement(By.name(name));
	}
	
	public static WebElement findElementByid(String id)
	{
		return driver.findElement(By.id(id));
	}
	
	public static void moveToElement(WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	
	public static void moveToElementClick(WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
		a.click(element).build().perform();
	}
	public static void JavascriptExecutor(WebElement element, String action)
	{

		JavascriptExecutor js1 =(JavascriptExecutor) driver;
		if(action.equalsIgnoreCase("click"))
		{
			js1.executeScript("arguments[0].click();", element);
		}
		else if(action.equalsIgnoreCase("scrollIntoView"))
		{
			js1.executeScript("arguments[0].scrollIntoView();", element);
		}
		else
		{
			js1.executeScript("arguments[0].click();", element);
		}
	}
	public static void Takescreenshot(String destinitionfileInfo) throws Throwable
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destinitionfile = new File (destinitionfileInfo);
		FileUtils.copyFile(sourcefile, destinitionfile);		
	}
	public static void dropdown(WebElement element, String type, String value) 
	{
		
		try {
			Select s = new Select(element);
			if(type.equalsIgnoreCase("byindex"))
			{
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			}
			else if (type.equalsIgnoreCase("byvalue"))
			{
				s.selectByValue(value);
			}
			else if (type.equalsIgnoreCase("byvisibletext"))
			{
				s.selectByVisibleText(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
}
