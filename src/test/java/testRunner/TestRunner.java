package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

features = ".//Features/stack.feature",
glue = "stepDefination",
dryRun = true,
monochrome = true,
plugin = {"pretty"}

)

public class TestRunner {

}
