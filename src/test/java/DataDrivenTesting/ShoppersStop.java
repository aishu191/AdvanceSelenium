package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStop {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\TestData\\DWSLogin.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	    Sheet sheet=wb.getSheet("Sheet1");
	    String Firstname=sheet.getRow(0).getCell(0).toString();
	    String LastName= sheet.getRow(0).getCell(1).toString();
	    String email=sheet.getRow(0).getCell(0).toString();
	    String password= sheet.getRow(0).getCell(1).toString();
	    String confirmPassword=sheet.getRow(0).getCell(0).toString();
	   
	    
	    //System.out.println(password);
	    //System.out.println(email);
	    
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@class='navbar_Loginbutton__O9-64']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Create Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("First Name")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("First Name")).click();
		Thread.sleep(2000);
		
		
		
	
	   
	}
}
