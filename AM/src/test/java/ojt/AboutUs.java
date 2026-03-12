package ojt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutUs {
	WebDriver driver;
	//Actions act = new Actions(driver);
	@BeforeMethod 
	public void openSite() {
			driver = new ChromeDriver();
			driver.get("https://gspedia.com/projects/aviationmedicals2/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
	  }
	@Test(priority = 1)
	public void verifyUrl() throws InterruptedException
	{
		WebElement aboutUsLink = driver.findElement(By.xpath("(//a[@href='about.html'][normalize-space()='About Us'])[1]"));
		Thread.sleep(2000);
		aboutUsLink.click();
		
		String actualUrl =driver.getCurrentUrl();
		String expectedUrl ="https://gspedia.com/projects/aviationmedicals2/about.html";
		Assert.assertEquals(actualUrl, expectedUrl,"Url Mismatch");
	}
	@Test(priority = 2)
	public void verifyTitle() throws InterruptedException
	{
		WebElement aboutUsLink = driver.findElement(By.xpath("(//a[@href='about.html'][normalize-space()='About Us'])[1]"));
		Thread.sleep(2000);
		aboutUsLink.click();
		String actualTitle =driver.getTitle();
		String expectedTitle ="About || Aviation Medicals";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterMethod 
	  public void closeSite() throws InterruptedException {
		  Thread.sleep(10000);
		  driver.quit();

}
}
