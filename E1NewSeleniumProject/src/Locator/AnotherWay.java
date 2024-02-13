package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherWay {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("laptop");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//div[.='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling :: div[@class='_24_Dny']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling ::  div[@class='_24_Dny']")).click();
		Thread.sleep(1000);

		 List<WebElement> laptop = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		for (int i = 0; i < laptop.size(); i++) {
			String op = laptop.get(i).getText();

			for (int j = i; j <= i; j++) {
				String lprice = price.get(j).getText();
				System.out.print(op + " : " + lprice);
				Thread.sleep(1000);
			}
			System.out.println();
		}
	}
}
	
