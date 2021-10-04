package SeleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
						+ "\\SeleniumPackage\\resourse\\chromedriver1.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		List<WebElement> tabs=driver.findElements(
				By.xpath("//body/div[@class='container']//div [@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li"));
		Actions action =new Actions(driver);
		for(int i=0;i<tabs.size();i++) {
			WebElement tab=tabs.get(i);
					action.moveToElement(tab).build().perform();
			int count=tab.findElements(By.xpath("//div[@class='dropdown-inner']/ul/li")).size();
			System.out.println(count);
		}
		
		

	}

}
