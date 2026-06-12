package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangehrm.base.BasePage;

public class LoginPage extends BasePage{
		
//	protected WebDriver driver;
	
	public  LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.xpath("//button[@type='submit']");
	
	public void login (String user, String pass)
	{
//		driver.findElement(username).sendKeys(user);
//		driver.findElement(password).sendKeys(pass);
//		driver.findElement(loginButton).click();
		
		type(driver.findElement(username),user);
		type(driver.findElement(password),pass);
		click(driver.findElement(loginButton));
	}
	
	
}
