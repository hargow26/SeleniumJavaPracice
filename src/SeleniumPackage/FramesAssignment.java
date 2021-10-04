package SeleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
							+ "\\SeleniumPackage\\resourse\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/");
			driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
			driver.findElement(By.xpath("//a[text()='Click Here']")).click();
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();
			String parent=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
			driver.switchTo().window(parent);
			System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
			

		}

	}
}
