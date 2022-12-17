package sqa_13_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverTest extends BaseURL2 {
	@Test (priority = 0)
	public void startWebsite() {
		driver.get("https://www.daraz.com.bd/");
		
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void hoverChecking() throws InterruptedException {
Actions action = new Actions(driver);
		
		WebElement motorBike = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement ridingGear = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		WebElement helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		
		action.moveToElement(motorBike).perform();
		Thread.sleep(3000);
		
		action.moveToElement(ridingGear).perform();
		Thread.sleep(3000);
		
		helmet.click();
		Thread.sleep(3000);
	}
}
