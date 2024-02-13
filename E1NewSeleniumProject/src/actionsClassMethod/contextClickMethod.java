package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClickMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act=new Actions(driver);
		
		WebElement button= driver.findElement(By.xpath("//section[text()='Button']"));
		act.click(button).perform();
		
		
		WebElement rightClick = driver.findElement(By.partialLinkText("Right Click"));
		act.click(rightClick).perform();
		
		WebElement button1 = driver.findElement(By.id("btn30"));
		act.contextClick(button1).perform();
		
		WebElement button1Click = driver.findElement(By.xpath("//div[text()='Yes']"));
		act.click(button1Click).perform();
		
		WebElement button2 = driver.findElement(By.id("btn31"));
		act.contextClick(button2).perform();
		
		WebElement buttonClick2 = driver.findElement(By.xpath("//div[text()='No']"));
		act.click(buttonClick2).perform();
		
		WebElement button3 = driver.findElement(By.id("btn32"));
		act.contextClick(button3).perform();
		
		WebElement button3Click = driver.findElement(By.xpath("//div[text()='5']"));
		act.click(button3Click).perform();
		
		
		

	}

}
