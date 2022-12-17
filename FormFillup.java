package sqa_13_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FormFillup extends BaseURL2 {
	
	@Test (priority = 0)
	public void startWebsite() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void Form() throws InterruptedException {
		
		
///// ID Locator:		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Elma");
		Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.id("phone"));
		mobile.sendKeys("12345678910");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("elma@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123*te5");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Dhaka");
		Thread.sleep(2000);
		
		
///// NAME Locator
		
		WebElement send = driver.findElement(By.name("submit"));
		send.click();
		Thread.sleep(3000);
		
	}

}
