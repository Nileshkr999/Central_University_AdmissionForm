package com.Centurian_Admission_Form_ObjectRepositaryUtility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fetch_UserId_Pass {
	
	WebDriver driver;
	
	public Fetch_UserId_Pass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);}
	
	@FindBy(xpath ="//font[contains(text(),'Your User ID is')]")
	private WebElement fetchuipw;
	
	public WebElement getfetchuipw() {
		return fetchuipw;
	}

	@FindBy(name = "u_sub")
	private WebElement FetLoginEdt;
	
	public WebElement getFetLoginEdt() {
		return FetLoginEdt;
	}
	public void loginToAppss() {
		FetLoginEdt.click();
	}
		public void fetchuipwdop() {
		String uidpwd=fetchuipw.getText(); 
		//String userid =uidpwd.substring(16,25);
		//String password =uidpwd.substring(42,50);
		}
		
		
			}
		

		

			
	


