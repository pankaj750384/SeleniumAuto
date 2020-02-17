package com.shephertz.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GmailSignInPage {
	 WebDriver driver = null;
	 
	 @FindBy(how = How.ID, using = "identifierId")
	 public WebElement txt_Email; 
	 
	 @FindBy(how = How.ID, using ="identifierNext")
	 public WebElement btn_next;
	 
	//*[@id="password"]/div[1]/div/div[1]/input
	 
	 @FindBy(how=How.XPATH,using="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")
	 public WebElement txt_Psw_Email;
	 
	 @FindBy(how=How.ID,using="passwordNext")
	 public WebElement btn_next2;
	 
	 
	 public GmailSignInPage(WebDriver driver) {
		 
		 this.driver = driver;
		 
	 }
	 
	 
}
