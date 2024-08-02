package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	public void dwsPage()
	{
	String excepted_url="https://demowebshop.tricentis.com/";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.get("https://demowebshop.tricentis.com/");
	String actual_url=driver.getCurrentUrl();
	//assertEquals(excepted_url,actual_url);
	SoftAssert soft=new SoftAssert();
	soft.assertNotEquals(excepted_url,actual_url,"url is not matching");
	Reporter.log("iam in dws homepage",true);
	WebElement search_field=driver.findElement(By.id("small-searchterms"));

	search_field.sendKeys("mobile",Keys.ENTER);

	WebElement advance_search = driver.findElement(By.id("As"));

	//advance_search.click();
	//assertTrue(advance_search.isSelected(),"element is selected");

	// assertFalse(advance_search.isSelected());

	//WebElement auto_search = driver.findElement(By.id("Isc"));
	//auto_search.click();

	soft.assertTrue(advance_search.isSelected(),"element is not selected");
	soft.assertAll();
	driver.findElement(By.id("Isc")).click();


	}


}
