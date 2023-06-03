package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-reports"},
		features = "features",
		glue = "stepDefinitions",
		monochrome = true
		)

public class JunitRunnerTest {
	
	

}
