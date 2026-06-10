package com.orangehrm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseTest{
  @Test
  public void verifyLogin() throws InterruptedException {
//	  WebDriver driver = new ChromeDriver();
//	  
//	  driver.manage().window().maximize();
//	  
//	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	  
//	  LoginPage loginPage = new LoginPage(driver);
//	  Thread.sleep(2000);
//	  loginPage.login("Admin", "admin123");
//  driver.quit();
	  
	  Thread.sleep(3000);
	  
	  LoginPage loginPage = new LoginPage(driver);
	  loginPage.login("Admin", "admin123");
	  
  }
}
