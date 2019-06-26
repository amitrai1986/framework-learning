package com.facebook.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By usernameField = By.id("email");
	By passwordField = By.id("pass");
	By loginButton = By.id("loginbutton");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void successfullLogin (String uName, String uPassword){
		driver.findElement(usernameField).sendKeys(uName);
		driver.findElement(passwordField).sendKeys(uPassword);
		driver.findElement(loginButton).click();
	}

}
