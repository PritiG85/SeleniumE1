package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class GoogleMapHandlingFrame {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();//To click on  google app
		driver.switchTo().frame("app");//to switch control 
		driver.findElement(By.xpath("//span[@style='background-position: 0 -1044px;']")).click();
		TakesScreenshot ts = (TakesScreenshot) driver;//to take screenshot
		Thread.sleep(3000);
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/googlemap.png");
		Files.copy(scr, dest);
		driver.navigate().back();//to switch the control on main webpage
		
		
	}

}
