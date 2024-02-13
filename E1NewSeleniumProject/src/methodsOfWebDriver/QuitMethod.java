package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//to launch chrome browser 
		
		Thread.sleep(5000);
		
		driver.get("https://omayo.blogspot.com/");//to launch the web application
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Open a popup window")).click();// to open a new(child) browser window
		
		Thread.sleep(1000);
		
		//driver.close();
		driver.quit();//to close the parent as well as child browser windows.
	}

}
