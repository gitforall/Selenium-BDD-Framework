package com.maven.cucumber.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserfactory {

	static WebDriver driver;
	public static WebDriver initializeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"D:/Hari/Selenium/work/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://abuat.bartronicsfi.com:8002/ABMIS/");
		return driver;

	}

}
