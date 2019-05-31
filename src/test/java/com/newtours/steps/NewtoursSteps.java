package com.newtours.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class NewtoursSteps {
	
	WebDriver driver;
	
	@Given("I open Chrome")
	public void i_open_Chrome() {


		driver=new ChromeDriver();
		
	}
	
	

	@Given("I go to loginURL")
	public void i_go_to_loginURL() {

		driver.get("http://newtours.demoaut.com/");

	}
	
	@And("^I Login inside application$")
	public void login_inside(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		driver.findElement(By.name("userName")).sendKeys(data.get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(1));
		driver.findElement(By.name("login")).click();
		
	}

	
	/*@Then("Login should be success")
	public void login_should_be_success() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/
	


}
