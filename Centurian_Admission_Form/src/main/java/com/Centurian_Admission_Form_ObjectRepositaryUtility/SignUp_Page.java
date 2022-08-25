package com.Centurian_Admission_Form_ObjectRepositaryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page {
	//int random = jlib.getRanDomNumber();
	
	WebDriver driver;
	public SignUp_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	
	@FindBy(id="in_name")
	private WebElement SignupnameEdt;
	
	@FindBy(id="in_dob")
	private WebElement SignupdateEdt;
	
	@FindBy(id="in_eml")
	private WebElement SignupemailEdt;
	
	@FindBy(id="in_mob")
	private WebElement SignupphonenoEdt;
	
	@FindBy(id="txt_captcha")
	private WebElement SignupcodeEdt;
	
	@FindBy(id="in_sub")
	private WebElement SignupEdt;

	public WebElement getSignupnameEdt() {
		return SignupnameEdt;
	}
	
	public WebElement getSignupdate() {
		return SignupdateEdt;
	}
	public WebElement getSignupemail() {
		return SignupemailEdt;
	}
	public WebElement getSignupphoneno() {
		return SignupphonenoEdt;
	}
	
	public WebElement getSignupcode() {
		return SignupcodeEdt;
	}
	

	
	public  void SignUp(String Signupname, String Signupdate,String Signupphoneno,String Signupemail,String Signupcode)
	{
		SignupnameEdt.sendKeys(Signupname);
		SignupdateEdt.sendKeys(Signupdate);
		SignupphonenoEdt.sendKeys(Signupphoneno);
		SignupemailEdt.sendKeys(Signupemail);
		SignupcodeEdt.sendKeys(Signupcode);
		SignupEdt.click();
		
		}

	
		
	


		
	

	
		
	}
	
	

	


