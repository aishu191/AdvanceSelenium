package assertion;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class HardAssert1 {
	public void main() throws InterruptedException

	{

		String expected_url = "https://demowebshop.tricentis.com";

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com");

		String actual_url = driver.getCurrentUrl();

		// Assert Methods

		// assertEquals(expected_url,actual_url );

		assertNotEquals(expected_url, actual_url, "url is not matching");

		// it is same like systemoutprintln

		Reporter.log("i'm in dws page", true);// if we want to show the meassage in console and report
		Reporter.log("i'm in instagram", false);// if we want to show the message in report
		WebElement search = driver.findElement(By.xpath("//input[@value='Search store']"));
		search.sendKeys("mobile", Keys.ENTER);
		WebElement advance_search = driver.findElement(By.id("As"));
		advance_search.click();
		assertTrue(advance_search.isSelected(), "element is not selected");
		driver.findElement(By.id("Isc")).click();

	}

}
