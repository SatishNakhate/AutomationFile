package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement wins= driver.findElement(By.id("newWindowsBtn"));
		driver.findElement(By.tagName("Body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		wins.click();
		Set<String> str = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(str);
		if(list.size()>=2){
			driver.switchTo().window(list.get(1));
			driver.close();
			driver.switchTo().defaultContent();
			
			{
		}
			
			
		}
	}

}
