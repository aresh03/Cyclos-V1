package com.cyclos.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cyclos.utilities.ReadConfig;

public class ScheduledPayment 
{
	WebDriver ldriver;
	
	ReadConfig rc=new ReadConfig();
	
	public ScheduledPayment(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="(//div[@class='label-value-container'])[5]/div/div/button/div")
	WebElement selectpayment;
	
	@FindBy(xpath="//div[@role='listbox']/a")
	List<WebElement> paymenttype;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[6]/div/input")
	WebElement paymentdate;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[7]//textarea")
	WebElement description;
	
	public void selectPayment()
	{
		selectpayment.click();
	}
	
	public void paymentType()
	{
		String amt=rc.getPaymentType1();
		
		for(WebElement element:paymenttype)
		{
			String option=element.getText();
			
			if(option.equalsIgnoreCase(amt))
			{
				element.click();
			}
		}
	}
	
	public void paymentDate()
	{
		paymentdate.sendKeys("23-11-2024");
	}
	
	public void description()
	{
		description.sendKeys("Payment Done");
	}
}
