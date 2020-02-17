package com.shephertz.sample.testcases;

import org.testng.annotations.Test;

import com.shephertz.sample.pages.GmailSignInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://accounts.google.com/");
		SignInPage = PageFactory.initElements(driver, GmailSignInPage.class);
	}

	@Test
	public void testLoginGmail() throws InterruptedException {
		SignInPage.txt_Email.sendKeys("test.shephertz@gmail.com");
		SignInPage.btn_next.click();
		Thread.sleep(2000);
		SignInPage.txt_Psw_Email.sendKeys("test.shephertz");
		SignInPage.btn_next2.click();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		driver.quit();
	}

}
