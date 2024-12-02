package com.cyclos.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	WebDriver ldriver;
	
	public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="login-link")
	WebElement loginclick;
	
	@FindBy(xpath="(//div[@class='input-group-prepend'])[1]/following::input[1]")
	WebElement user;
	
	@FindBy(xpath="(//div[@class='input-group-prepend'])[2]/following::input")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submitbutton;
	
	@FindBy(xpath="//div[@class='personal-label']")
	WebElement loginconfirmation;
	
	public void loginLink()
	{
		loginclick.click();
	}
	
	public void userName(String username)
	{
		user.sendKeys(username);
	}
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void submitButton()
	{
		submitbutton.click();
	}
	
	public void loginConfirmation()
	{
		System.out.println(loginconfirmation.getText());
	}
}
