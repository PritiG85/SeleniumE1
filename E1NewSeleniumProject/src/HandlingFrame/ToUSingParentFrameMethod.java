package HandlingFrame;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToUSingParentFrameMethod {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("chat-icon")).click();
		driver.switchTo().parentFrame();
	driver.findElement(By.id("chat-fc-name")).sendKeys("Priti Gaikwad");
	//driver.findElement(By.id("chat-fc-email")).sendKeys("priti8gaiwkad@gmail.com");
	

	}

}
