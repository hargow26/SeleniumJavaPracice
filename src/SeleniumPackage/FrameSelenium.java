package SeleniumPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
				+ "\\SeleniumPackage\\resourse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']")));
		Actions action=new Actions(driver);
		WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
		action.dragAndDrop(draggable, droppable).build().perform();
		driver.switchTo().defaultContent();
		action.moveToElement(driver.findElement(By.xpath("//a[@href='https://blog.jqueryui.com/']"))).contextClick().build().perform();

	}

}
