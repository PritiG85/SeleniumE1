package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPossionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// to launch chrome browser
		Thread.sleep(100);
		driver.manage().window().maximize();// maximize the browser window
		Thread.sleep(1000);
		Point targetPoint = new Point(400, 200);// to pass x and y coordinates
		driver.manage().window().setPosition(targetPoint);// to pass the coordinate to setPossition Method

	}

}
