package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollingOperationTillTargetPoint {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/");// to launch web Application without Maximization

		WebElement scrollTarget = driver.findElement(By.xpath("//h2[text()='News']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;// to perform type casting from WebDriver to
															// JavascriptExecutor
		js.executeScript("arguments[0].scrollIntoView(false)", scrollTarget);

	}

}
