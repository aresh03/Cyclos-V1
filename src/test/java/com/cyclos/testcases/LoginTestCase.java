package com.cyclos.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.cyclos.pageobject.Login;

public class LoginTestCase extends BaseClass
{
	@Test
	public void loginTest() throws Exception
	{
		Login login=new Login(driver);
		
		login.loginLink();
		
		logger.info("Clicked Login Link");
		
		login.userName(UserName);
		
		logger.info("Entered User Name");
		
		login.password(LoginPassword);
		
		logger.info("Entered Password");
		
		login.submitButton();
		
		logger.info("Clicked Submit Button");
		
		login.loginConfirmation();
		
		logger.info("Login Successfull");
		
		BaseClass.captureScreenShot(driver, "loginTest");
	}
}
