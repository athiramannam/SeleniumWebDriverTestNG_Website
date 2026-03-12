package ojt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Services {
	WebDriver driver;
	
	@BeforeMethod 
	public void openSite() throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://gspedia.com/projects/aviationmedicals2/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			WebElement servicesLink = driver.findElement(By.xpath("(//a[@href='services.html'][normalize-space()='Services'])[1]"));
			Thread.sleep(2000);
			servicesLink.click();
			
	  }
	@Test(priority = 1)
	public void verifyUrl() throws InterruptedException
	{
//		WebElement servicesLink = driver.findElement(By.xpath("(//a[@href='services.html'][normalize-space()='Services'])[1]"));
//		Thread.sleep(2000);
//		servicesLink.click();
		
		String actualUrl =driver.getCurrentUrl();
		String expectedUrl ="https://gspedia.com/projects/aviationmedicals2/services.html";
		Assert.assertEquals(actualUrl, expectedUrl,"Url Mismatch");
	}
	@Test(priority = 2)
	public void verifyTitle() throws InterruptedException
	{
//		WebElement servicesLink = driver.findElement(By.xpath("(//a[@href='services.html'][normalize-space()='Services'])[1]"));
//		Thread.sleep(2000);
//		servicesLink.click();
		String actualTitle =driver.getTitle();
		String expectedTitle ="Services || Aviation Medicals";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority = 3)
	public void CASAMediExam() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 500)");
		        WebElement CASLink = driver.findElement(By.xpath("(//a[@href='casa-medical-examinations.html'][normalize-space()='CASA Medical Examinations'])[1]"));
		Thread.sleep(5000);
		CASLink.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		//for ( int i = 0;i<10;i++)
		//{
		act.sendKeys(Keys.PAGE_DOWN).perform();
		//}
	}
	@Test(priority = 4)
	public void Fitness2FlyAssess() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 500)");
        WebElement Fit2FlyLink = driver.findElement(By.xpath("(//a[normalize-space()='Fitness-to-Fly Assessments'])[1]"));
		Thread.sleep(5000);
		Fit2FlyLink.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
	}
	@Test(priority = 5)
	public void TravelAdNVacc() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 500)");
		WebElement TravelAdNVacLink = driver.findElement(By.xpath("(//a[normalize-space()='Travel Advice and Vaccinations'])[1]"));
		Thread.sleep(5000);
		TravelAdNVacLink.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
	}
	@Test(priority =6)
	public void FatigueRM() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 1000)");
		WebElement FatigueRMLink = driver.findElement(By.xpath("(//a[@href='fatigue_risk_management.html'])[1]"));
		Thread.sleep(5000);
		FatigueRMLink.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
	}
	@Test(priority =7)
	public void OccuHealthServices() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 1000)");
		WebElement OccHealthSerLink = driver.findElement(By.xpath("(//a[@href='occupationalhealthservices.html'])[1]"));
		Thread.sleep(5000);
		OccHealthSerLink.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
	}
	@Test(priority =8)
	public void TelehealthServices() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 1000)");
		WebElement TelehealthSerLink = driver.findElement(By.xpath("(//a[@href='Telehealth_services.html'])[1]"));
		Thread.sleep(5000);
		TelehealthSerLink.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
	}
	@Test(priority =8)
	public void SpecialistReferrals() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 1500)");
		WebElement SpecialistRefLink = driver.findElement(By.xpath("(//a[normalize-space()='Specialist Referrals'])[1]"));
		Thread.sleep(5000);
		SpecialistRefLink.click();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
	}
	@AfterMethod 
	  public void closeSite() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.quit();

}
}
