package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();//to lauch chrome browser
		driver.manage().window().maximize();//to maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//wait for implicit wait
		driver.get("https://www.instagram.com/");//to lauch the webApplication
		driver.findElement(By.name("username")).sendKeys("qspiders");//to send input to the username
		
	}

}
