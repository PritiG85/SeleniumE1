package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMehtod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://desktop-t1ogao3/login.do");
		WebElement usnTB = driver.findElement(By.name("username"));
		Dimension size = usnTB.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Height is :" + height+"  "+"widht is :" + width);
	}

}
