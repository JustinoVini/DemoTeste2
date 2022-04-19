package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/DataFile/"},
		glue = "steps/",
		monochrome = true		
		)
public class ServiceRunner {

}
