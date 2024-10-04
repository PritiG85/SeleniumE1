package mock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class FinalMock {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zomato.com/india");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement scrollTill = driver.findElement(By.xpath("//div[@aria-labelledby='country-dropdown-label']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", scrollTill);
		
		WebElement linkedin = driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo'][1]"));
		Thread.sleep(2000);
		linkedin.click();
		WebElement insta = driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo'][2]"));
		Thread.sleep(2000);
		insta.click();
		WebElement twitter = driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo'][3]"));
		Thread.sleep(2000);
		twitter.click();

		WebElement youtube = driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo'][4]"));
		Thread.sleep(2000);
		youtube.click();
		WebElement fb = driver.findElement(By.xpath("//a[@class='sc-elhb8j-17 iDzUMo'][5]"));
		Thread.sleep(2000);
		fb.click();
		//driver.switchTo().alert();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));	
		 WebElement closeB = driver.findElement(By.xpath("//div[@aria-label='Close']"));
		wait.until(ExpectedConditions.elementToBeClickable(closeB));
		
	
		Set<String> allWindows = driver.getWindowHandles();
		for(String wb:allWindows)
		{
		 for(int i=0;i<6;i++)
		 {
			 
		 }
		}
		WebElement zomato = driver.findElement(By.xpath("//h1[@title='Zomato']"));
		driver.switchTo().window("zomatos");
		RemoteWebDriver rwd= new ChromeDriver();
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/zomato.png");
		Files.copy(src, dest);
		
		//
		//}
		
	}
}
