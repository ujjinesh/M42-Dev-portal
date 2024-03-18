package com.M42.execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.M42.utils.TestData;
import com.M42.utils.selenium_Function_utils;

public class ExecutionWithMouseActions {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://mh-dev-patientportal.azurewebsites.net/signup");

		TestData td = new TestData();
		String EID = td.Emirateid();
		String exiprydate = td.DateAndMonth() + "/" + td.futureyear();

		selenium_Function_utils.explicitwait(driver, "//*[@id='EmiratesIdNumber']");
		
		//selenium_Function_utils.click(driver, "//*[@id='EmiratesIdNumber']");
		
		//driver.findElement(By.xpath("//*[@id='EmiratesIdNumber']")).click();
		
		//selenium_Function_utils.jsclick(driver, driver.findElement(By.xpath("//*[@id='EmiratesIdNumber']")));
		
		selenium_Function_utils.Mousesendkeys(driver, EID);
		selenium_Function_utils.Mousesendkeys(driver, driver.findElement(By.xpath("//*[@id='EmiratesExpiryDate']")),
				exiprydate);

		selenium_Function_utils.Mousesendkeys(driver, driver.findElement(By.xpath("//*[@id='QRFirstName']")),
				td.getFirstname());
		selenium_Function_utils.Mousesendkeys(driver, driver.findElement(By.xpath("//*[@id='QRLastName']")),
				td.getLastname());
		selenium_Function_utils.genderselection(driver);

		selenium_Function_utils.Mousesendkeys(driver, driver.findElement(By.xpath("//*[@id='DateofBirth']")),
				td.DateAndMonth() + "/" + EID.substring(4, 8));
		selenium_Function_utils.Mousesendkeys(driver, driver.findElement(By.xpath("//*[@id='Email']")), td.getEmail());
		selenium_Function_utils.MouseHoverelement(driver,
				driver.findElement(By.xpath("//*[@class='gmail-dropdown-item']")));
		selenium_Function_utils.Mousesendkeys(driver, driver.findElement(By.xpath("//*[@id='mobileNumber']")),
				td.mobilenumber());
		selenium_Function_utils.MouseClick(driver, driver.findElement(By.xpath("//*[text()='Save & Continue']")));

	}

}
