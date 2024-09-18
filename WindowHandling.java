package week4Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> w = new ArrayList<String>(windowHandle);
		driver.switchTo().window(w.get(1));
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
				
		Set<String> windowHandle2 = driver.getWindowHandles();
		List<String> w2 =new ArrayList<String>(windowHandle2);
		driver.switchTo().window(w2.get(0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		Set<String> windowHandle3 = driver.getWindowHandles();
		List<String> w3= new ArrayList<String>(windowHandle3);
		driver.switchTo().window(w3.get(1));
		driver.findElement(By.xpath("//a[text()='dp1a1contact2']")).click();
		
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> w4= new ArrayList<String>(windowHandles4);
		driver.switchTo().window(w4.get(0));
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		String title = driver.getTitle();
		System.out.println("Page Title:" + title);
		
		
		
		
		
	}

}
