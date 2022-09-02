package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	
	driver.findElement(By.xpath("//button[@title='Learn More']")).click();
	
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> list = new ArrayList<String>(windowHandles);
	System.out.println(windowHandles);
	driver.switchTo().window(list.get(1));
	driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
	driver.switchTo().window(list.get(0));
	driver.close();
	
	
}
}