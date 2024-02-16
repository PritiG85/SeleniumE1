package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisableElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");// to launch web Application
		Thread.sleep(2000);
		WebElement disableTextBox = driver.findElement(By.id("name"));
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js =(JavascriptExecutor) driver;//To perform type Casting
		js.executeScript("document.getElementById('name').value='admin'");// send value to disable element by using java script 
		
		//js.executeScript("document.getElementById('name').value=''");//To clear the content from a disable element
		Thread.sleep(2000);
		js.executeScript("arguments[0].value=''",disableTextBox);
	}

}
