package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseClass.BaseClassDWS;

public class ClickMultipleElement extends BaseClassDWS{
@Test
	public  void elementtoclick() throws InterruptedException {
	String url="https://demowebshop.tricentis.com/";
	
	Actions act=new Actions(driver);
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	List<WebElement> links=driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li[1]/a"));
	for (WebElement web: links) {
		String currenturl=driver.getCurrentUrl();
				if(url.equals(currenturl)) {
					driver.navigate().back();
					Thread.sleep(2000);
					
				}
				web.click();
	}
	//driver.findElement(By.xpath("//input[@value='Log-out']")).click();
	//driver.close();
	
	
		
		

	}

}
