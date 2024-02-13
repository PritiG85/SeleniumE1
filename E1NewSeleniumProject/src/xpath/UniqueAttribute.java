package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// to launch chrome browser
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@name='emailId']"));
		email.sendKeys("priti@gmail.com");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Priti@8585");
		Thread.sleep(1000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();

	}

}
