package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("http://desktop-t1ogao3/login.do");
		
		Flib flip = new Flib();
	 int rc = flip.getRowCount("./data/testData.xlsx","Invalidcreds");
	 for(int i=1;i<=rc;i++)
	 {
		 driver.findElement(By.name("username")).sendKeys(flip.ReadExcelData("./data/testData.xlsx", "Invalidcreds", i, 0));
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys(flip.ReadExcelData("./data/testData.xlsx", "Invalidcreds", i, 1));
		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).clear();
	 }
		
	}
}