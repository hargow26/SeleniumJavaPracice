package SeleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
				+ "\\SeleniumPackage\\resourse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.kpsc.kar.nic.in/index.html");
		Thread.sleep(5000);
		
//		System.out.println(driver.findElement(By.xpath("//img[@alt='Google']")).getAttribute("class"));
		
		List<WebElement> list=driver.findElements(By.xpath("//marquee/span/a"));
		
		for(WebElement toPrint:list) {
			
			System.out.println(toPrint.getText());
		}
//		
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//		
//		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
//		
		
		
		
		driver.close();

	}

}
