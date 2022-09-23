package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/Login.feature", glue = "steps/DeleteLeadSteps",monochrome=true)
public class RunTestCreateLead extends AbstractTestNGCucumberTests {

}
