package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AssignmentTable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
				+ "\\SeleniumPackage\\resourse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.get("https://www.path2usa.com/travel-companions");
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
		Thread.sleep(2000);
//		
		Actions a=new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//input[@id='autocomplete']"))).click().sendKeys("ind").build().perform();
//		System.out.println(a.sendKeys(Keys.ARROW_DOWN).toString());
		a.sendKeys(Keys.ARROW_DOWN);
		a.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		System.out.println(js.executeScript(" return document.querySelector('#autocomplete').value;"));
//		System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getText());
		
//		String s = "return document.getElementById(\"autocomplete\").value;";
//
//		String m = (String) js.executeScript(s);
//		System.out.println(m);
	}

}
