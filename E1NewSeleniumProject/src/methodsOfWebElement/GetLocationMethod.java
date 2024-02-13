package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://desktop-t1ogao3/login.do");
		WebElement loginB = driver.findElement(By.id("loginButton"));
Point point = loginB.getLocation();
int x_axis = point.getX();
int y_axis = point.getY();
		System.out.println("x axis is :"+x_axis);
		System.out.println("y axis is :"+y_axis);
		
	}

}
