
package week4Assignments;

import java.time.Duration;

import org.openqa.selenium.By; import org.openqa.selenium.WebElement; import
org.openqa.selenium.chrome.ChromeDriver; import
org.openqa.selenium.chrome.ChromeOptions;

public class ActionAmazon {

	public static void main(String[] args) {

		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable Notification");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/"); driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@type='text']")).
		sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click
		(); WebElement price =
		driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")); String
		listPrice = price.getText(); 
		System.out.println("Price for OnePlus 9 Pro: " +	listPrice); 
		driver.findElement(By.xpath("(//span[@class='a-button a-button-base'])[1]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement rating =	driver.findElement(By.xpath("(//span[text()='28 ratings'])[1]")); 
		String star= rating.getText(); System.out.println("No of Rating for the product: " + star);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']")).click();
		WebElement subTotal = driver.findElement(By.xpath("(//span[text()='28,690.00'])[1]"));
		String subTot = subTotal.getText();
		System.out.println("Cart SubTotal: " + subTot);
		
		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);
		

	}

}



