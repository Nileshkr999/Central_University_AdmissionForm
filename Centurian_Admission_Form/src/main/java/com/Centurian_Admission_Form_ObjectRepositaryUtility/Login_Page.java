package com.Centurian_Admission_Form_ObjectRepositaryUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Sign Up ']")
	private WebElement signuplinkEdt;

	
	@FindBy(name = "u_id")
	private WebElement userNameEdt;

	@FindBy(name = "u_ps")
	private WebElement userPasswordEdt;

	@FindBy(id = "u_sub")
	private WebElement loginBtm;

	

	public WebElement getuserNameEdt() {
		return userNameEdt;
	}

	public WebElement getuserPasswordEdt() {
		return userPasswordEdt;
	}

	public WebElement getclickSubmit() {
		return loginBtm;
	}

	public WebElement getclicksignup() {
		return signuplinkEdt;
	}
	
	
	public void loginToApp(String userid, String password) {
	
		userNameEdt.sendKeys(userid); 
		userPasswordEdt.sendKeys(password);
		loginBtm.click();
	}

	public void clickSignup() {
		signuplinkEdt.click();
	}
}
