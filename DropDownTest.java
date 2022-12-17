package sqa_13_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest extends BaseURL2{
	
	@Test (priority = 0)
	public void startWebsite() {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 1)
	public void place() throws InterruptedException {
		
		WebElement visitPlace = driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select select = new Select(visitPlace);
		
		//Using INDEX
		select.selectByIndex(1);
		Thread.sleep(5000);
		
		//Using Value
		select.selectByValue("1");
		Thread.sleep(3000);
		
		//Using visibility text
		select.selectByVisibleText("Norway");
		Thread.sleep(3000);
	}


}
