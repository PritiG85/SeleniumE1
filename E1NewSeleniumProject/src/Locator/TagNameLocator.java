package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();//to launch the browser
		driver.manage().window().maximize();//to maximize the  browser window
		driver.get("file:///C:/Users/dell/Desktop/WebElements/TextBox.html");//to launch the web application
		Thread.sleep(2000);
		WebElement textBox = driver.findElement(By.tagName("input"));//find password Textfield on the Webpage
		textBox.sendKeys("manager");//to pass the input to password Textfield
		//Note :- Inpute are pass to Username Textfield because it is the 1st element design with input tag.

	}

}
