package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//to launch chrome browser 
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://desktop-t1ogao3/login.do");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		loginButton.click();
		

	}

}
