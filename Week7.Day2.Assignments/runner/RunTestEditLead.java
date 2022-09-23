package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/EditLead.feature", glue = "editleadsteps")
public class RunTestEditLead extends AbstractTestNGCucumberTests {

}
