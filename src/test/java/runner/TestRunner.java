package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/feature/BMICalculator.feature",
		"src/test/java/feature/ElearningUpSkill.feature" }, glue = { "stepDefinition" },
		tags = {"@Regression"}
		)
public class TestRunner {

}
