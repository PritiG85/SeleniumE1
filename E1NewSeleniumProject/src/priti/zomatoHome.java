package priti;

import java.io.IOException;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class zomatoHome extends BaseTest implements IAutoContsant {
	@FindBy(xpath = "//input[@placeholder='Search for restaurant, cuisine or a dish']") private WebElement searcElement;
	

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();

			}


	private WebElement getSearcElement() {
		return searcElement;
	}


	
}
