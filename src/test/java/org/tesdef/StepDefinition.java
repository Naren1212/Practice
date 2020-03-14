package org.tesdef;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	@Given("The user is in facebook login page")
	public void the_user_is_in_facebook_login_page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}

	@When("The userenter the username and password")
	public void the_userenter_the_username_and_password() {
	    driver.findElement(By.id("email")).sendKeys("nk37202@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("456789");
	}

	@Then("User click the login button and navigate to next page")
	public void user_click_the_login_button_and_navigate_to_next_page() {
		driver.findElement(By.id("loginbutton")).click();
	    Assert.assertTrue("verify url", driver.getCurrentUrl().contains("login_attempt"));
	    driver.quit();
	}
	@Then("User selects the hotel details")
	public void user_selects_the_hotel_details() {

	}
	}
