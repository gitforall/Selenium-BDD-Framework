package com.maven.cucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id = "UserName")
	public static WebElement uname;

	@FindBy(id = "Password")
	public static WebElement pwd;

	@FindBy(id = "submit")
	public static WebElement submit;

	public void enterUserCredintials() {

		uname.sendKeys("haris");
		pwd.sendKeys("p@ssw0rd");
	}

	public void submit() {

		submit.click();

	}

}
