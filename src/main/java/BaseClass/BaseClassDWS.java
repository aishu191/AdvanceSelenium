package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClassDWS {
	public  static WebDriver driver;
	
	@BeforeClass
	public void precondition(String browser,String url ) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	
	}
@BeforeMethod
public void login() {
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("admin01");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
@AfterMethod
public void logout() {
	driver.findElement(By.className("ico-logout")).click();
	
}
@AfterClass
public void postcondition() {
	driver.quit();
}


}
