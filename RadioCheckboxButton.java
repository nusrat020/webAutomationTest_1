package sqa_13_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioCheckboxButton extends BaseURL2 {
	
	@Test (priority = 0)
	public void startWebsite() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void Button() throws InterruptedException {
		
		//Radio Button
		WebElement genderFemale = driver.findElement(By.id("female"));
		genderFemale.click();	
		Thread.sleep(4000);
		
		//Checkbox
		WebElement week = driver.findElement(By.id("tuesday"));
		week.click();
		Thread.sleep(4000);
		
		WebElement week1 = driver.findElement(By.id("friday"));
		week1.click();
		Thread.sleep(5000);
		
	}

}
