package stepsdef;

import java.io.IOException;

import com.base.AmazonBaseConfigFile.SetupConfigFileCode_BaseFile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumelements.CredentailsSetup;
import seleniumelements.InvalidCredentialsSetup;

public class InvalidSteps {
	

	
	@When("^When User Enter inva lid Username$")
	public static void step2() throws IOException, InterruptedException
	{
			InvalidCredentialsSetup.credentail_invalidusername_Set();
		
	}

	
	@And("^User click ed on Login Button$")
	public static void step4() throws IOException, InterruptedException
	{
			CredentailsSetup.click_login();
		
	}

}
