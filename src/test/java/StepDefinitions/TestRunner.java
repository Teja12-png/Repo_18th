package StepDefinitions;



import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=" \\src\\test\\resources\\Features", glue= {"StepDefinitions"},
monochrome = true{
//plugin = {"pretty","html:target/HTMLReports"}
//plugin = {"pretty","json:target/JSONReports/reports.json"}
//plugin = {"pretty","junit:target/JUnitReports/report.xml",
		"json:target\\JSONReports\\reports.json",
		"html:target/HtmlReports"}
//tags="@smoketest"
		)
public class TestRunner {

}
