package test;

import org.testng.annotations.Test;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumelements.CredentailsSetup;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	public static WebDriver browserdriver;
	public static Properties propfile= new Properties();
	public static String config_filepath ="D:\\Testing Ducat\\DucatProjects\\Ducat\\Java_Ducat_Selenium_A.A.J.S\\CucumberJavaaSeleniumAAJS\\configfile\\url.properties";
	public static String signinxpath = "//*[text()='Hello, sign in']";
	
	@Test(priority = 1, description = "Browser Driver is Launching", invocationCount = 0 )
  public void amazonTestCase() throws IOException, InterruptedException 
  {
	SetupConfigFileCode_BaseFile.read_browser();


  }

@Test(priority = 2)
public void emailValidation() throws IOException, InterruptedException 
{
	CredentailsSetup.credentail_Username_Set();


}
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Method Name Should be Proper Structure");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Check Method Results");

  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Class Name Should be Proper Structure");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("Check Class Validation");

  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Each Test Case Should be reviewed & Validated");

  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Check Performance Results");

  }

  @BeforeSuite
  public void beforeSuite() 
  
  {
	  System.out.println("Test Suite Should be reviewed & Validated");

	  
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("Result Validations");
  }

}
