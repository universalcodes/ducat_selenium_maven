package testng_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	plugin = { "pretty" },
	features = 	"D:\\Testing Ducat\\JavaCoding\\Ducat\\Java_Ducat_Selenium_A.A.J.S\\CucumberJavaaSelenium\\featurefile\\login.feature",
	glue = "stepsdef",
	tags = "@validLoginTC1", 
	dryRun =  false,
	monochrome = false
		)


public class CucumbrTestNG_Runner extends AbstractTestNGCucumberTests{

}
