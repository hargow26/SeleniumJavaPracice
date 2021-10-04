package SeleniumPackage;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pagination {

	@Test

	public void test()

	{

//	WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
				+ "\\SeleniumPackage\\resourse\\chromedriver1.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column

		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<String> alldata;
		boolean flag=true;

		while (flag)

		{

			List<WebElement> elementsList = driver.findElements(By.xpath("//tr"));

			alldata = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

			alldata.forEach(s -> System.out.println(s));

			if (driver.findElement(By.xpath("//a[@aria-label='Next']")).getAttribute("aria-disabled")
					.equalsIgnoreCase("false"))
			{
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
			
			else
				flag=false;

		}

	}

}
