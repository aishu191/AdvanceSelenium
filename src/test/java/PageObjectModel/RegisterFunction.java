package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.DwsRegister;

public class RegisterFunction {
	@Test
	public void main()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		DwsRegister ref=new DwsRegister(driver);
		ref.register_button();
		ref.radio1();
		ref.radio2();
		ref.firstName("Aishwarya");
		ref.lastName("Chaudhari");
		ref.email("aishwarya191@gmail.com");
		ref.password("aishwarya191");
		ref.cPassword("aishwarya191");
		ref.register();
		driver.close();
		
		
	}

}