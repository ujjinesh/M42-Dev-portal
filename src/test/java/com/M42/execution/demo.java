package com.M42.execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.M42.utils.TestData;
import com.M42.utils.selenium_Function_utils;

public class demo {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://mh-dev-patientportal.azurewebsites.net/");

		TestData td = new TestData();
		String EID = td.Emirateid();
		selenium_Function_utils.explicitwait(driver, "//*[text()='New User ? Sign up here']");

		driver.findElement(By.xpath("//*[text()='New User ? Sign up here']")).click();
		
		selenium_Function_utils.explicitwait(driver, "//*[@id='EmiratesIdNumber']");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='784-1990-2345678-9';", driver.findElement(By.xpath("//*[@id='EmiratesIdNumber']")));
		
		/*
		 
		 //JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id='EmiratesIdNumber']")));
		
		 
		 //Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='EmiratesIdNumber']")).click();
		
		
		driver.findElement(By.xpath("//*[@id='EmiratesIdNumber']")).sendKeys("784-1990-2345678-9");
		new Actions(driver)
        .sendKeys("784-1990-2345678-9")
        .perform();
        */
	}

}
