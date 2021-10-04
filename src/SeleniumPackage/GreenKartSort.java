package SeleniumPackage;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenKartSort {
	
	public static String getVeggiePrice(WebElement s) {
		return s.findElement(By.xpath("following-sibling::td")).getText();
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
				+ "\\SeleniumPackage\\resourse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//th[@aria-label='Veg/fruit name: activate to sort column ascending']")).click();
		
//		Thread.sleep(3000);
	/*	
		List<WebElement> sortedVeg=driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		
//		sortedVeg.stream().forEach(s->System.out.println(s.getText()));
		
		List<String> listOfVeg=sortedVeg.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> SortedListOfVeg=sortedVeg.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
		
		Assert.assertTrue(listOfVeg.equals(SortedListOfVeg), "the list is sorted");
		
		List<String> price=sortedVeg.stream().map(s->getVeggiePrice(s)).collect(Collectors.toList());
		
//		price.stream().forEach(s->System.out.println(s));
		*/
		//pagination
		
		List<String> listOfVeggie;
		
		do {
			List<WebElement> sortedVegPage=driver.findElements(By.xpath("//tr/td[1]"));
			
			sortedVegPage.stream().forEach(s->System.out.println(s.getText()));
			
			listOfVeggie=sortedVegPage.stream().filter(s->s.getText().contains("Rice"))
					.map(s->s.getText()).collect(Collectors.toList());
			
			WebElement nextBtn=driver.findElement(By.xpath("//a[@aria-label='Next']"));
			
			if(listOfVeggie.size()<1) {
				if(nextBtn.getAttribute("aria-disabled").equalsIgnoreCase("True"))
					break;
				nextBtn.click();
				Thread.sleep(2000);
			}
			
		}while(listOfVeggie.size()<1);
		
		listOfVeggie.forEach(s->System.out.println(s));

		
	}

}
