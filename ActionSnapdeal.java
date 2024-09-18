package week4Assignments;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class ActionSnapdeal {

	public static void main(String[] args) {


		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable Notifications");
		
		ChromeDriver driver= new ChromeDriver(opt);
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions mouse = new Actions(driver);
		WebElement menFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		mouse.moveToElement(menFashion).build().perform();
		
		driver.findElement(By.xpath("(//span[@class='linkTest'])[1]")).click();
		String shoeCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Totoal Sports Shoes Listed : " + shoeCount);
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		/*
		 * mouse.moveByOffset(0, 250);
		 * 
		 * WebElement checkbox =
		 * driver.findElement(By.xpath("//label[@for='Color_s-Black']"));
		 * checkbox.click();
		 */
		 WebElement hover = driver.findElement(By.xpath("(//div[@class='bg-image hidden'])[1]"));
		 mouse.moveToElement(hover).perform();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String discountAmount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println(discountAmount);
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
		
	}

}
