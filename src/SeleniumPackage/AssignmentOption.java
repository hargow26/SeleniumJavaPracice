package SeleniumPackage;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class AssignmentOption {
	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
							+ "\\SeleniumPackage\\resourse\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://qaclickacademy.com/practice.php/");
			Random randomNum=new Random();
			int optionNum=randomNum.nextInt(3)+1;
			
//			String selectedOption=driver.findElement(By.xpath("//input[@id='checkBoxOption"+optionNum+"']")).getAttribute("value");
//			
//			String sub1=selectedOption.substring(0, 1);
//			selectedOption=sub1.toUpperCase()+selectedOption.substring(1);
			
			String selectedOption=driver.findElement(By.xpath("//input[@id='checkBoxOption"+optionNum+"']/parent::label")).getText();
			
			System.out.println(selectedOption+"what the damn hell");
			
			driver.findElement(By.xpath("//input[@id='checkBoxOption"+optionNum+"']")).click();
			
			Select selectDrop=new Select(driver.findElementByXPath("//select[@id='dropdown-class-example']"));
			selectDrop.selectByVisibleText(selectedOption);
			
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys(selectedOption);
			driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
			
			String alertText=driver.switchTo().alert().getText();
			String[] a=alertText.split(" ");
			System.out.println(a[1].substring(0, a[1].length()-1));
			Assert.assertEquals(selectedOption, a[1].substring(0, a[1].length()-1));
			driver.switchTo().alert().accept();
			

		}
	}

}
