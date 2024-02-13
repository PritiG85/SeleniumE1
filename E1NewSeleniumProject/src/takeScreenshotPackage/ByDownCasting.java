package takeScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDownCasting {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		//To Downcasting
		RemoteWebDriver rwd = (RemoteWebDriver) driver;//to perform Downcasting
		
		File src = rwd.getScreenshotAs(OutputType.FILE);//to take the screenshot of webpqge
		
		File dest = new File("./screenshots/Flipkart.jpg");//to specify the location and extension
		
		Files.copy(src, dest);// to copy and paste the screenshot in the specified folder
		
	}

}
