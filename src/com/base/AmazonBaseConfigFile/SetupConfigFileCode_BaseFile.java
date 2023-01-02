package com.base.AmazonBaseConfigFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupConfigFileCode_BaseFile {
	
	public static WebDriver browserdriver;
	public static Properties propfile= new Properties();
	public static String config_filepath ="D:\\Testing Ducat\\JavaCoding\\Ducat\\Java_Ducat_Selenium_A.A.J.S\\CucumberJavaaSelenium\\configfile\\url.properties";
	public static String signinxpath = "//*[text()='Hello, sign in']";
	
	public static void read_browser() throws IOException, InterruptedException
	{
	FileInputStream fileread = new FileInputStream(config_filepath);
	propfile.load(fileread);
	
	String readbrowser_name= propfile.getProperty("Browser");
	System.out.println(readbrowser_name);	
	
	String urlread= propfile.getProperty("applicationurl");
	System.out.println( urlread);	
	
	
	if(readbrowser_name.contains("googlechrome"))
	
	{
		WebDriverManager.chromedriver().setup();
		browserdriver = new ChromeDriver();
		browserdriver.manage().deleteAllCookies();
		browserdriver.manage().window().maximize();
		
		if ( urlread.contains("https://www.amazon.in/"))
		{
			browserdriver.get(urlread);
			
			Thread.sleep(10000);
					
			
					}
		else {
			
			System.out.println("Invalid URL");
	}
	}
	else if (readbrowser_name.contains("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		browserdriver = new FirefoxDriver();
		if ( urlread.contains("https://www.amazon.in/ref=nav_logo"))
		{
			browserdriver.get(urlread);
		}
		else {
			
				System.out.println("Invalid URL");
		}
	}
	
	
	else if (readbrowser_name.contains("edge"))
	{
		WebDriverManager.edgedriver().setup();
		browserdriver = new EdgeDriver();
		if ( urlread.contains("https://www.amazon.in/ref=nav_logo"))
		{
			browserdriver.get(urlread);
		}
		else {
			
			System.out.println("Invalid URL");
	}
		
	}
	else {
		
		System.out.println("no Browser found so far");
		
	}
	
}
	
		
	}
	
	
