package com.shephertz.sample.testcases;

import org.testng.annotations.Test;

import com.shephertz.sample.pages.GmailSignInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GmailTest {

	static WebDriver driver;
	GmailSignInPage SignInPage;

	@BeforeClass
	public void setUp() {
		/*
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--headless");
		 * options.addArguments("--start-maximized");
		 * options.addArguments("--window-size=1200,800"); driver = new
		 * ChromeDriver(options);
		 * System.out.println("---Intialize Chrome Driver------------");
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.get("http://accounts.google.com/");
		 * 
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } SignInPage =
		 * PageFactory.initElements(driver, GmailSignInPage.class);
		 */
		
		
		
		
		
		 new DesiredCapabilities();
	       URL serverurl;
	try {
	serverurl = new URL("http://localhost:9515");
	       DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	       driver = new RemoteWebDriver(serverurl,capabilities);
	WebDriverManager.chromedriver().setup();
	} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	// System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//
	// ChromeOptions options = new ChromeOptions();
	// options.addArguments("headless");
	//
	// driver = new ChromeDriver(options);
	// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("http://accounts.google.com/");
	SignInPage = PageFactory.initElements(driver, GmailSignInPage.class);

		
	}

	@Test
	public void testLoginGmail() throws InterruptedException {
		System.out.println("======testLoginGmail=====Started=");
		SignInPage.txt_Email.sendKeys("test.shephertz@gmail.com");
		System.out.println("Email Enterd");
		SignInPage.btn_next.click();
		System.out.println("Click Next and wait for some time");
		Thread.sleep(1000);
		SignInPage.txt_Psw_Email.sendKeys("test.shephertz");
		System.out.println("Password Enterd");
		SignInPage.btn_next2.click();

		System.out.println("=====Click Sign in=");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		driver.quit();
	}

}
