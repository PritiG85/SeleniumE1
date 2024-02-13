package DropdownhadleMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DelectByValueMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new	ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/dell/Desktop/WebElements/MultiselectDropdown.html");
	 WebElement multiSelect = driver.findElement(By.id("menu"));
	 Select sel = new Select(multiSelect);
	 sel.selectByValue("v5");
	 Thread.sleep(2000);
	 sel.deselectByValue("v5");

	}

}
