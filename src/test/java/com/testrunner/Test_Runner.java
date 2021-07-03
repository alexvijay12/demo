package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//feature//file", glue = "com.step.definition",monochrome=true)

public class Test_Runner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void setup() throws Exception {
		driver=BaseClass1.getDriver("chrome");

	}
	
	@AfterClass
	
	public static void Tear_Down() {

		BaseClass1.closee();
	}

}
