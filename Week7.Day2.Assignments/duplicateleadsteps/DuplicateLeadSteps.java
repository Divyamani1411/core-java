package duplicateleadsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadSteps {
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
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@And("click Find Leads")
	public void clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@And("Click phone button")
	public void clickPhoneButton() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@And("Enter Phone Number")
	public void enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}

	@And("Find Leads Button is Clicked")
	public void clickFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@When("Duplicate Lead Button is Clicked")
	public void clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}

	@Then("Update Button is Clicked,View Lead is Displayed")
	public void update() {
		driver.findElement(By.name("submitButton")).click();
	}

	@And("Close the Browser")
	public void closeBrowser() {
		driver.close();
	}

}
