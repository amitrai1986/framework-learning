/**
 * 
 */
package com.facebook.Testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.facebook.Pages.LoginPage;
public class Login {
	@Test
	public void successLogin (){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		
		
		LoginPage login = new LoginPage(driver);
		login.successfullLogin("amit.rai1986@gmail.com", "pa");
	}
	
/*	@AfterMethod
	public void quitB(){
		driver.quit();
	}*/

}
