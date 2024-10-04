package mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Practicle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));
		driver.get("https://www.bhaane.com");
		Thread.sleep(2000);
		
		//To close popup
		driver.findElement(By.id("mdiv")).click();
		
		// To create an account
		//driver.findElement(By.xpath("//*[@id=\"top-header\"]/div/div/div[4]/ul/li[2]")).click();
		//driver.findElement(By.xpath("//div[text()='sign up >']")).click();
		//driver.findElement(By.name("first_name")).sendKeys("Ranjanq");
		//driver.findElement(By.name("last_name")).sendKeys("Masq");
		//driver.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[1]/div[3]/div/input")).sendKeys("mastud3@gmail.com");
		//driver.findElement(By.name("mobile")).sendKeys("7796541333");
		//driver.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[1]/div[5]/div/input")).sendKeys("Mastud@123");
		//driver.findElement(By.xpath("//*[@id=\"modal-register\"]/div/form/div[2]/button")).click();
		//Thread.sleep(2000);
		
		// to login 
		driver.findElement(By.xpath("//*[@id=\"top-header\"]/div/div/div[4]/ul/li[2]")).click();
		driver.findElement(By.name("email")).sendKeys("mastud3@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Mastud@123");
		driver.findElement(By.xpath("//button[text()='submit']")).click();
		
		// Search product
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/span[text()=\"tops\"]")).click();
		
		//driver.findElement(By.xpath("//span[@class=\"quick-add-to-cart\"][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\"Bhaane sky velha shirt\"]")).click();
		
		driver.findElement(By.xpath("//input[@name='id' and @data-name=\"xl\"]")).click();
		
		driver.findElement(By.xpath("//span[@class=\"bold add-to-bag\" and text()=\"add to bag\"]")).click();
		//WebElement searchButton = driver.findElement(By.xpath("//img[@class=\"ico trigger-search\"]"));
		
		//searchButton.sendKeys("top");
		//searchButton.click();
		//driver.findElement(By.xpath("//a[text()='jumpsuits']")).click();
		
		
		
}
}
