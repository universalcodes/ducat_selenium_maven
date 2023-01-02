package seleniumelements;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;



public class InvalidCredentialsSetup {
	
	@FindBy(name = "email" )
	static WebElement enterinv_username;
	
	public static Properties propfile= new Properties();
	public static String config_filepath ="D:\\Testing Ducat\\JavaCoding\\Ducat\\Java_Ducat_Selenium_A.A.J.S\\CucumberJavaaSelenium\\configfile\\url.properties";
	public static String signinxpath = "//*[text()='Hello, sign in']";
	public static String userdetails = "//*[text()='Hello, Yogesh']";

	
	public static void credentail_invalidusername_Set() throws InterruptedException, IOException
	
	{
		WebElement signinclick = SetupConfigFileCode_BaseFile.browserdriver.findElement(By.xpath(signinxpath));
		Thread.sleep(10000);
		signinclick.click();
		FileInputStream fileread = new FileInputStream(config_filepath);
		propfile.load(fileread);
		String read_iv_username= propfile.getProperty("invalid_username");
		enterinv_username.sendKeys(read_iv_username);
	}
	
	public static void credentail_Password_Setup() throws IOException
	
	{
		WebElement continue_click = SetupConfigFileCode_BaseFile.browserdriver.findElement(By.id("continue"));
		continue_click.click();
		FileInputStream fileread = new FileInputStream(config_filepath);
		propfile.load(fileread);
		String read_password= propfile.getProperty("password");
		WebElement enterpassword = SetupConfigFileCode_BaseFile.browserdriver.findElement(By.name("password"));
		enterpassword.sendKeys(read_password);

	}
	public static void click_login() throws InterruptedException
	
	{
		WebElement click_signin = SetupConfigFileCode_BaseFile.browserdriver.findElement(By.id("signInSubmit"));
		click_signin.click();
	
	}
	
public static void validate_usrrname() throws InterruptedException
	
	{

	SetupConfigFileCode_BaseFile.browserdriver.navigate().refresh();
	Thread.sleep(10000);

	WebElement fetchuserdetails = SetupConfigFileCode_BaseFile.browserdriver.findElement(By.xpath(userdetails));
	String displayusername= 	fetchuserdetails.getText();
System.out.println(displayusername);

	
	}
	
	

	
}
