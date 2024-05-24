package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "/myfirstAutimationProject1/Features",
		glue = "stepDefinition",
		plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"}
		
)

public class MyRunner extends AbstractTestNGCucumberTests{

}
