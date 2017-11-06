package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PDPPage 
{
	WebDriver driver;
	 public PDPPage(WebDriver driver)
	 {
	  this.driver = driver;
	  //This initElements method will create  all WebElements
	  PageFactory.initElements(driver, this); 
	 }
	 
	 public @FindBy(how=How.CSS,using="#startDateInput")
	 WebElement startDateInput;

	 public @FindBy(how=How.CSS,using="#modal-startDateInput")
	 WebElement modalStartDateInput;
	 
	 public @FindBy(how=How.CSS,using=".stab-calendar-day-selectable")
	 WebElement startDate;
	 
	 public @FindBy(how=How.CSS,using=".stab-calendar-day-selectable:nth-child(5)")
	 WebElement endDate;
	 
	 public @FindBy(how=How.CSS,using="div.popover-content>div>div> div:nth-child(1) >div>div>input")
	 WebElement adultsCount;
	 
	 public @FindBy(how=How.CSS,using=".col-xs-12.text-right.done-row>a")
	 WebElement guestDone;
	 
	 public @FindBy(how=How.CSS,using=".cta-group .btn.cta.js-emailOwnerButton.btn-link.btn-inquiry-link>span")
	 WebElement sendMessageLink;
	 
	 public @FindBy(how=How.NAME,using="inquirerFirstName")
	 WebElement firstName;
	 
	 public @FindBy(how=How.NAME,using="inquirerLastName")
	 WebElement lastName;
	 
	 public @FindBy(how=How.NAME,using="inquirerPhoneNumber")
	 WebElement phoneNumber;
	 
	 public @FindBy(how=How.NAME,using="inquirerEmailAddress")
	 WebElement emailAddress;
	 
	 public @FindBy(how=How.NAME,using="comments")
	 WebElement messageComments;
	 
	 public @FindBy(how=How.CSS,using=".btn.btn-primary.js-submitInquiry")
	 WebElement sendEmail;
	 
	 public void wait_method_clickable(WebElement element)
	 {
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	 }
	 
	 public void wait_method_isVisible(WebElement element)
	 {
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOf(element));
	 }
}
