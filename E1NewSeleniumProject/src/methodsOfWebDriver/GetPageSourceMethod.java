package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// to launch chrome browser
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String pageSource = driver.getPageSource();
		driver.close();
		System.out.println(pageSource);
	}

}
