package Assignment;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[text()='Departure']")).click();//to launch the application
	
	LocalDate sysDate = LocalDate.now();//to get current date
	System.out.println(sysDate);
	LocalDate futureDate = sysDate.plusMonths(7);//to get date after 7 months
	System.out.println(futureDate);
	
	//to click the arrow till next 7 months
	for(int i=0;i<6;i++)
	{
		if(!sysDate.equals(futureDate))
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();//find the arrow and click on that
		}
	}
	
	
	int date = futureDate.getDayOfMonth();//to get day of the future date
	String dateStr= Integer.toString(date);//here we convert integer date into string format
	
	//to fetch all the dates 
	List<WebElement> days = driver.findElements(By.xpath("//div[@class='dateInnerCell' or tagNmae='p']"));
	
	//to click on the exact date
	for(int i= 0;i<days.size();i++)
	{
		String dateText = days.get(i).getText();//to get the text of date
		if(dateStr.equals(dateText))
		{
			days.get(i).click();//click on future date
		}
	}

	}

}
