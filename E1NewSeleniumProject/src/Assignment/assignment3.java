package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/signup");
		WebElement dayDD = driver.findElement(By.id("day"));
		WebElement monthDD = driver.findElement(By.id("month"));
		WebElement yearDD = driver.findElement(By.id("year"));

		Select daySelect = new Select(dayDD);
		boolean result1 = daySelect.isMultiple();
		System.out.println("day dropdown is multiple?:" + result1);
		List<WebElement> dayOp = daySelect.getOptions();
		for (WebElement we : dayOp) {
			System.out.println(we.getText());
		}
		daySelect.selectByIndex(7);
		
		System.out.println("*************************************************************************************************************************************************");
		System.out.println();
		Select monthSelect = new Select(monthDD);
		boolean result2 = monthSelect.isMultiple();
		System.out.println("month dropdown is multiple? :" + result2);
		List<WebElement> monthOp = monthSelect.getOptions();
		for (WebElement we : monthOp) {
			System.out.println(we.getText());
		}
		monthSelect.selectByValue("5");
		
		
		System.err.println("*************************************************************************************************************************************************");
		System.out.println();
		Select yearSelect = new Select(yearDD);
		boolean result3 = yearSelect.isMultiple();
		System.out.println("year dropdown is multple? :"+result3);
		 List<WebElement> yearOp = yearSelect.getOptions();
		 for(WebElement we : yearOp)
		 {
			 System.out.println(we.getText());
		 }
		 yearSelect.selectByValue("2000");
		 System.out.println("************************************************************************************************************************************************");
	}

}
