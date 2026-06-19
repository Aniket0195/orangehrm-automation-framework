package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangehrm.base.BasePage;


public class AdminPage extends BasePage{
	
	public AdminPage(WebDriver driver)
	{
		super(driver);
	}
	// Issue #1 Fix
	By adminMenu = By.xpath("//span[text()='Admin']");
	//By userName = By.cssSelector("input.oxd-input");
	//By userName = By.className("oxd-input oxd-input--active");
	By userName = By.xpath("//label[normalize-space()='Username']/following::input[1]");
//	By employeeName= By.xpath("//label[normalize-space()='Employee Name']/following::input[1]");
	By employeeName = By.cssSelector("input[placeholder='Type for hints...']");
	By userRoleDropdown = By.xpath("//label[normalize-space()='User Role']/following::div[contains(@class,'oxd-select-text')][1]");
	By searchButton =  By.xpath("//button[@type='submit']");
	By statusDropdown = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
	
	public void clickAdminMenu() {
		
		click(driver.findElement(adminMenu));
	}
	
	public void enterUsername(String user)
	{
		type(driver.findElement(userName),user);
	}
	 
	public void selectUserRole(String role)
	{
		click(driver.findElement(userRoleDropdown));
		
		  By roleOption = By.xpath(
			        "//div[@role='option']//span[normalize-space()='" + role + "']"
			    );
		  
		  click(driver.findElement(roleOption));
	}
 
	public void enterEmployeeName(String user)
	{
		type(driver.findElement(employeeName), user);
	}
	public void clickSearchButton()
	{
		click(driver.findElement(searchButton));
	}
	public void selectStatus(String status)
	{
		click(driver.findElement(statusDropdown));
		By statusOption = By.xpath("//div[@role='option']//span[normalize-space()='" + status + "']");
		click(driver.findElement(statusOption));
		
	}
}
