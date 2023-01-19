package stepsdef;

import java.io.IOException;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumelements.CredentailsSetup;

public class Login_Steps {
	
	@Given("^Open Application & Enter URL$")
		public static void opened_browser() throws IOException, InterruptedException
		{
			SetupConfigFileCode_BaseFile.read_browser();

		}

		
		@When("^User Enter valid Username$")
		public static void step2() throws IOException, InterruptedException
		{
				CredentailsSetup.credentail_Username_Set();
			
		}
		
		@And("^User Enters Valid Password$")
		public static void step3() throws IOException
		{
				CredentailsSetup.credentail_Password_Setup();
			
		}
		
		@And("^User clicked on Login Button$")
		public static void step4() throws IOException, InterruptedException
		{
				CredentailsSetup.click_login();
			
		}
		
		@Then("^User is Logged into Application Successfully$")
		public static void step5() throws IOException, InterruptedException
		{
				CredentailsSetup.validate_usrrname();
			
		}
		
		
		

}
