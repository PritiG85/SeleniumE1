package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();//to launch the browser
		driver.manage().window().maximize();//to maximize the  browser window
		driver.get("file:///C:/Users/dell/Desktop/WebElements/TextBox.html");//to launch the web application
		Thread.sleep(2000);
		 WebElement passTextBox = driver.findElement(By.className("pass-className"));
		 passTextBox.sendKeys("Admin");
	}

}
