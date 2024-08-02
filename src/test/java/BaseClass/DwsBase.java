package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;



public class DwsBase {
public static WebDriver driver;
public static void precondition(String browser) {

if (browser.equals("chrome")) {

driver = new ChromeDriver();
}
else if (browser.equals("edge")) {
driver = new EdgeDriver();

}
else if(browser.equals("firefox")){
driver = new FirefoxDriver();

}
else {
driver = new ChromeDriver();
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demowebshop.tricentis.com/");
}
public static void login() throws InterruptedException {
driver.findElement(By.linkText("Log in")).click();

Thread.sleep(2000);

driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");

driver.findElement(By.id("Password")).sendKeys("admin01");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Log in']")).click();

}
public static void postcondition() {

driver.findElement(By.className("Log out")).click();
driver.quit();
}
public static void closeWindow() {
driver.quit();
}


}