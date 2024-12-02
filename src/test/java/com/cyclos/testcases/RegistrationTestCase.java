package com.cyclos.testcases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import com.cyclos.pageobject.Registration;

public class RegistrationTestCase extends BaseClass
{
	@Test
	public void registrationTest() throws InterruptedException, Exception
	{
		//driver.get(Url);
		
		Registration rp=new Registration(driver);
		
		rp.registerLink();
		
		logger.info("Clicked on Register Link");
		
		rp.name(Name);
		
		logger.info("Entered Name");
		
		rp.loginName(LoginName);
		
		logger.info("Entered Login Name");
		
		rp.email(Email);
		
		logger.info("Entered Email");
		
		rp.website(Website);
		
		logger.info("Entered Website");
		
		Thread.sleep(Duration.ofSeconds(15));
		
		rp.gender();
		
		rp.businessTypeDropdown();
		
		Thread.sleep(Duration.ofSeconds(20));
		
		rp.businessType();
		
		logger.info("Selected Business Type");
		
		/*rp.mobileNumber(Mobile);
		
		logger.info("Entered Mobile Number");
		
		rp.landlineNumber(Landline);
		
		logger.info("Entered Landline Number");*/
		
		rp.defineAddressToggleButton();
		
		Thread.sleep(Duration.ofSeconds(15));
		
		rp.address(Address);
		
		logger.info("Entered Address");
		
		rp.zipCode(Zipcode);
		
		logger.info("Entered Zip Code");
		
		rp.city(City);
		
		logger.info("Entered City");
		
		rp.state(State);
		
		logger.info("Entered State");
		
		rp.countryDropdown();
		
		Thread.sleep(Duration.ofSeconds(20));
		
		rp.country();
		
		logger.info("Selected Country");
		
		rp.nextButton();
		
		logger.info("Clicked on Next Button");
		
		Thread.sleep(Duration.ofSeconds(20));
		
		rp.password(Password);
		
		logger.info("Entered Password");
		
		rp.confirmPassword(ConfirmPassword);
		
		logger.info("Entered Confirm Password");
		
		rp.tcCheckbox();
		
		logger.info("Clicked on Terms & Conditions Checkbox");
		
		Thread.sleep(Duration.ofSeconds(180));
		
		rp.submitButton();
		
		logger.info("Clicked on Submit Button");
		
		logger.info("Registration Done Successfully");
		
		BaseClass.captureScreenShot(driver, "registrationTest");
	}
}
