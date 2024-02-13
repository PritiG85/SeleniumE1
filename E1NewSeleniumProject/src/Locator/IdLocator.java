package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();//to launch the browser
		driver.manage().window().maximize();//to maximize the  browser window
		driver.get("https://www.facebook.com/");//to launch the web application
		Thread.sleep(2000);
		WebElement usnTextBox = driver.findElement(By.id("email"));
		usnTextBox.sendKeys("priti9gaikwad@gmail.com");
		Thread.sleep(2000);
		WebElement passTextBox = driver.findElement(By.id("pass"));
		passTextBox.sendKeys("Priti@8585");
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		Thread.sleep(2000);
		

	}

}
