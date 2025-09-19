package stepdefinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fff {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver(); 
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		driver.findElement(By.tagName("Body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2500);
		driver.findElement(By.id("newTabBtn")).click();
		
		Set <String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		
			if(list.size()>=2) {
				driver.switchTo().window(list.get(1));
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				driver.close();
				driver.switchTo().defaultContent();
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
			}
		
		

	}

}
