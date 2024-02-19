package ToHandlePopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);//To observed process
		
		Alert confirmatonAlert= driver.switchTo().alert();//To switch the control on popup
		
		String demo = confirmatonAlert.getText();//To get the text
		confirmatonAlert.dismiss();//To click on cancel button in popup
		System.out.println(demo);//To print the value of popup

	}

}
