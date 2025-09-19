package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement list = driver.findElement(By.xpath("(//div[@class = 'ui-radio']/child::label)[1]"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(list));
//		list.click();
//		//Thread.sleep(1000);
//		boolean bl = list.isSelected();
//		boolean b2 = list.isDisplayed();
//		System.out.println(bl +" " + b2);
		String parentwin = driver.getWindowHandle();
		System.out.println("Parent win is : " + parentwin);
		WebElement link = driver.findElement(By.id("newWindowBtn"));
		link.click();
		Alert alt = driver.switchTo().alert();
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		for(String word: list){
			if(!word.equals(parentwin)){
				driver.switchTo().window(list.get(1));
				//Thread.sleep(1000);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.findElement(By.id("Buy me a coffee")).click();
				System.out.println("Chiild win is : " + word);
				Thread.sleep(5000);
				alt.accept();
				System.out.println("Chiild win is : " + word);
				System.out.println("Chiild win is : " + driver.getTitle());
				
				
			}
		}
		driver.switchTo().defaultContent();
		//driver.close();
	}

}
