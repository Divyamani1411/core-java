package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/DuplicateLead.feature", glue = "duplicateleadsteps")
public class RunDuplicateLead extends AbstractTestNGCucumberTests {

}