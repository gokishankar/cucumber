package org.Stepdefinition;

import org.help.samplebase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Stepdefinition extends samplebase {

	

	@When("User have to enter the invalid username and  valid password")
	public void user_have_to_enter_the_invalid_username_and_valid_password() {

		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("smartskills");

		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("123434");

	}

	@And("User have to click the login button")
	public void user_have_to_click_the_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

	@When("User have to enter the valid username and invalid password")
	public void user_have_to_enter_the_valid_username_and_invalid_password() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("smart");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123456");

	}

	@Then("User have to reach invalid credentials page")
	public void user_have_to_reach_invalid_credentials_page() {
		String url = driver.getCurrentUrl();
		if (url.contains("privacy_mutation_token")) {
			System.out.println("reach invalid credential page");
		} else {
			System.out.println("reach valid credential page");
		}
	}

	

	@When("User have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() {
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

	@When("User have to enter invalid email")
	public void user_have_to_enter_invalid_email() {
		WebElement frgtmail = driver.findElement(By.xpath("//input@id='identify_email']"));
		frgtmail.sendKeys("smartkeys@123");
	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
		driver.findElement(By.xpath("//button[text()='Search']")).click();
	}
	@When("User have to enter invalid username and invalid password")
	public void user_have_to_enter_invalid_username_and_invalid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
