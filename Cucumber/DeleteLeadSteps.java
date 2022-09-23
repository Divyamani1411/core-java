package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadSteps {
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

	@Given("Enter username")
	public void enterUserName() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}

	@And("Enter password")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
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

	@And("LeadID is clicked")
	public void clickLeadID() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@When("Delete Button is Clicked")
	public void clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
	}

	@And("Again Find leads is Clicked")
	public void clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@And("Enter LeadID")
	public void enterLeadId() {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}

	@When("Find Leads is clicked")
	public void findLeadsClick() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("Lead is Deleted,No records to displayed")
	public void leadIsDeleted() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
	@And("Close the browser")
	public void closeTheBrowser() {
		driver.close();
	}
}
