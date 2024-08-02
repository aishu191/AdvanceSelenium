package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



	public class GiftCart extends DwsBase{
		public static void main(String[] args) throws InterruptedException {
		precondition("chrome");
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.className("recipient-name")).sendKeys("Rutuja");
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("rutujarenke2001@gmail.com");
		WebElement senderName=driver.findElement(By.id("giftcard_2_SenderName"));
		senderName.clear();
		senderName.sendKeys("Rutuja");
		WebElement senderEmail=driver.findElement(By.id("giftcard_2_SenderEmail"));
		senderEmail.clear();
		senderEmail.sendKeys("aishwarya@gmail.com");
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
		postcondition();


		}





	}

