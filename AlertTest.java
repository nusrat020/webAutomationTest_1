package sqa_13_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertTest extends BaseURL2 {
	
	@Test (priority = 0)
	public void startWebsite() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
	}
	
	@Test (priority = 1)
	public void alertChecking() throws InterruptedException {
		WebElement jsAlerts = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPromt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		SoftAssert softAssert = new SoftAssert();
		
		jsAlerts.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();   //for accepting
		Thread.sleep(5000);
		String resultText = result.getText();
	//	Assert.assertEquals(resultText, "You successfully clicked an alert");    ///Hard Assertion
		softAssert.assertEquals(resultText, "You successfully clicked an alert"); //soft assertion
		
		
		jsConfirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();    //for accepting
		Thread.sleep(3000);
		
		jsConfirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();   //for canceling
		Thread.sleep(3000);
		
		
		jsPromt.click();
		driver.switchTo().alert().sendKeys("Hello Alerts");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();   //for accepting
		Thread.sleep(5000);
		
		softAssert.assertAll();
		
	}

}
