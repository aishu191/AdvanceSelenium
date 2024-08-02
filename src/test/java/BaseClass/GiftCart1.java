package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GiftCart1 extends DwsBase{
public static  ArrayList<String> readExcel() throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("C:\\Users\\expert\\Desktop\\TestData\\DwsLogin1.xlsx");
Workbook wb= WorkbookFactory.create(fis);
Sheet sheet=wb.getSheet("Sheet1");
ArrayList<String> arr = new ArrayList<String>();
for (int i =0; i<6; i++) {
arr.add(sheet.getRow(i).getCell(0).toString());
}
return arr;
}
public static void main(String[]args) throws InterruptedException {
preCondition();
Thread.sleep(1000);
login();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
Thread.sleep(1000);
login();
Thread.sleep(1000);
driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("rName");
Thread.sleep(1000);
driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("rEmail");
Thread.sleep(1000);
WebElement senderName=driver.findElement(By.id("giftcard_2_SenderName"));
senderName.clear();
senderName.sendKeys("");
WebElement senderEmail=driver.findElement(By.id("giftcard_2_SenderEmail"));
senderEmail.clear();
senderEmail.sendKeys("rutuja@gmail.com");
driver.findElement(By.id("giftcard_2_Message")).sendKeys("hi hello welcome to advance");
WebElement quantity=driver.findElement(By.id("addtocart_2_EnteredQuantity"));
quantity.clear();
quantity.sendKeys("2");
driver.findElement(By.id("add-to-cart-button-2")).click();
driver.findElement(By.className("cart-label")).click();
WebElement giftCart=driver.findElement(By.xpath("(//a[text()='$25 Virtual Gift Card\r\n'])[2]"));
if(giftCart.isDisplayed()) {
System.out.println("product is added successfully");
}
else {
System.out.println("product is not added");
}
Thread.sleep(2000);
postCondition();


}
private static void preCondition() {


}
}