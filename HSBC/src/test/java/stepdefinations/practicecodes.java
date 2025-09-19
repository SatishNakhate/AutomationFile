package stepdefinations;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practicecodes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("link");
        driver.manage().window().maximize();
        WebElement ele = driver.findElement(By.id("name"));
        Select select = new Select(ele);
        select.selectByIndex(2);
        
       //System.out.println("Link text : " + select.getText());
	           }
	       
	           
	       }
	        

	


