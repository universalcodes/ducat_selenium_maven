package testng_runner;

import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	plugin = { "pretty" },
	features = 	"D:\\Testing Ducat\\DucatProjects\\Ducat\\Java_Ducat_Selenium_A.A.J.S\\CucumberJavaaSeleniumAAJS\\featurefile\\login.feature",
	glue = "stepsdef",
	tags = "@validLoginTC1", 
	dryRun =  false,
	monochrome = false
		)


public class CucumbrTestNG_Runner extends AbstractTestNGCucumberTests{


}
