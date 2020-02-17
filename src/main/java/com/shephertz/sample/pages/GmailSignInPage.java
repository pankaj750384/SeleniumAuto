package com.shephertz.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GmailSignInPage {
	 WebDriver driver = null;
	 
	 @FindBy(how = How.ID, using = "Email")
	 public WebElement txt_Email; 
	 
	 @FindBy(how = How.ID, using ="next")
	 public WebElement btn_next;
	 
	//*[@id="password"]/div[1]/div/div[1]/input
	 
	 @FindBy(how=How.ID,using="Passwd")
	 public WebElement txt_Psw_Email;
	 
	 @FindBy(how=How.ID,using="signIn")
	 public WebElement btn_next2;
	 
	 
	 public GmailSignInPage(WebDriver driver) {
		 
		 this.driver = driver;
		 
	 }
	 
	 
}
