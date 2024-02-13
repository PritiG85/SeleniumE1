package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLocator {

	public static void main(String[] args) throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver();//to launch the browser
		driver.manage().window().maximize();//to maximize the  browser window
		driver.get("https://www.facebook.com/");//to launch the web application
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.linkText("forgotten password"));
		link.click();
		
	}

}
