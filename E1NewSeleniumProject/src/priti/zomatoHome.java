package priti;

import java.io.IOException;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zomatoHome extends BaseTest implements IAutoContsant {
	@FindBy(xpath = "//input[@placeholder='Search for restaurant, cuisine or a dish']") private WebElement searcElement;
	@FindBy(linkText = "Add restaurant")private WebElement addRestorent;

	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();

			}

	public zomatoHome(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	private WebElement getSearcElement() {
		return searcElement;
	}
	
	private WebElement getAddRestorent() {
		return addRestorent;
	}


	
}
