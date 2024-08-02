package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.DwsLogin;

public class LoginFunction {
	@Test
	public void main() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		DwsLogin ref=new DwsLogin(driver);
		Thread.sleep(2000);
		ref.login_link();
		ref.username("aishwarya191@gmail.com");
		ref.password("aishwarya191");
		Thread.sleep(2000);
		ref.login_button();
		
		
	}

}
