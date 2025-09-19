package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertmess {

	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement Alink= wait.until(ExpectedConditions.elementToBeClickable(By.id("promptBox")));
		Alink.click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Text : " + alert.getText());
		Thread.sleep(3000);
		alert.sendKeys("satish");
		
		Thread.sleep(5000);
		alert.accept();
		//
		//alert.dismiss();
		
		
	}
}
