package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Actions act=new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));//to search button option
		button.click();
		WebElement doubleclick = driver.findElement(By.partialLinkText("Double Click"));//to search double click option
		act.click(doubleclick).perform();
		
		WebElement yesbutton1 = driver.findElement(By.id("btn20"));//yes button 1 
		act.doubleClick(yesbutton1).perform();
		
		WebElement nobutton1 = driver.findElement(By.id("btn21"));//no button 
		
		
		WebElement yesbutton2 = driver.findElement(By.id("btn22"));//yes button 2
		act.doubleClick(yesbutton2).perform();
		WebElement nobutton2 = driver.findElement(By.id("btn23"));//no button 2 
		
		WebElement button33 = driver.findElement(By.id("btn26"));//button 3 option 3 
		act.doubleClick(button33).perform();

	}

}
