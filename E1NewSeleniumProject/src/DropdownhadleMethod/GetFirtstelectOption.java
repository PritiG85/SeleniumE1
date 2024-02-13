package DropdownhadleMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirtstelectOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WebElements/MultiselectDropdown.html");
		WebElement msDD = driver.findElement(By.id("menu"));
		Select sel = new Select(msDD);
		for(int i=2;i<=4;i++)
		{
			sel.selectByIndex(i);
		}
		WebElement firstOp = sel.getFirstSelectedOption();
		System.out.println(firstOp.getText());
	}

}
