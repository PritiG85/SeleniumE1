package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorizontalOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");//to launch web Application without Maximization
		
		 JavascriptExecutor js =( JavascriptExecutor) driver;//to perform type casting from WebDriver to JavascriptExecutor
		 
		 js.executeScript("window.scrollBy(500,0)");//to perform Scroll right operation
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(-500,0)");//to perform scroll left operation
		 Thread.sleep(2000);
		 driver.close();


	}

}
