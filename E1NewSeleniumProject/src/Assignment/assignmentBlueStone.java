package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class assignmentBlueStone {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);//for pop up handeling
		driver.findElement(By.id("confirmBtn")).click();
		
		WebElement coinOp = driver.findElement(By.xpath("//a[@title='Coins']"));
Actions act = new Actions(driver);
		act.moveToElement(coinOp).perform();
		
		driver.findElement(By.xpath("//span[text()='1 gram'][1]")).click();
		WebElement coinD = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		boolean CC = coinD.isDisplayed();
		System.out.println(CC);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/bluestone.png");
		Files.copy(scr, dest);
	}

}
