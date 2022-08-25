package com.Centurian_Admission_Form_ObjectRepositaryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Document_Upload {

	
		WebDriver driver;
		public Document_Upload(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath ="//input[@value='I accept']")
		private WebElement iaccept;
		
		//input[@value='I accept']
		
		
		/*public WebElement getiaccept() {
			return iaccept;
		}
		

		@FindBy(id = "dec")
		private WebElement documentacpt;


		public WebElement getdocumentacpt() {
			return documentacpt ;
		}
		
		
		public void clickiaccept() { 
			documentacpt.click();
	}
		*/
		public WebElement getiaccept() {
			return iaccept;
			}
		
		public void clickiacc() { 
			iaccept.click();
}
}
