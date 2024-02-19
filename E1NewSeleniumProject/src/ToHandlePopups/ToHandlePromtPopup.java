package ToHandlePopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromtPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);//To observed process
		
		Alert promtAlert= driver.switchTo().alert();//To switch the control on popup
		
		String text = promtAlert.getText();
		System.out.println(text);
		promtAlert.sendKeys("priti");//It's not displayed but it has handled
		Thread.sleep(2000);
		
		promtAlert.accept();
		
;	}

}
