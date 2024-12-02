package com.cyclos.pageobject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment 
{
	WebDriver ldriver;
	
	public Payment(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="(//div[@class='quick-access-text'])[1]")
	WebElement paymentlink;
	
	@FindBy(xpath="//div[@class='d-flex']/button")
	WebElement contactlist;
	
	//@FindBy(xpath="//div[@class='modal-content']/pick-contact/div/div/a")
	//List<WebElement> contactnames;
	
	//@FindBy(xpath="//div[@class='input-group']/input")
	//WebElement amount;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[6]//textarea")
	WebElement description;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement nextbutton;
	
	@FindBy(xpath="//span[text()='Confirm']")
	WebElement confirmbutton;
	
	@FindBy(xpath="//span[@class='visually-hidden']")
	WebElement alertbox;
	
	@FindBy(xpath="//span[text()='New payment']")
	WebElement newpaymentbutton;
	
	@FindBy(xpath="//a[@id='logout-trigger']")
	WebElement logoutlink;
	
	public void paymentLink()
	{
		paymentlink.click();
	}
	
	public void contactListButton()
	{
		contactlist.click();
	}
	
	public void contactNames()
	{
		try
		{
			List<WebElement> elements=ldriver.findElements(By.xpath("//div[@class='modal-content']/pick-contact/div/div/a"));
		
			WebDriverWait wait=new WebDriverWait(ldriver,Duration.ofSeconds(30));
		
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		
			for(WebElement element:elements)
			{
				String names=element.getText();
			
				if(names.equalsIgnoreCase("ingrid"))
				{
					element.click();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void amount(String amt)
	{
		WebDriverWait wait=new WebDriverWait(ldriver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='input-group']/input"))).sendKeys(amt);
	}
	
	public void description(String desc)
	{
		description.sendKeys(desc);
	}
	
	public void nextButton()
	{
		nextbutton.click();
	}
	
	public void confirmButton()
	{
		confirmbutton.click();
	}
	
	public void alertCloseButton()
	{
		try
		{
			alertbox.click();
		}
		catch(Exception e)
		{
			System.out.println("Element is not present in DOM");
		}
	}
	
	public void newPaymentButton()
	{
		newpaymentbutton.click();
	}
	
	public void logoutLink()
	{
		logoutlink.click();
	}
}
