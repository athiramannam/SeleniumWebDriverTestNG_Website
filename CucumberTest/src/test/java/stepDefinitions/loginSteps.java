package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	WebDriver driver;
	

	@Given("User is on login page")
	public void userIsOnLoginPage() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	
	    driver= new ChromeDriver();
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    Thread.sleep(3000);
	}

//	@When("user enters username and password")
//	public void userEntersUsernameAndPassword() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("username")).sendKeys("student");
//		Thread.sleep(3000);
//		driver.findElement(By.id("password")).sendKeys("Password123");
//		Thread.sleep(3000);
//	   
//	}
	
	@When("user enters {string} and {string}")
	public void userEntersUsernameAndPassword(String username,String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
	   
	}

	@And("clicks on the login button")
	public void clicksOnTheLoginButton() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}

	@Then("user is navigated to the home page")
	public void userIsNavigatedToTheHomePage() {
	    // Write code here that turns the phrase above into concrete actions
	    
		 System.out.println("User login successfully checked");
		 driver.quit();
	}


}
