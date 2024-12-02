package com.cyclos.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.cyclos.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;
	
	public static Logger logger;
	
	ReadConfig rc=new ReadConfig();
	
	String Browser=rc.getBrowser();
	String Url=rc.getUrl();
	String Name=rc.getName();
	String LoginName=rc.getLoginName();
	String Email=rc.getEmail();
	String Website=rc.getWebsite();
	String Mobile=rc.getMobile();
	String Landline=rc.getLandline();
	String Address=rc.getAddress();
	String Zipcode=rc.getZipcode();
	String City=rc.getCity();
	String State=rc.getState();
	String Password=rc.getPassword();
	String ConfirmPassword=rc.getConfirmPassword();
	String UserName=rc.getUserName();
	String LoginPassword=rc.getLoginPassword();
	String Amount=rc.getAmount();
	String Description=rc.getDescription();
	
	@BeforeClass
	public void setUp()
	{
		switch(Browser.toLowerCase())
		{
			case "chrome":
				WebDriverManager.chromedriver().setup();
				
				driver=new ChromeDriver();
				
				break;
				
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				
				driver=new FirefoxDriver();
				
				break;
				
			case "edge":
				WebDriverManager.edgedriver().setup();
				
				driver=new EdgeDriver();
				
				break;
			}
			
			driver.manage().window().maximize();
			
			driver.get(Url);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			logger=LogManager.getLogger("Cyclos-V1");
		}
	
	public static void captureScreenShot(WebDriver driver, String testname) throws IOException
	{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		
		File target=new File("C:\\Users\\pc\\eclipse-workspace\\Cyclos-V1\\screenshots\\"+testname+".png");
		
		FileUtils.copyFile(src, target);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}

