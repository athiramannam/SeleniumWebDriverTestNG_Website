package ojt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home {
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
	public void verifyTitle()
	{
		String actualTitle =driver.getTitle();
		String expectedTitle ="Aviation Medicals";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority = 2)
	public void verifyReadMore1() throws InterruptedException
	{
		WebElement ReadMoreLink = driver.findElement(By.xpath("//a[normalize-space()='Read More']"));
		Thread.sleep(10000);
		ReadMoreLink.click();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl = "https://gspedia.com/projects/aviationmedicals2/about.html";
		Assert.assertEquals(actualUrl, expectedUrl);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement readMoreButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Read More']")));
		//readMoreButton.click();
	}
	@Test(priority = 3)
	public void verifyReadMore2() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 1000)");
		//WebElement ReadMoreLink = driver.findElement(By.xpath("//a[normalize-space()='Read More']"));
        WebElement ReadMoreLink = driver.findElement(By.cssSelector("div[class='about-three__right text-center'] a[class='thm-btn about-three__btn mx-auto']"));
		Thread.sleep(10000);
		ReadMoreLink.click();
	}
	@Test(priority = 4)
	public void bookAppointment() throws InterruptedException
	{
		
		//Actions actions = new Actions(driver);
       // actions.sendKeys(Keys.PAGE_DOWN).perform();
       // actions.sendKeys(Keys.PAGE_DOWN).perform();
      //  Thread.sleep(10000);
		//WebElement BookAppoint = driver.findElement(By.xpath("//a[normalize-space()='Book Appointment']"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0, 1500)");
        WebElement BookAppointBtn = driver.findElement(By.cssSelector(".thm-btn.we-fly__btn-one"));
        
        Thread.sleep(5000); 
        // Scroll the button into view using JavascriptExecutor
       // JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("arguments[0].scrollIntoView(true);", BookAppointBtn);

		
       
            Thread.sleep(5000); 
       

        // Click the button after scrolling to it
      
		//Thread.sleep(10000);
        BookAppointBtn.click();
	}
	@Test(priority = 5)
	public void CASAMediExam() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 2000)");
		//WebElement ReadMoreLink = driver.findElement(By.xpath("//a[normalize-space()='Read More']"));
        WebElement CASLink = driver.findElement(By.linkText("CASA Medical Examinations"));
		Thread.sleep(10000);
		CASLink.click();
	}
	@Test(priority = 6)
	public void BeforeMediExam() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 2000)");
		//WebElement ReadMoreLink = driver.findElement(By.xpath("//a[normalize-space()='Read More']"));
        WebElement BeforeMLink = driver.findElement(By.linkText("Before attending your medical examination"));
		Thread.sleep(10000);
		BeforeMLink.click();
	}	
	@Test(priority = 7)
	public void FatigueRM() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 2000)");
		//WebElement ReadMoreLink = driver.findElement(By.xpath("//a[normalize-space()='Read More']"));
        WebElement FatigueLink = driver.findElement(By.xpath("(//a[@href='fatigue_risk_management.html'])[1]"));
		Thread.sleep(10000);
		FatigueLink.click();
	}	
	@Test(priority = 8)
	public void OccuHS() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 2000)");
		//WebElement ReadMoreLink = driver.findElement(By.xpath("//a[normalize-space()='Read More']"));
        WebElement OccuLink = driver.findElement(By.xpath("(//a[@href='occupationalhealthservices.html'])[1]"));
		Thread.sleep(10000);
		OccuLink.click();
	}
	@Test(priority = 9)
	public void AllServices() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 2100)");
		//WebElement ReadMoreLink = driver.findElement(By.xpath("//a[normalize-space()='Read More']"));
        WebElement AllSerLink = driver.findElement(By.xpath("(//a[normalize-space()='All Services'])[1]"));
		Thread.sleep(10000);
		AllSerLink.click();
	}
	@Test(priority = 10)
	public void ExpertAviMed() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 2700)");
		//WebElement ReadMoreLink = driver.findElement(By.xpath("//a[normalize-space()='Read More']"));
        WebElement ExpAviMLink = driver.findElement(By.xpath("(//a[@href='#'])[4]"));
		Thread.sleep(10000);
		ExpAviMLink.click();
	}
	@Test(priority = 11)
	public void PersonalPlans() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 2700)");
		//WebElement ReadMoreLink = driver.findElement(By.xpath("//a[normalize-space()='Read More']"));
        WebElement PersPlanLink = driver.findElement(By.xpath("(//a[@href='#'])[6]"));
		Thread.sleep(10000);
		PersPlanLink.click();
	}
	@Test(priority = 12)
	public void ConTeleHealthOp() throws InterruptedException
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, 2700)");
		//WebElement ReadMoreLink = driver.findElement(By.xpath("//a[normalize-space()='Read More']"));
        WebElement ConTelHealthOpLink = driver.findElement(By.xpath("(//a[@href='#'])[8]"));
		Thread.sleep(10000);
		ConTelHealthOpLink.click();
	}
	@Test(priority = 13)
	public void verifyScrollToTopIconDisplay() throws InterruptedException
	{
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.END).perform();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		boolean flag = driver.findElement(By.className("icon-right-arrow")).isDisplayed();
		Assert.assertTrue(flag);
	}
	@Test(priority = 14)
	public void verifyScrollToTopIconFun() throws InterruptedException
	{
		//Actions act = new Actions(driver);
		//act.sendKeys(Keys.END).perform();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		WebElement ScrollIcon = driver.findElement(By.className("icon-right-arrow"));
		ScrollIcon.click();
			
	}
	  @AfterMethod 
	  public void closeSite() throws InterruptedException {
		  Thread.sleep(10000);
		  driver.quit();
 
 }
}
