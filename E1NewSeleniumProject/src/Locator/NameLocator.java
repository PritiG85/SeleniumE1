package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();//to launch the browser
		driver.manage().window().maximize();//to maximize the  browser window
		driver.get("http://desktop-t1ogao3/login.do");//to launch the web application
		Thread.sleep(2000);
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		Thread.sleep(2000);
		
		WebElement loginTB = driver.findElement(By.className("initial"));
		loginTB.click();		
		
		  
	}

}
