package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Hp Laptop");//enter product in search textfield
		driver.findElement(By.xpath("//button[@type='submit']")).click();//click on search button
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/div[text()='Brand']")));
		driver.findElement(By.xpath("//div[text()='Brand']")).click();//find Brand on web page
		driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling :: div[@class='_24_Dny']")).click();//select Hp check box
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling ::div[@class='_24_Dny']")).click();//click on core i5 in processor
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='RAM Capacity']")));
		driver.findElement(By.xpath("//div[text()='RAM Capacity']")).click();//find ram capacity on web page
		driver.findElement(By.xpath("//div[text()='8 GB']/preceding-sibling :: div[@class='_24_Dny']")).click();//click on 8 GB check box
		
		
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();//click on operating system on web page
		driver.findElement(By.xpath("//div[text()='Windows 10']/preceding-sibling :: div[@class='_24_Dny']")).click();//selct window 10 check box
		
		
		driver.findElement(By.xpath("//div[text()='4★ & above']/preceding-sibling :: div[@class='_24_Dny']")).click();
		
		
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
