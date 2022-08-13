package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Assignment 1:Create Lead
1. Launch URL "http://leaftaps.com/opentaps/control/login"
2. Enter UserName and Password Using Id Locator
3. Click on Login Button using Class Locator
4. Click on CRM/SFA Link
5. Click on Leads Button
6. Click on Create Lead 
7. Enter CompanyName Field Using id Locator
8. Enter FirstName Field Using id Locator
9. Enter LastName Field Using id Locator
10. Enter FirstName(Local) Field Using id Locator
11. Enter Department Field Using any Locator of Your Choice
12. Enter Description Field Using any Locator of your choice 
13. Enter your email in the E-mail address Field using the locator of your choice
14. Select State/Province as NewYork Using Visible Text
15. Click on Create Button
*16. Get the Title of Resulting Page. refer the video  using driver.getTitle()
*/
public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementClassname = driver.findElement(By.className("decorativeSubmit"));
		elementClassname.click();
		WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
		String text = elementWelcomeMessage.getText();
		System.out.println("text");
		if (text.contains("Welcome")) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Login is Failed");
		}
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		/*
		 * 7. Enter CompanyName Field Using id Locator 8. Enter FirstName Field Using id
		 * Locator 9. Enter LastName Field Using id Locator 10. Enter FirstName(Local)
		 * Field Using id Locator
		 */
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Selenium");
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Divya");
		WebElement elementLastname = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastname.sendKeys("Mani");
		WebElement elementfirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementfirstNameLocal.sendKeys("TestLeaf");
		/*
		 * 11. Enter Department Field Using any Locator of Your Choice 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 13. Enter your email inthe E-mail address Field using the locator of your choice 
		 * *14. Select State/Province as NewYork Using Visible Text 
		 * 15. Click on Create Button
		 * 16.Get the Title of Resulting Page. refer the video using driver.getTitle()
		 */
		WebElement elementDepartment = driver.findElement(By.name("departmentName"));
		elementDepartment.sendKeys("java-selenium");
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Coding selenium webdriver");
		WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("divyamani1411@gmail.com");
		WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//elementState.sendKeys("New York");
		Select dd=new Select(elementState);
		//dd.selectByIndex(12);
		//dd.selectByVisibleText("Florida");
		dd.selectByValue("NY");
		WebElement elementCreadLead= driver.findElement(By.name("submitButton"));
		elementCreadLead.click();
		System.out.println(driver.getTitle());
	}
}
