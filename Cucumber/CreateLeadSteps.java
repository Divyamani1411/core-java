package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.And;

public class CreateLeadSteps {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@And("Enter username as {string}")
	public void enterUserName(String username) {
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys(username);
	}

	@And("Enter password as {string}")
	public void enterPassword(String password) {
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys(password);
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

	@And("click Create Lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@And("Enter Company Name")
	public void enterCompayName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
	}

	@And("Enter First Name")
	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
	}

	@And("Enter Last Name")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mani");
	}

	@When("Cread Lead Button is Clicked")
	public void clickCreatLead() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Close the browser")
	public void closeBrowser() {
		driver.close();
	}

}
