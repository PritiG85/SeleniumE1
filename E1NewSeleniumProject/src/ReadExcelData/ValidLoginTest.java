package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//To  read the data from Validcreds sheet for usenmae
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String usnData= cell.getStringCellValue();
		
		//To  read the data from Validcreds sheet for password
		FileInputStream fis1 = new FileInputStream("./data/testData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sheet1 = wb.getSheet("Validcreds");
		Row row1 = sheet1.getRow(1);
		Cell cell1 = row1.getCell(1);
		String pwdData = cell1.getStringCellValue();
		
		//To launch the application
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://desktop-t1ogao3/login.do");
		driver.findElement(By.name("username")).sendKeys(usnData);
		driver.findElement(By.name("pwd")).sendKeys(pwdData);
		driver.findElement(By.id("loginButton")).click();
		
	}

}
