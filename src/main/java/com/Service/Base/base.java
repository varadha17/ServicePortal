package com.Service.Base;



//Java Imports
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//Selenium Imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class base {
	
	public static Properties prop;
	public static WebDriver driver;
	

	public base() throws IOException {
		
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\ServicePortal\\src\\main\\java\\com\\Properties\\config.properties");
		prop.load(fis);
		
	}
	
	
	public static void startBrowser() {
		
		String BrowserName = prop.getProperty("browser");
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\ServicePortal\\Drivers\\Chrome-V77\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		} else if(BrowserName.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\Flipkart.Demo\\Drivers\\InternetExplorer-32bit\\IEDriverServer32.exe");
			
			driver = new InternetExplorerDriver();
			
		} else if(BrowserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\Flipkart.Demo\\Drivers\\Firefox\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	

}
