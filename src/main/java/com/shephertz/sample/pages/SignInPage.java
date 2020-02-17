package com.shephertz.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {
	 WebDriver driver = null;
	 
	 @FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div/div[1]/a")
	 public WebElement btn_Login_to_AppHQ; 
	 
	 @FindBy(how = How.ID, using ="username")
	 public WebElement txt_User_Name;
	 
	 
	 @FindBy(how = How.ID, using ="pwd")
	 public WebElement txt_User_Password;
	 
	 @FindBy(how = How.ID, using ="Sign_in")
	 public WebElement btn_login;
	 
	 @FindBy(how = How.ID, using ="appHQLoggedInUser")
	 public WebElement dropdown_logout;
	 
	 @FindBy(how = How.XPATH, using ="//*[@id=\"ng-app\"]/body/div[1]/div[1]/div[1]/div[2]/ul/li[4]/a")
	 public WebElement btn_logout;
	 
	 
	
	 
	 
	 public SignInPage(WebDriver driver) {
		 
		 this.driver = driver;
		 
	 }
	 
	 
}
