package com.shephertz.sample.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.shephertz.sample.pages.SignInPage;

public class SignInPageTest {

	static WebDriver driver;
	SignInPage SignInPage;

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
    public void testExecution() throws IOException, InterruptedException {
    	
    	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver", "/home/devops/chromedriver/chromedriver");
        // Add options to Google Chrome. The window-size is important for responsive sites
        ChromeOptions options = new ChromeOptions();
       options.addArguments("headless");
        options.addArguments("window-size=1200x600");
        options.addArguments("start-maximized"); // https://stackoverflow.com/a/26283818/1689770
        options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
        options.addArguments("headless"); // only if you are ACTUALLY running headless
        options.addArguments("no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
        options.addArguments("disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
        options.addArguments("disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
        options.addArguments("disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
        options.addArguments("disable-gpu"); //https://stackoverflow.com/questions/51959986/how-to-solve-selenium-chromedriver-timed-out-receiving-message-from-renderer-exc

        options.addArguments("allow-running-insecure-content");//        driver = new ChromeDriver(options);
        options.addArguments("window-size=1400,800");// 
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Dimension d = new Dimension(1400,800);
        driver.manage().window().setSize(d);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        System.out.println("1.Open AppHQ");
        driver.get("https://apphq.shephertz.com/register/app42Login");
        // a guarantee that the test was really executed
//        driver.findElement(By.id("q")).isDisplayed();
        
        
        
       
        
        
        SignInPage =PageFactory.initElements(driver, SignInPage.class);
        
		/*
		 * File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); try {
		 * FileUtils.copyFile(file, new File("D:\\Headless\\headless_screenshot.png"));
		 * } catch (IOException e) { e.printStackTrace(); }
		 */
        
        
        System.out.println("2.Click on Login With shephertz Acount button");
        SignInPage.btn_Login_to_AppHQ.click();
        System.out.println("3.Wait for some time to load the page");
        Thread.sleep(2000);
        
        System.out.println("4.Enter User Name");
        SignInPage.txt_User_Name.sendKeys("test.ninja@shephertz.com");
        
        
        
        System.out.println("5.Enter Password");
        SignInPage.txt_User_Password.sendKeys("test@123");
        
        System.out.println("6.Click on Login button");
        SignInPage.btn_login.click();
        System.out.println("7.Wait for some time to load the page");
        Thread.sleep(2000);
        
        System.out.println("8.Click on Logout dropdown");
        SignInPage.dropdown_logout.click();
         //Select se=new Select(SignInPage.dropdown_logout);
         //se.selectByVisibleText("Logout");
        Thread.sleep(2000);
        System.out.println("9.Select Logout");
        SignInPage.btn_logout.click();
        
        System.out.println("10.successfully Logout");
		
        driver.quit();
    }

}
