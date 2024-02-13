package takeScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringWebDriver {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
	
		EventFiringWebDriver efwd =new EventFiringWebDriver(driver);
		
		File src = efwd.getScreenshotAs(OutputType.FILE);//to take the screenshot of webpqge
		
		File dest = new File("./screenshots/Instagram.jpg");//to specify the location and extension
		
		Files.copy(src, dest);// to copy and paste the screenshot in the specified folder
		

	}

}
