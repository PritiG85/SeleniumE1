package ToHandlePopups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleWebBasePopup {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();// to launch chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		driver.get("https://omayo.blogspot.com/");//launch the google application
		WebElement fileUpload = driver.findElement(By.id("uploadfile"));
		Actions act = new Actions(driver);
		act.click(fileUpload).perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./autoItPrograms/Upload_File.exe");

	}

}
