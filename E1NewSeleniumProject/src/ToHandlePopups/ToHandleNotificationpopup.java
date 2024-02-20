package ToHandlePopups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleNotificationpopup {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");//To Block the upcoming notifications
		
		WebDriver driver = new ChromeDriver(co);//
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("https://www.easemytrip.com/");
		
		
	}

}
