package com.orangehrm.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.base.LoginPage;

public class LoginTest {
  @Test
  public void verifyLogin() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  LoginPage loginPage = new LoginPage(driver);
	  Thread.sleep(2000);
	  loginPage.login("Admin", "admin123");
	  
	  
//	  driver.quit();
	  
	 
	  
  }
}
