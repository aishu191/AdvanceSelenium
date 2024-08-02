package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DwsBase {
	 public static WebDriver driver;
	public static void precondition(String browser){
		String browser1=javaUtility.logindata("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else  if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		
		}
		else {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("");
		
		public static void login() {
			String username=javaUtility.logindata("username");
			String password=javaUtility.logindata("password");
			String 
			
		}
		

	}

}
