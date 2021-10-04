package SeleniumPackage;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;



public class GetConnectionResponseNum {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harish Gowda S\\eclipse-workspace\\SeleniumJava\\src"
				+ "\\SeleniumPackage\\resourse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		SoftAssert softAssert=new SoftAssert();
		
		List<WebElement> urlToBeChecked=driver.findElements(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']//li/a"));
		
		
		for(WebElement currentUrlCheck: urlToBeChecked) {
			String url=currentUrlCheck.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			System.out.println(conn.getResponseCode());
			softAssert.assertTrue(conn.getResponseCode()<400, url + "link is broken");
		}
		
		softAssert.assertAll();
		
		
	}

}
