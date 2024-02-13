package takeScreenshotPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByBrowserSpecificClas {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();//To store the reference with chromedriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
	File scr = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshots/Facebook.png");
	Files.copy(scr, dest);

	}

}
