package searchSteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search {
	WebDriver driver;
	@Given("User launches chrome broswer")
	public void userLaunchesChromeBroswer() {
		
	    driver= new ChromeDriver();

	}

	@Given("opens google.com")
	public void opensGoogleCom() throws InterruptedException {
	    driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
	    Thread.sleep(3000);
	}

	@When("user enters a search string")
	public void userEntersASearchString() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("M S Dhoni");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 Thread.sleep(3000);

	}

	@When("click search button")
	public void click_search_button() throws InterruptedException {
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 Thread.sleep(3000);
	}

	@Then("user is navigated to the search result page")
	public void user_is_navigated_to_the_search_result_page() {
		System.out.println("Search Successful");
		driver.quit();
	}

}
