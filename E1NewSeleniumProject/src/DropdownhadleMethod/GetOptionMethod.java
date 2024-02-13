package DropdownhadleMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WebElements/MultiselectDropdown.html");
		WebElement msDD = driver.findElement(By.id("menu"));
		Select sel = new Select(msDD);
		List<WebElement> options = sel.getOptions();
		for(int i=0;i<options.size();i++)//for loop
		{
			String op = options.get(i).getText();
			System.out.println(op);
		}
		Thread.sleep(2000);
		System.out.println();
		for(WebElement we : options)
		{
			String op = we.getText();
			System.out.println(op);
		}

	}

}
