package com.M42.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.M42.utils.BaseClass;
import com.M42.utils.selenium_Function_utils;

public class RegistrationPage extends BaseClass {

	
	
	@FindBy(xpath = "//*[@href='/signup']")
	WebElement Signup;
	
	@FindBy(xpath = "//*[@id='EmiratesIdNumber']")
	WebElement EmiratesIdNumber;

	@FindBy(xpath = "//*[@id='EmiratesExpiryDate']")
	WebElement EmiratesExpiryDate;

	@FindBy(xpath = "//*[@id='QRFirstName']")
	WebElement QRFirstName;

	@FindBy(xpath = "//*[@id='QRLastName']")
	WebElement QRLastName;
/*
	@FindBy(xpath = "//*[@class='gender ']")
	String gender;

	@FindBy(xpath = "//*[@for='Male']")
	String Male;

	@FindBy(xpath = "//*[@for='Female']")
	String Female;

*/
	@FindBy(xpath = "//*[@id='DateofBirth']")
	WebElement DateofBirth;

	@FindBy(xpath = "//*[@id='Email']")
	WebElement Email;

	@FindBy(xpath = "//*[@class='gmail-dropdown-item']")
	WebElement gmaildomain;
	
	
	@FindBy(xpath = "//*[@id='mobileNumber']")
	WebElement mobileNumber;

	@FindBy(xpath = "//*[@id='QRButton']")
	WebElement QRButton;

	public void PatientRegistration(String EID,String Expirydate, String Firstname, String Lastname,String DOB,
			String email, String Mobilenumber) {
		
		//selenium_Function_utils.click(driver, Signup);
		selenium_Function_utils.explicitwait(driver);
		selenium_Function_utils.jstype(driver, EID, EmiratesIdNumber);
		selenium_Function_utils.genderselection(driver);
		selenium_Function_utils.jstype(driver, Expirydate, EmiratesExpiryDate);
		selenium_Function_utils.jstype(driver, Firstname, QRFirstName);
		selenium_Function_utils.jstype(driver, Lastname, QRLastName);
		selenium_Function_utils.jstype(driver, DOB, DateofBirth);
		selenium_Function_utils.jstype(driver, email, Email);
		//selenium_Function_utils.click(driver, gmaildomain);
		selenium_Function_utils.jstype(driver, Mobilenumber, mobileNumber);
		selenium_Function_utils.screenshot(driver,".\\screenshot\\before_Reg_Click.jpg");
		selenium_Function_utils.jsclick(driver, QRButton);
		selenium_Function_utils.screenshot(driver,".\\screenshot\\After_Reg_Click.jpg");

	}
}
