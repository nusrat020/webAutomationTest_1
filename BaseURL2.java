package sqa_13_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseURL2 {
	static String itera = "https://itera-qa.azurewebsites.net/home/automation";
	WebDriver driver;
	
	@BeforeSuite             
////for browser initialization	
	public void start() throws InterruptedException {
		String browser = System.getProperty("browser", "chrome"); 
		
		if (browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		Thread.sleep(5000);
	} 	
	@AfterSuite              
	public void end() {
		driver.quit();  //driver close
	}

}
