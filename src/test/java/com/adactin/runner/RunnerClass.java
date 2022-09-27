package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Properties.FileReaderManager;
import com.baseclass.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition",
monochrome= true,
dryRun= false,
strict= true,
tags = ("@test"),
plugin={"html:Report/Htmlreport","pretty","json:Report/jsonreport.json","com.cucumber.listener.ExtentCucumberFormatter:Report/Extendedreport.html"}
)
public class RunnerClass {

	public static WebDriver driver;

	@BeforeClass
	
	public static void setUp() throws Exception {

	String browser = FileReaderManager.fileReaderMethod().ConfigurationManagermethod().getBrowser();
	
	driver=Baseclass.browserlaunch(browser);
		
		
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
