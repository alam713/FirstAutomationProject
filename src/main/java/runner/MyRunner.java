package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Feature",
		glue = "stepDefinition",
	    plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"} 
		)
	    
public class MyRunner extends AbstractTestNGCucumberTests {
	
}
