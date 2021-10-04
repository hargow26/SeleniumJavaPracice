package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitDriver {

	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
							+ "\\SeleniumPackage\\resourse\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement footerDriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
			WebElement miniFooterDriver=driver.findElement(By.xpath("//ul[1]"));
			System.out.println(miniFooterDriver.findElements(By.tagName("a")).size());

		}
	}

}
