package DropdownhadleMethod;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WebElements/MultiselectDropdown.html");
		WebElement mSDD = driver.findElement(By.id("menu"));
		Select sel = new Select(mSDD);
		for(int i=0;i<=6;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		for(int j =0;j <=6;j++)
		{
		sel.deselectAll();
			Thread.sleep(2000);
		}

	}
	}
