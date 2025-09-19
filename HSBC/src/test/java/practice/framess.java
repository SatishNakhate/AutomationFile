package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framess {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> framee = driver.findElements(By.tagName("frame"));
		System.out.println(framee.size());
		Thread.sleep(5000);
		for(WebElement framess: framee) {
			System.out.println(framess.getText());
			System.out.println(driver.getTitle());
		}
		driver.switchTo().frame(3);
		
		WebElement innerIframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(innerIframe);
		driver.findElement(By.xpath("//*[@type ='text' and @name ='mytext1']")).sendKeys("Satish");
		driver.switchTo().defaultContent();
	}

}
