package DropdownhadleMethod;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicates {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WebElements/MultiselectDropdown.html");
		WebElement msDD = driver.findElement(By.id("menu"));
		Select sel = new Select(msDD);
		TreeSet<String> ts = new TreeSet<String>();
		List<WebElement> options = sel.getOptions();
		for (WebElement we : options) {
			String textToInsert = we.getText();
			ts.add(textToInsert);
		}
		System.out.println(ts);
		for (String t : ts) 
		{
			System.out.println(t);
		}

	}

}
