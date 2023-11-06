package Bug.HSB_7;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Defaultsection_select {
	WebDriver driver;
@BeforeTest
	
	public void setup() throws Exception
	{
		
		  DesiredCapabilities dc = DesiredCapabilities.chrome();
	        URL url = new URL("http://172.12.20.118:5555/wd/hub");
	        driver = new RemoteWebDriver(url, dc);
	
	       
	}

	@Test(priority=1)
	public void Login() throws InterruptedException {
		
	driver.get("http://apollo2.humanbrain.in/");
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement viewerSectionLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class, 'ng-tns-c93-3')]")));
	viewerSectionLink.click();

	String parentWindow = driver.getWindowHandle();
	WebDriverWait wait1 = new WebDriverWait(driver, 20);
	WebElement login = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Log In ']")));
	login.click();

	Thread.sleep(4000);
	Set<String> allWindows = driver.getWindowHandles();
	for (String window : allWindows) {
	if (!window.equals(parentWindow)) {
	driver.switchTo().window(window);
	break;
	}
	}
	Thread.sleep(4000);
	WebDriverWait wait2 = new WebDriverWait(driver,20);
	WebElement  emailInput = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
	emailInput.sendKeys("teamsoftware457@gmail.com");
	WebDriverWait wait3 = new WebDriverWait(driver,20);
	WebElement  Next = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
	Next.click();
	WebDriverWait wait4 = new WebDriverWait(driver,20);
	WebElement  PasswordInput = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
	PasswordInput.sendKeys("Health#123");
	WebDriverWait wait5 = new WebDriverWait(driver,20);
	WebElement  Next2 = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
	Next2.click();
	Thread.sleep(5000);
	driver.switchTo().window(parentWindow);
	Thread.sleep(5000);
	}
	@Test (priority=2)
	public void table_Process() {
	try {
	WebDriverWait wait6 = new WebDriverWait(driver,30);
	WebElement table1 = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Human fetus ']")));
	table1.click();
	System.out.println("table 1 element is clicked");
	}
	catch (Exception e) {
	System.out.println("table element is not clicked");
	}
	try {
	WebDriverWait wait7 = new WebDriverWait(driver,30);
	WebElement table2 = wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Brain ']")));
	table2.click();
	System.out.println("table 2 element  is clicked");
	}
	catch(Exception e) {
	System.out.println("table 2 element is not clicked");
	}
	try {
	WebDriverWait wait8 = new WebDriverWait(driver,30);
	WebElement table3 = wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()=' FB_3']")));
	table3.click();
	System.out.println("table 3 is clicked");
	}
	catch(Exception e) {
	System.out.println("table 3 element is not clicked");
	}}
	@Test(priority = 3)
	public void Brain_Id() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	try {
	WebElement six = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("((//span[text()='None'])[1])")));
	String S = six.getText();
	String expectedT8 = "SS-15";
	Assert.assertEquals(S, expectedT8);
	} catch (Exception e) {
	e.printStackTrace();
	}
	}

	@Test(priority = 4)
	public void SeriesType() {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	try {
	WebElement seven = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='NISSL'])[2]")));
	String T = seven.getText();
	String expectedT9 = "NISSL";
	Assert.assertEquals(T, expectedT9);
	} catch (Exception e) {
	e.printStackTrace();
	}
	}

	@Test(priority = 5)
	public void SectionNo() {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	try {
	WebElement eight = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='None'])[2]")));
	String X = eight.getText();
	String expectedT10 = "1012";
	Assert.assertEquals(X, expectedT10);
	} catch (Exception e) {
	e.printStackTrace();
	}
	}

	@Test(priority = 6)
	public void FileName() {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	try {
	WebElement nine = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='None'])[3]")));
	String Y = nine.getText();
	String expectedT11 = "B_37_FB3-SL_338-ST_NISL-SE_1012_thumbnail.jpg";
	Assert.assertEquals(Y, expectedT11);
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	@AfterTest
	public void tearDown() {
	if (driver != null) {
	driver.quit();
	}
	}
	}
	


