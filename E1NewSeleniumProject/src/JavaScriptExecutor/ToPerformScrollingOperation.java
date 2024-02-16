package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollingOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");//to launch web Application
		
		 JavascriptExecutor js =( JavascriptExecutor) driver;//to perform type casting from WebDriver to JavascriptExecutor
		 
		 js.executeScript("window.scrollBy(0,1000)");//to perform Scroll down operation
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(0,-500)");//to perform scroll up operation
		 Thread.sleep(2000);
	}

}
