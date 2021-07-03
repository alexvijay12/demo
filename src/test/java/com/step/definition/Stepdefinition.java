package com.step.definition;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass1;
import com.testrunner.Test_Runner;

import Adactin_Pom.Login_Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass1 {
	
	
	public static WebDriver driver= Test_Runner.driver;
	
	public static Login_Page login =new Login_Page(driver);
	
	
	
	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		getUrl("http://adactinhotelapp.com/");
		
	}

	
	@When("^user Enter The Username$")
	public void user_Enter_The_Username() throws Throwable {
		Inputvalue(login.getUsername(), "Alexpandian");
		
	}

	@And("^user Enter The Password$")
	public void user_Enter_The_Password() throws Throwable {
		Inputvalue(login.getPwd(), "DJalex");
	}

	@Then("^User Click on The Login Button and It Navigates to Select Hotel Page$")
	public void user_Click_on_The_Login_Button_and_It_Navigates_to_Select_Hotel_Page() throws Throwable {
		clickkk(login.getLogin_btn());
	}


	

}
