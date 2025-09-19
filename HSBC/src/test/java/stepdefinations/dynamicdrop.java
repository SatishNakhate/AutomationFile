package stepdefinations;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicdrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.className("form-control")));
//		ele.sendKeys("8329415298");
//		Thread.sleep(5000);
////		WebElement file = driver.findElement(By.id("myFile"));
//		file.sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(5000);
//		  String filePath = "C:\\Users\\sanakhat\\Downloads\\OfficeAppFile\\PetsStore.xlsx";
	       // System.out.println("Uploading: " + filePath);
	        //file.sendKeys(filePath);
		//file.sendKeys("\"C:\\Users\\sanakhat\\Downloads\\OfficeAppFile\\PetsStore.xlsx\"");
		//file.click();
		
      
       
//        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
//       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//       WebElement frames= driver.findElement(By.className("demo-frame"));
//       Thread.sleep(5000);
//       driver.switchTo().frame(frames);
//       Actions action = new Actions(driver);
//       WebElement drag = driver.findElement(By.xpath("//ul[@id= 'gallery']//child::li[1]//img"));
//       WebElement drop = driver.findElement(By.id("trash"));
//       Thread.sleep(5000);
//       action.dragAndDrop(drag, drop).build().perform();
//        
		
		
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement data = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']/child::p/select"));
//		Select sel = new Select(data);
//		Thread.sleep(5000);
//		//sel.selectByIndex(3);
//		//sel.selectByValue("IND");
//		sel.selectByVisibleText("Benin");
//		if(data.isDisplayed()) {
//			System.out.println("Is displayed : " + data.getText());
//		}
//		else {
//			System.out.println("Is noy displayed" );
//		}
		
		//Dyanamic DropDown
		
		List<WebElement> lis = driver.findElements(By.xpath("//li[starts-with(@id, 'menu-item-7128')]/div/ul/li"));
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		
		WebElement els= driver.findElement(By.xpath("//li[starts-with(@id, 'menu-item-7128')]"));
		act.moveToElement(els).perform();
		for(WebElement weblist: lis) {
			if(weblist.getText().equalsIgnoreCase("Free Machine Learning Ebooks")) {
				System.out.println("Text Is : " + weblist.getText() );
				Thread.sleep(5000);
				act.moveToElement(els).perform();
				weblist.click();
			}else {
				File fis = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				Files.copy(fis, new File("SS//ss"));	
			}
			
		}
		
		
		}
	}



