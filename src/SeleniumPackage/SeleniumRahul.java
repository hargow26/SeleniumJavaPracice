package SeleniumPackage;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRahul {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
				+ "\\SeleniumPackage\\resourse\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] vegieRequired= {"Cucumber","Beetroot","Carrot","Walnut"};
		List<String> vegieRequiredList=Arrays.asList(vegieRequired);
		List<WebElement> addToCartList=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		int count=1;
		for(int i=0;i<addToCartList.size();i++) {
//			System.out.println(addToCartList.get(i).getText());
			String vegieName=addToCartList.get(i).getText().split("-")[0].trim();
			System.out.println(vegieName);
			if(vegieRequiredList.contains(vegieName)){
				driver.findElements(By.xpath("//h4[@class='product-name']/following-sibling::div[@class='product-action']//button")).get(i).click();
			}
			count++;
		}
		System.err.println(count);
//		driver.close();
		
	}

}
