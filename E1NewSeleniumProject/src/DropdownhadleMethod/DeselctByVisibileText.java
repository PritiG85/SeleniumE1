package DropdownhadleMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.security.Secret;
import org.openqa.selenium.support.ui.Select;

public class DeselctByVisibileText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WebElements/MultiselectDropdown.html");
		WebElement multiSelct = driver.findElement(By.id("menu"));
		Select sel = new Select(multiSelct);
		sel.selectByVisibleText("Dosa");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Dosa");
	}

}
