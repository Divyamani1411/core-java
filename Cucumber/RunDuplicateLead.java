package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/DuplicateLead.feature", glue = "steps/DuplicateLeadSteps")
public class RunDuplicateLead extends AbstractTestNGCucumberTests {

}