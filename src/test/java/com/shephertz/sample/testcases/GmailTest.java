package com.shephertz.sample.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.shephertz.sample.pages.GmailSignInPage;

public class GmailTest {

	static WebDriver driver;
	GmailSignInPage SignInPage;

//	@BeforeClass
//	public void setUp() {
//		/*
//		 * WebDriverManager.chromedriver().setup();
//		 * 
//		 * System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		 * 
//		 * ChromeOptions options = new ChromeOptions();
//		 * options.addArguments("--headless");
//		 * options.addArguments("--start-maximized");
//		 * options.addArguments("--window-size=1200,800"); driver = new
//		 * ChromeDriver(options);
//		 * System.out.println("---Intialize Chrome Driver------------");
//		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		 * driver.get("http://accounts.google.com/");
//		 * 
//		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
//		 * Auto-generated catch block e.printStackTrace(); } SignInPage =
//		 * PageFactory.initElements(driver, GmailSignInPage.class);
//		 */
//		
//		
//		
////		ChromeOptions options = new ChromeOptions();
////		options.addArguments("headless");
////		
////		 new DesiredCapabilities();
////	       URL serverurl;
//	try {
////	serverurl = new URL("http://localhost:9515");
////	       DesiredCapabilities capabilities = DesiredCapabilities.chrome();
////	       driver = new RemoteWebDriver(serverurl,capabilities);
////	WebDriverManager.chromedriver().setup();
//		
//        System.setProperty("webdriver.chrome.driver",
//                "ChromeDriverPath");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        options.addArguments("window-size=1200x600");
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://www.facebook.com/");
//        driver.get("https://www.google.co.in/");
//        System.out.println("title is: " + driver.getTitle());
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("pathTOSaveFile"));
//        driver.quit();
//	} catch (MalformedURLException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//	}
//
//	// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//	//
//	// ChromeOptions options = new ChromeOptions();
//	// options.addArguments("headless");
//	//
//	// driver = new ChromeDriver(options);
//	// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//	driver.get("http://accounts.google.com/");
//	SignInPage = PageFactory.initElements(driver, GmailSignInPage.class);
//
//		
//	}
//
//	@Test
//	public void testLoginGmail() throws InterruptedException {
//		System.out.println("======testLoginGmail=====Started=");
//		SignInPage.txt_Email.sendKeys("test.shephertz@gmail.com");
//		System.out.println("Email Enterd");
//		SignInPage.btn_next.click();
//		System.out.println("Click Next and wait for some time");
//		Thread.sleep(1000);
//		SignInPage.txt_Psw_Email.sendKeys("test.shephertz");
//		System.out.println("Password Enterd");
//		SignInPage.btn_next2.click();
//
//		System.out.println("=====Click Sign in=");
//	}
//
//	@AfterClass
//	public void afterClass() {
//		driver.close();
//		driver.quit();
//	}
	
    @Test
    public void testExecution() throws IOException {
        System.setProperty("webdriver.chrome.driver", "/home/devops/chromedriver/chromedriver");
        // Add options to Google Chrome. The window-size is important for responsive sites
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://seleniumhq.org");
        // a guarantee that the test was really executed
//        driver.findElement(By.id("q")).isDisplayed();
        driver.quit();
    }

}
