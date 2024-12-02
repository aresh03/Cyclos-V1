package com.cyclos.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cyclos.utilities.ReadConfig;

public class MonthlyInstallmentsPayment 
{
	WebDriver ldriver;
	
	public MonthlyInstallmentsPayment(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//table[contains(@class,'table-hover')]/thead/th")
	List<WebElement> tableheader;
	
	@FindBy(xpath="//table[contains(@class,'table-hover')]/tbody/tr/td")
	List<WebElement> tabledata;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[6]/div/input")
	WebElement noofinstallments;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[7]/div/div/div[2]")
	WebElement selectdateradiobutton;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[9]//textarea")
	WebElement description;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[8]/div/input")
	WebElement firstinstallmentdate;
	
	public void paymentType()
	{
		List<WebElement> paymenttype=ldriver.findElements(By.xpath("//div[@role='listbox']/a"));
		
		ReadConfig rc=new ReadConfig();
		
		String amt=rc.getPaymentType2();
		
		for(WebElement element:paymenttype)
		{
			String option=element.getText();
			
			if(option.equalsIgnoreCase(amt))
			{
				element.click();
			}
		}
	}
	
	public void tableHeader()
	{
		for(WebElement element:tableheader)
		{
			System.out.print(element.getText()+"       ");
		}
		
		System.out.println();
	}
	
	public void tableData()
	{
		for(WebElement element: tabledata)
		{
			System.out.print(element.getText()+"       ");
		}
		
		System.out.println();
	}
	
	public void numberOfInstallments()
	{
		noofinstallments.sendKeys("10");
	}
	
	public void selectDateRadioButton()
	{
		selectdateradiobutton.click();
	}
	
	public void description()
	{
		description.sendKeys("Payment Done");
	}
	
	public void firstInstallmentDate()
	{
		firstinstallmentdate.sendKeys("23-11-2024");
	}
}
