package com.cyclos.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties properties;
	
	String filepath="C:\\Users\\pc\\eclipse-workspace\\Cyclos-V1\\configuration\\config.properties";
	
	public ReadConfig()
	{
		try
		{
			properties=new Properties();
			
			FileInputStream fis=new FileInputStream(filepath);
			
			properties.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getBrowser()
	{
		String browser=properties.getProperty("Browser");
		
		if(browser!=null)
		{
			return browser;
		}
		else
		{
			throw new RuntimeException("browser value is not specified in configuration file");
		}
	}
	
	public String getUrl()
	{
		String url=properties.getProperty("Url");
		
		if(url!=null)
		{
			return url;
		}
		else
		{
			throw new RuntimeException("url value is not specified in configuration file");
		}
	}
	
	public String getName()
	{
		String name=properties.getProperty("Name");
		
		if(name!=null)
		{
			return name;
		}
		else
		{
			throw new RuntimeException("name value is not specified in configuration file");
		}
	}
	
	public String getLoginName()
	{
		String loginname=properties.getProperty("LoginName");
		
		if(loginname!=null)
		{
			return loginname;
		}
		else
		{
			throw new RuntimeException("loginname value is not specified in configuration file");
		}
	}
	
	public String getEmail()
	{
		String email=properties.getProperty("Email");
		
		if(email!=null)
		{
			return email;
		}
		else
		{
			throw new RuntimeException("email value is not specified in configuration file");
		}
	}
	
	public String getWebsite()
	{
		String website=properties.getProperty("Website");
		
		if(website!=null)
		{
			return website;
		}
		else
		{
			throw new RuntimeException("website value is not specified in configuration file");
		}
	}
	
	public String getMobile()
	{
		String mobile=properties.getProperty("Mobile");
		
		if(mobile!=null)
		{
			return mobile;
		}
		else
		{
			throw new RuntimeException("mobile value is not specified in configuration file");
		}
	}
	
	public String getLandline()
	{
		String landline=properties.getProperty("Landline");
		
		if(landline!=null)
		{
			return landline;
		}
		else
		{
			throw new RuntimeException("landline value is not specified in configuration file");
		}
	}
	
	public String getAddress()
	{
		String address=properties.getProperty("Address");
		
		if(address!=null)
		{
			return address;
		}
		else
		{
			throw new RuntimeException("address value is not specified in configuration file");
		}
	}
	
	public String getZipcode()
	{
		String zipcode=properties.getProperty("Zipcode");
		
		if(zipcode!=null)
		{
			return zipcode;
		}
		else
		{
			throw new RuntimeException("zipcode value is not specified in configuration file");
		}
	}
	
	public String getCity()
	{
		String city=properties.getProperty("City");
		
		if(city!=null)
		{
			return city;
		}
		else
		{
			throw new RuntimeException("city value is not specified in configuration file");
		}
	}
	
	public String getState()
	{
		String state=properties.getProperty("State");
		
		if(state!=null)
		{
			return state;
		}
		else
		{
			throw new RuntimeException("state value is not specified in configuration file");
		}
	}
	
	public String getPassword()
	{
		String password=properties.getProperty("Password");
		
		if(password!=null)
		{
			return password;
		}
		else
		{
			throw new RuntimeException("password value is not specified in configuration file");
		}
	}
	
	public String getConfirmPassword()
	{
		String confirmpassword=properties.getProperty("ConfirmPassword");
		
		if(confirmpassword!=null)
		{
			return confirmpassword;
		}
		else
		{
			throw new RuntimeException("confirmpassword value is not specified in configuration file");
		}
	}
	
	public String getUserName()
	{
		String username=properties.getProperty("UserName");
		
		if(username!=null)
		{
			return username;
		}
		else
		{
			throw new RuntimeException("username value is not specified in configuration file");
		}
	}
	
	public String getLoginPassword()
	{
		String loginpassword=properties.getProperty("LoginPassword");
		
		if(loginpassword!=null)
		{
			return loginpassword;
		}
		else
		{
			throw new RuntimeException("loginpassword value is not specified in configuration file");
		}
	}
	
	public String getAmount()
	{
		String amount=properties.getProperty("Amount");
		
		if(amount!=null)
		{
			return amount;
		}
		else
		{
			throw new RuntimeException("amount value is not specified in configuration file");
		}
	}
	
	public String getDescription()
	{
		String description=properties.getProperty("Description");
		
		if(description!=null)
		{
			return description;
		}
		else
		{
			throw new RuntimeException("description value is not specified in configuration file");
		}
	}
	
	public String getPaymentType1()
	{
		String payment=properties.getProperty("PaymentType-1");
		
		if(payment!=null)
		{
			return payment;
		}
		else
		{
			throw new RuntimeException("payment value is not specified in configuration file");
		}
	}
	
	public String getPaymentType2()
	{
		String payment=properties.getProperty("PaymentType-2");
		
		if(payment!=null)
		{
			return payment;
		}
		else
		{
			throw new RuntimeException("payment value is not specified in configuration file");
		}
	}
	
	public String getPaymentType3()
	{
		String payment=properties.getProperty("PaymentType-3");
		
		if(payment!=null)
		{
			return payment;
		}
		else
		{
			throw new RuntimeException("payment value is not specified in configuration file");
		}
	}
	
}
