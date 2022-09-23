package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/DeleteLead.feature", glue = "deleteleadsteps")
public class RunTestDeleteLead extends AbstractTestNGCucumberTests {

}