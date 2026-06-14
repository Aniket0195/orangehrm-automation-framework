package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.orangehrm.base.BasePage;

public class AdminPage extends BasePage{
	
	public AdminPage(WebDriver driver)
	{
		super(driver);
	}
	
	By adminMenu = By.xpath("//span[text()='Admin']");
	By userName = By.cssSelector("input.oxd-input");

	
	public void clickAdminMenu() {
		
		click(driver.findElement(adminMenu));
	}
	
	public void enterUsername(String user)
	{
		type(driver.findElement(userName),user);
	}
	
 
}
