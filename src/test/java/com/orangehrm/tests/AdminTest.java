package com.orangehrm.tests;

import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.AdminPage;
import com.orangehrm.pages.LoginPage;


public class AdminTest extends BaseTest{
 
	@Test
	public void verifyAdminPage() throws InterruptedException {
		Thread.sleep(3000);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("Admin", "admin123");
		Thread.sleep(3000);
		AdminPage adminPage = new AdminPage(driver);
		
		adminPage.clickAdminMenu();
		Thread.sleep(3000);
		
		adminPage.enterUsername("MSDhoni");
		Thread.sleep(3000);
		adminPage.clickAdminMenu();
		Thread.sleep(3000);
		adminPage.selectUserRole("ESS");
		Thread.sleep(3000);
		adminPage.enterEmployeeName("Mahendra Singh Dhoni");
		Thread.sleep(3000);
		adminPage.selectStatus("Enabled");
	
		adminPage.clickSearchButton();
		Thread.sleep(3000);
	}
	
	
}
