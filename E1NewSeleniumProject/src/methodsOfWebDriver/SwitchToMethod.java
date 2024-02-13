package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// to launch chrome browser
		Thread.sleep(5000);
		driver.get("https://www.google.in/");//launch the google application
		driver.manage().window().maximize();//for maximize the screen
		Thread.sleep(2000);
		WebElement activeEle = driver.switchTo().activeElement();
		activeEle.sendKeys("java",Keys.ENTER);//to click on enter button
		Thread.sleep(5000);
		driver.close();

	}

}
