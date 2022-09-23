package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/DeleteLead.feature", glue = "steps.DeleteLeadSteps")
public class RunTestDeleteLead extends AbstractTestNGCucumberTests {

}