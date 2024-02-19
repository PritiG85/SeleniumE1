package ToHandlePopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHanddlePromptDropSendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		driver.findElement(By.id("buttonAlert1")).click();
		
		
		
		Thread.sleep(2000);//To observed process
		
		Alert promtAlert= driver.switchTo().alert();//To switch the control on popup
		
		String text = promtAlert.getText();
		System.out.println(text);
		promtAlert.sendKeys("priti");//It's not displayed but it has handled
		Thread.sleep(2000);
		
		promtAlert.accept();

	}

}
