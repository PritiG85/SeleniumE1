package HandlingFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPassingFrameElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));//to find the frame by xpath
		driver.switchTo().frame( frameElement);
		driver.findElement(By.id("regEmail")).sendKeys("9022405542");

	}

}
