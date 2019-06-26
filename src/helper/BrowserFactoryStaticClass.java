package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactoryStaticClass {
	static WebDriver driver;
	public static WebDriver launchBrowser(String browserName, String url){
		if(browserName.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browsers_Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browsers_Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
		
		}

}
