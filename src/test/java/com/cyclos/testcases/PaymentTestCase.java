package com.cyclos.testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.cyclos.pageobject.Login;
import com.cyclos.pageobject.MonthlyInstallmentsPayment;
import com.cyclos.pageobject.Payment;
import com.cyclos.pageobject.ScheduledPayment;

public class PaymentTestCase extends BaseClass
{
	@Test
	public void paymentTest() throws Exception
	{
		Login login=new Login(driver);
		
		logger.info("Logging into Website:");
		
		logger.info("----------------------");
		
		login.loginLink();
		
		logger.info("Clicked Login Link");
		
		login.userName(UserName);
		
		logger.info("Entered User Name");
		
		login.password(LoginPassword);
		
		logger.info("Entered Password");
		
		login.submitButton();
		
		logger.info("Clicked Submit Button");
		
		BaseClass.captureScreenShot(driver, "LoginTest");
		
		Payment payment=new Payment(driver);
		
		logger.info("-------------------------");
		
		payment.paymentLink();
		
		logger.info("Clicked Payment Link");
		
		Thread.sleep(Duration.ofSeconds(10));
		
		payment.contactListButton();
		
		payment.contactNames();
		
		logger.info("Selected Contact Name");
		
		payment.amount(Amount);
		
		logger.info("Entered Amount");
		
		payment.description(Description);
		
		logger.info("Entered Description");
		
		payment.nextButton();
		
		logger.info("Clicked Next Button");
		
		Thread.sleep(Duration.ofSeconds(30));
		
		payment.confirmButton();
		
		logger.info("Clicked Confirm Button");
		
		Thread.sleep(Duration.ofSeconds(30));
		
		payment.alertCloseButton();
		
		logger.info("Closed Message Box");
		
		//payment.newPaymentButton();
		
		//Thread.sleep(Duration.ofSeconds(20));
		
		//logger.info("Clicked on Next Payment Button");
		
		//BaseClass.captureScreenShot(driver, "paymentTest");
		
		payment.logoutLink();
		
		login.loginLink();
		
		login.userName(UserName);
		
		login.password(LoginPassword);
		
		login.submitButton();
		
		logger.info("---------------------------------");
		
		logger.info("Selecting Scheduled Payment Option");
		
		payment.paymentLink();
		
		payment.contactListButton();
		
		payment.contactNames();
		
		Thread.sleep(Duration.ofSeconds(10));
		
		payment.amount(Amount);
		
		ScheduledPayment sp=new ScheduledPayment(driver);
		
		sp.selectPayment();
		
		Thread.sleep(Duration.ofSeconds(10));
		
		sp.paymentType();
		
		logger.info("Scheduled Payment Option Selected");
		
		sp.paymentDate();
		
		//Thread.sleep(Duration.ofSeconds(15));
		
		sp.description();
		
		payment.nextButton();
		
		Thread.sleep(Duration.ofSeconds(20));
		
		payment.confirmButton();
		
		BaseClass.captureScreenShot(driver, "paymentTest-ScheduledPayment");
		
		payment.alertCloseButton();
		
		//Thread.sleep(Duration.ofSeconds(30));
		
		//payment.newPaymentButton();
		
		payment.logoutLink();
		
		login.loginLink();
		
		login.userName(UserName);
		
		login.password(LoginPassword);
		
		login.submitButton();
		
		logger.info("--------------------");
		
		logger.info("Selecting Monthly Installments Option");
		
		payment.paymentLink();
		
		payment.contactListButton();
		
		payment.contactNames();
		
		Thread.sleep(Duration.ofSeconds(20));
		
		payment.amount(Amount);
		
		sp.selectPayment();
		
		Thread.sleep(Duration.ofSeconds(10));
		
		MonthlyInstallmentsPayment mip=new MonthlyInstallmentsPayment(driver);
		
		mip.paymentType();
		
		mip.numberOfInstallments();
		
		mip.selectDateRadioButton();
		
		mip.firstInstallmentDate();
		
		//Thread.sleep(Duration.ofSeconds(15));
		
		mip.description();
		
		payment.nextButton();
		
		Thread.sleep(Duration.ofSeconds(15));
		
		mip.tableHeader();
		
		mip.tableData();
		
		payment.confirmButton();
		
		BaseClass.captureScreenShot(driver, "paymentTest-MonthlyInstallments");
		
		Thread.sleep(Duration.ofSeconds(30));
		
		payment.alertCloseButton();
		
		//Thread.sleep(Duration.ofSeconds(20));
		
		//payment.newPaymentButton();
		
		payment.logoutLink();
	}
}
