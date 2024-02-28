package Assignment;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip2 {

	public static void main(String[] args) {
		
		  LocalDateTime sysDATE = LocalDateTime.now().plusMonths(7);//To add next 7 month into current date
		String monthName = sysDATE.getMonth().name();//to get system date
		int year=sysDATE.getYear();//To get year of system date
		int day=sysDATE.getDayOfMonth();//to get day of system date
	String monthYear = monthName+" "+year;// to get value like "March 2024"
	System.out.println(monthYear);
	
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://www.makemytrip.com/");
	 driver.findElement(By.xpath("//span[text()='Departure']")).click();
	 //driver.findElement(By.xpath("//div[text()='March 2024']/../..//p[text()='26']"));
	while(true)
	{
		//To get the months present on RHS in calendar
		String text = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText();
		System.out.println(text);
		
		if(text.equalsIgnoreCase(monthYear))//To compare the value present in text var and after 7months 
		{
			break;
		}
		else
		{
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();//to click on arrow	
		}
	}
	driver.findElement(By.xpath("(//p[text()='"+day+"'])[2]")).click();//to click on date
	}
	

}
