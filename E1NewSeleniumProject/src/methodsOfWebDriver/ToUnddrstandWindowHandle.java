package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnddrstandWindowHandle {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		String perentWindow = driver.getWindowHandle();//To get address of new window
		System.out.println(perentWindow);
		String parenttitle = driver.getTitle();
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		
		Set<String> allWindows = driver.getWindowHandles();//To get title of all window
		//To iterate and switch the control to the window one by one
		for(String wh:  allWindows)
		{
			String title = driver.switchTo().window(wh).getTitle();
		
			if(!title.equals(parenttitle))//To compare the title with parent window title
		
			{
				driver.close();//To close the child window
			}
			
		}
		
		
	}

}
