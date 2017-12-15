package com.maven.cucumber.StepDefs;

import org.openqa.selenium.WebDriver;

import com.maven.cucumber.pageObjects.LoginPage;
import com.maven.cucumber.utility.Browserfactory;

import cucumber.api.java.en.Given;

public class StepDefination {

	private static WebDriver driver ;
	
	LoginPage lp;
	
	@Given("^Login with user account$")
	public void login_with_user_account() throws Throwable {
		System.out.println("H1");
		driver = Browserfactory.initializeBrowser();
		lp = new LoginPage(driver);
		lp.enterUserCredintials();
		lp.submit();
	}

	@Given("^Login with guest account$")
	public void login_with_guest_account() throws Throwable {
		System.out.println("H2");
	}

	@Given("^Login with other account$")
	public void login_with_other_account() throws Throwable {
		System.out.println("H3");
		driver.quit();
	}
}
