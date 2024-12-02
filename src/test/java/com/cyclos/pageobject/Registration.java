package com.cyclos.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration  
{
	WebDriver ldriver;
	
	public Registration(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="register-link") 
	WebElement registerlink;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[1]/div/input")
	WebElement name;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[2]/div/input")
	WebElement loginname;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[3]/div[1]/input-field/input")
	WebElement email;
	
	@FindBy(id="website")
	WebElement website;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[5]/div/custom-field-input/radio-group-field/div/div[2]/label")
	WebElement gender;
	
	@FindBy(id="business_type")
	WebElement businesstypedropdown;
	
	@FindBy(xpath="(//div[@role='listbox'])[1]/a")
	List<WebElement> businesstype;
	
	//@FindBy(xpath="(//div[@class='label-value-container'])[7]/div/input-field/input")
	//WebElement mobile;
	
	//@FindBy(xpath="(//div[@class='label-value-container'])[8]/div/input-field/input")
	//WebElement landline;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[9]/div/div/label")
	WebElement defineaddresstoggle;
	
	@FindBy(xpath="(//div[@class='label-value-container'])[10]/div/input")
	WebElement address;
	
	@FindBy(id="zip")
	WebElement zipcode;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="region")
	WebElement state;
	
	@FindBy(id="country")
	WebElement countrydropdown;
	
	@FindBy(xpath="(//div[@role='listbox'])[2]/a")
	List<WebElement> country;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement nextbutton;
	
	@FindBy(xpath="(//input-field[@type='password'])[1]/label-value/div/div/input")
	WebElement password;
	
	@FindBy(xpath="(//input-field[@type='password'])[2]/label-value/div/div/input")
	WebElement confirmpassword;
	
	@FindBy(xpath="//div[@class='optional-agreements']/div/div/boolean-field/div/label")
	WebElement tccheckbox;
	
	@FindBy(xpath="(//action-button[contains(@class, 'd-inline-block')])[1]/button")
	WebElement submitbutton;
	
	public void registerLink()
	{
		registerlink.click();
	}
	
	public void name(String name1)
	{
		name.sendKeys(name1);
	}
	
	public void loginName(String username)
	{
		loginname.sendKeys(username);
	}
	
	public void email(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void website(String weburl)
	{
		website.sendKeys(weburl);
	}
	
	public void gender()
	{
		gender.click();
	}
	
	public void businessTypeDropdown()
	{
		businesstypedropdown.click();
	}
	
	public void businessType()
	{
		for(WebElement option:businesstype)
		{
			String business=option.getText();
			
			if(business.equalsIgnoreCase("technical"))
			{
				option.click();
			}
		}
	}
	
	/*public void mobileNumber(String number1)
	{
		mobile.sendKeys(number1);
	}
	
	public void landlineNumber(String number2)
	{
		landline.sendKeys(number2);
	}*/
	
	public void defineAddressToggleButton()
	{
		defineaddresstoggle.click();
	}
	
	public void address(String addr)
	{
		address.sendKeys(addr);
	}
	
	public void zipCode(String postcode)
	{
		zipcode.sendKeys(postcode);
	}
	
	public void city(String place)
	{
		city.sendKeys(place);
	}
	
	public void state(String region)
	{
		state.sendKeys(region);
	}
	
	public void countryDropdown()
	{
		countrydropdown.click();
	}
	
	public void country()
	{
		for(WebElement option:country)
		{
			String countries=option.getText();
			
			if(countries.equalsIgnoreCase("india"))
			{
				option.click();
			}
		}
	}
	
	public void nextButton()
	{
		nextbutton.click();
	}
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void confirmPassword(String cpwd)
	{
		confirmpassword.sendKeys(cpwd);
	}
	
	public void tcCheckbox()
	{
		tccheckbox.click();
	}
	
	public void submitButton()
	{
		submitbutton.click();
	}
}
