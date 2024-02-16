package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSendValueinHiddenElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://en-gb.facebook.com/signup");
		WebElement hiddenElement = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='qspider'",hiddenElement);

	}

}
