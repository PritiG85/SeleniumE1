package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeChildWindow {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Set<String> allWindow = driver.getWindowHandles();//To get address of all window
		
		//For iterating and switching the control to the window one by one
		for(String wh:allWindow)
		{
			String title = driver.switchTo().window(wh).getTitle();
			if(title.equals("New Window"))
			{
			
			driver.manage().window().maximize();
			
			}
			
		}
		

	}

}
