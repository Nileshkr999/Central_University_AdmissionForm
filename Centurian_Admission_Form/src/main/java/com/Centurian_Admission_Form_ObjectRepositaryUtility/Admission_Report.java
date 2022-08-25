package com.Centurian_Admission_Form_ObjectRepositaryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admission_Report {

	
		
WebDriver driver;
		
		
		public Admission_Report(WebDriver driver) {
			//this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath ="//a[text()='Login Again']")
		private WebElement LoginAgainEdt;

		public WebElement getSignupnameEdt() {
			return LoginAgainEdt;
		}
		public void Loginagain() { 
			LoginAgainEdt.click();
	}

}
