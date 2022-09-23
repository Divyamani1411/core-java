package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/Login.feature", glue = "mergeleadsteps", monochrome = true)
public class RunTestMergeLead extends AbstractTestNGCucumberTests {

}

