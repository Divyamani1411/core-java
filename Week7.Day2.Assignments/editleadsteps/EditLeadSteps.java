package editleadsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadSteps {
	ChromeDriver driver;

	@Given("Chrome browser is opened")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@And("Load the application URL as {string}")
	public void loadURL(String url) {
		driver.get(url);
	}

	@And("Maximize and Set the timeouts")
	public void maxAndTimeouts() {
		driver.manage().window().maximize();
	}

	@Given("Enter username as {string}")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And("Enter password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Login Button is Clicked")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("click Leads")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("click Find Leads")
	public void clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@And("Click phone button")
	public void clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@And("Enter Phone Number")
	public void enterPhonenumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}
	@And("Find Leads Button is Clicked")
	public void findLeads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@When("Edit Button is Clicked")
	public void clickEdit() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
	}
	@And("Enter Company Name")
	public void enterCompanyname() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	}
	@Then("Update Button is Clicked,View Lead is Displayed")
	public void clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
	}
	@And("Close the Browser")
	public void closeBrowser() {
		driver.close();
	}
}


