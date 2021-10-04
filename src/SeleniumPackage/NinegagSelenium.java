package SeleniumPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Test;
import okio.Timeout;

public class NinegagSelenium {
	public static void main(String[] args) throws InterruptedException {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
							+ "\\SeleniumPackage\\resourse\\chromedriver1.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://9gag.com");
			Thread.sleep(10000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Boolean flag = false;
			while (!flag) {
				try {
					if(driver.findElement(By.xpath("//a[@data-entry-id='axMwPdK']")).isDisplayed())
						flag=true;
					else {
						js.executeScript("window.scrollBy(0,1000)");
						Thread.sleep(2000);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					break;
					
//					js.executeScript("window.scrollBy(0,1000)");
//					Thread.sleep(2000);
				}
			}
			driver.findElement(By.xpath("//a[@data-entry-id='axMwPdK']")).click();
			Set<String> some = driver.getWindowHandles();
			Iterator<String> it = some.iterator();
			String parent = it.next();
			String child = it.next();
			driver.switchTo().window(child);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
