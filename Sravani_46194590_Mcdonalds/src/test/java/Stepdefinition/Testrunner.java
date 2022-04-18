package Stepdefinition;
//import org.junit.runner.RunWith;



	//import io.cucumber.junit.Cucumber;
	//import io.cucumber.junit.CucumberOptions;



	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(features="src/test/resources/Features",
	glue= {"Stepdefinition"},strict=true,monochrome=false,
	plugin= {"pretty","html:target/htmlreports","json:target/jsonreports/jsonreports.json"})



	public class Testrunner extends AbstractTestNGCucumberTests{



	}

