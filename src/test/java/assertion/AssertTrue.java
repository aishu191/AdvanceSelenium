package assertion;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertTrue {
@Test
	public void main()
	{
	String excepted_url="https://demowebshop.tricentis.com/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String actual_url=driver.getCurrentUrl();
	//assertEquals(excepted_url,actual_url);
	assertNotEquals(excepted_url,actual_url,"url is not matching ");

	WebElement search_field=driver.findElement(By.id("small-searchterms"));
	search_field.sendKeys("mobile",Keys.ENTER);

	WebElement advacnce_search=driver.findElement(By.id("As"));
	advacnce_search.click();

	assertTrue(advacnce_search.isSelected());
	WebElement auto_search=driver.findElement(By.id("Isc"));
	auto_search.click();

	}
	}

