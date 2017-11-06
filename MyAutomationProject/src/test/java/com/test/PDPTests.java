package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PDPTests 
{
	@Test
	   public void sendInquiry()
	  {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  try
	  { 
	   PDPPage pdp=new PDPPage(driver);
	   driver.manage().window().maximize();
	   driver.get("https://www.homeaway.com/vacation-rental/p8368685");
	   
	   pdp.wait_method_clickable(pdp.startDateInput);
	   pdp.startDateInput.click();
	   pdp.wait_method_isVisible(pdp.startDate);
	   pdp.startDate.click();
	   pdp.endDate.click();
	  
	   pdp.adultsCount.sendKeys("1");
	   pdp.guestDone.click();
	   pdp.wait_method_clickable(pdp.sendMessageLink);
	   pdp.sendMessageLink.click();
	   pdp.firstName.sendKeys("FirstName");
	   pdp.lastName.sendKeys("LastName");
	   pdp.phoneNumber.sendKeys("5125121234");
	   pdp.emailAddress.sendKeys("shivtest@devmail.wvrgroup.internal");
	   pdp.messageComments.sendKeys("Test Inquiry");
	   pdp.sendEmail.click();
	   Thread.sleep(1000);
	   
	  } catch (Exception e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  finally
	  {
	   driver.close();
	  }
	 }
}
