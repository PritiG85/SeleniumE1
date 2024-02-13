package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://desktop-t1ogao3/login.do");
		WebElement usnTB = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		
		usnTB.sendKeys("admin");
		Thread.sleep(2000);
		usnTB .clear();

	}

}
