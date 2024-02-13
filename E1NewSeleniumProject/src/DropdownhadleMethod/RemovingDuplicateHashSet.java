package DropdownhadleMethod;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemovingDuplicateHashSet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WebElements/MultiselectDropdown.html");
		WebElement msDD = driver.findElement(By.id("menu"));
		Select sel = new Select(msDD);
		HashSet<String> hs = new HashSet<String>();
		List<WebElement> options = sel.getOptions();
		for (int i =0;i<options.size();i++) {
			 String op = options.get(i).getText();
			hs.add(op);
		}
		System.out.println(hs);
		for(String text: hs)
		{
			System.out.println(text);
		}
		

	}

}
