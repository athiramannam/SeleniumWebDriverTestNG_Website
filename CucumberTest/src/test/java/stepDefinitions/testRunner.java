package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = {"stepDefinitions"},

monochrome = true,
//plugin = {"pretty", "html:target/HTMLReport"},
//plugin = {"pretty", "json:target/reports/cucumber.json"}
plugin = {"pretty", "junit:target/reports/cucumber.xml"}

		)

public class testRunner {
	public static void main(String [] args) {
		
	}
}
