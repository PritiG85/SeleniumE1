package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("http://desktop-t1ogao3/login.do");
		
		Flib flip = new Flib();

		
		
		driver.findElement(By.name("username")).sendKeys(flip.ReadExcelData("./data/testData.xlsx", "Validcreds", 1, 0));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys( flip.ReadExcelData("./data/testData.xlsx", "Validcreds", 1, 1));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
	}

}
