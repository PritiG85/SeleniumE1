package DropdownhadleMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandSelectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/dell/Desktop/WebElements/SingleSelectDropdown.html");
		WebElement singleSelector = driver.findElement(By.id("menu"));
		//to select an
		Select sel = new Select(singleSelector);
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("v3");
		Thread.sleep(2000);
		sel.selectByVisibleText(" Misal");

	}

}
