package basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTestCase {


@Test(priority = 'b', invocationCount = 1)
public void dws() throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(1000);
driver.close();
}

@Test (priority = 'a', invocationCount = 1, threadPoolSize = 0)

public void csk () throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.chennaisuperkings.com/");
Thread.sleep(1000);
driver.close();

}

@Test (priority = 1, invocationCount = 1)
public void rcb() throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.royalchallengers.com/");
Thread.sleep(1000);
driver.close();


}
}