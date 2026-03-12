package ojt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Team {
WebDriver driver;
	
	@BeforeMethod 
	public void openSite() throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://gspedia.com/projects/aviationmedicals2/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			WebElement teamLink = driver.findElement(By.xpath("(//a[@href='team.html'][normalize-space()='Team'])[1]"));
			Thread.sleep(2000);
			teamLink.click();
			Thread.sleep(5000);
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(5000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			
	  }
	@Test(priority = 1)
	public void verifyUrl() throws InterruptedException
	{
//		WebElement servicesLink = driver.findElement(By.xpath("(//a[@href='services.html'][normalize-space()='Services'])[1]"));
//		Thread.sleep(2000);
//		servicesLink.click();
		
		String actualUrl =driver.getCurrentUrl();
		String expectedUrl ="https://gspedia.com/projects/aviationmedicals2/team.html";
		Assert.assertEquals(actualUrl, expectedUrl,"Url Mismatch");
	}
	@Test(priority = 2)
	public void verifyTitle() throws InterruptedException
	{
//		WebElement servicesLink = driver.findElement(By.xpath("(//a[@href='services.html'][normalize-space()='Services'])[1]"));
//		Thread.sleep(2000);
//		servicesLink.click();
		String actualTitle =driver.getTitle();
		String expectedTitle ="Team || Aviation Medicals";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterMethod 
	  public void closeSite() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.quit();
	}
}
