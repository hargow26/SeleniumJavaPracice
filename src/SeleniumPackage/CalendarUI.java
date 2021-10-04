package SeleniumPackage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
						+ "\\SeleniumPackage\\resourse\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		String pattern = "dd-MM-yyyy";
		String dateInString =new SimpleDateFormat(pattern).format(new Date());
		String[] dateStringOrder=dateInString.split("-");
		System.out.println(dateStringOrder[0]);
		
		driver.findElement(By.xpath("//th[@class='datepicker-switch']")).click();
		
		driver.findElement(By.xpath("//span[@class='month' and text()='Nov']")).click();
		
		driver.findElement(By.xpath("//th[@class='datepicker-switch']")).click();
		
		driver.findElement(By.xpath("//span[@class='year' and text()='2021']")).click();
		

	}

}
