/**
 * 
 */
package com.facebook.Testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.facebook.Pages.LoginPage;

import helper.BrowserFactory;
import helper.BrowserFactoryStaticClass;


public class Login2 {
	WebDriver driver;
	@Test
	public void successLogin (){
		
	/*	BrowserFactory launch = new BrowserFactory();
		WebDriver driver = launch.launchBrowser("chrome","http://facebook.com");*/
		
		driver = BrowserFactoryStaticClass.launchBrowser("firefox", "http://facebook.com");
		
		
		LoginPage login = new LoginPage(driver);
		login.successfullLogin("amit.rai1986@gmail.com", "pa");
	}
	
/*	@AfterMethod
	public void quitB(){
		driver.quit();
	}*/

}
