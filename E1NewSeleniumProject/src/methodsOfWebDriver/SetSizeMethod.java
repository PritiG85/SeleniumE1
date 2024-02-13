package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//to launch chrome browser 
		Thread.sleep(100);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Dimension targetSize = new Dimension(700,500);
		 driver.manage().window().setSize(targetSize);
		 Thread.sleep(5000);
		 driver.close();
	}

}
