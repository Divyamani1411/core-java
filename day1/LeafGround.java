package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Browser']/ancestor::a")).click();

		driver.findElement(By.xpath("//span[text()='Window']/ancestor::a")).click();

		driver.findElement(By.xpath("//span[text()='Open']/parent::button")).click();
		// driver.switchTo().window(list.get(0));
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		driver.switchTo().window(list.get(0));

		driver.findElement(By.xpath("//span[text()='Open Multiple']/parent::button")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1);
		List<String> list1 = new ArrayList<String>(windowHandles1);
		
		int count=list1.size()-1;
		System.out.println(count);
		//driver.switchTo().window(list.get(0));

		driver.findElement(By.xpath("//span[text()='Close Windows']/parent::button")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2);
		List<String> list2 = new ArrayList<String>(windowHandles2);
		
		for(String eachWindow: windowHandles2) {
			if(eachWindow!=list2.get(0)) {
				driver.switchTo().window(eachWindow);
				driver.close();
			}else {
				driver.switchTo().window(list2.get(0));
			}
		}

		driver.findElement(By.xpath("//span[text()='Open with delay']/parent::button")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		System.out.println(windowHandles3);
		List<String> list3 = new ArrayList<String>(windowHandles3);
		
		driver.close();

	}
}
