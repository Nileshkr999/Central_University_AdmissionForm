package com.Centurian_Admission_Form_ObjectRepositaryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Print_Page {

	WebDriver driver;
	public Print_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//a[text()='Login Again']")
	private WebElement loginagainEdt;

	public WebElement getloginagainEdt() {
		return loginagainEdt;
	}
	public void clickloginagain() { 
		loginagainEdt.click();

	}

}
 