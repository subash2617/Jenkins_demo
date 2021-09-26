package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles\\Adactinsite.feature", 
plugin = {"pretty","json:src//test//resources//reports//cucumber.json"},
glue = "stepdef", 
dryRun = false,
monochrome = true)
public class TestRunner {
}