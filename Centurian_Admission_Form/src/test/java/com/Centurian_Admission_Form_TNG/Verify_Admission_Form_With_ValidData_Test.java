package com.Centurian_Admission_Form_TNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Centurian_Admission_Form.genericutility.Base_Class;
import com.Centurian_Admission_Form.genericutility.Excelutility;
import com.Centurian_Admission_Form.genericutility.FileUtility;
import com.Centurian_Admission_Form.genericutility.JavaUtility;
import com.Centurian_Admission_Form.genericutility.WebDriverUtility;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Admission_Form;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Admission_Report;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Document_Upload;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Fetch_UserId_Pass;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Login_Page;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Print_Page;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.SignUp_Page;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.Centurian_Admission_Form.genericutility.LisImpClass.class)
public class Verify_Admission_Form_With_ValidData_Test extends Base_Class {
	
	   /* @Test(priority=1)
		public void TestLogin() throws Throwable{
			System.out.println("====================Login is Sucessfully===================");
	}
	
	*/
	
	@Test(priority=1)
	public void Admission_Form() throws Throwable  {
		//Fatch Data From Excel Sheet
		
		 String mobileno = elib.getExcelData("Sheet1", 0, 1);
		 String fathersname = elib.getExcelData("Sheet1", 1, 1);
		 String FOccupation = elib.getExcelData("Sheet1", 2, 1);
		 String Mothersname = elib.getExcelData("Sheet1", 3, 1);
		 String MOccupation = elib.getExcelData("Sheet1", 4, 1);
		 String mobileno1 = elib.getExcelData("Sheet1", 7, 1);
		 String Income = elib.getExcelData("Sheet1", 5, 2);
		 String mobileno3=elib.getExcelData("Sheet1", 7, 1);
		 String mobileno2 = elib.getExcelData("Sheet1", 7, 1);
		 String blank = elib.getExcelData("Sheet1", 8, 1);
		 String state = elib.getExcelData("Sheet1", 8, 2);
		 String pin = elib.getExcelData("Sheet1", 8, 3);
		 String Nationality = elib.getExcelData("Sheet1", 10, 1);
		 String Religion = elib.getExcelData("Sheet1", 12, 1);
		 String Rank = elib.getExcelData("Sheet1", 13, 1);
		 String Rollno = elib.getExcelData("Sheet1", 11, 1);
		 String Allotedbranch = elib.getExcelData("Sheet1", 15, 1);
		 String PCM = elib.getExcelData("Sheet1", 23, 1);
		 String University = elib.getExcelData("Sheet1", 15, 1);
		 String passing = elib.getExcelData("Sheet1", 15, 2);
		 String Tmarks = elib.getExcelData("Sheet1", 15, 3);
		 String Mobtained = elib.getExcelData("Sheet1", 15, 4);
		 String Division = elib.getExcelData("Sheet1", 15, 5);
		 String marks = elib.getExcelData("Sheet1", 15, 6);
		 
		
		
			
		
			
			//Step07:Fill the Admission Form With Valid Data
			Admission_Form adm=new  Admission_Form(driver);
			adm.Admission(mobileno, mobileno, fathersname, FOccupation, Mothersname, MOccupation, Income, mobileno, mobileno, blank, state, pin, mobileno, blank, state, pin, mobileno, pin, Nationality, Religion, state, Rank, Rollno, Allotedbranch, PCM, University, passing, Tmarks, Mobtained, Division, Tmarks, University, passing, Mobtained, Division, marks);
	
			System.out.println("====================Admission form fill with valid Data Sucessfully===================");
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "documents.php";
			SoftAssert soft= new SoftAssert();
			soft.assertTrue(actualUrl.contains(expectedUrl));
			System.out.println("verify Admission form test case pass");
			soft.assertAll();
			
			
		
			
	}
		/*	@Test(priority=2)
			public void Upload_Document() throws Throwable  {
				//Step07:Fill the Admission Form With Valid Data
				
				System.out.println("====================Admission form fill with valid Data Sucessfully===================");
			 //Document upload
			   Document_Upload isso=new Document_Upload(driver);
				isso.clickiacc();
				System.out.println("====================Document ia uploaded Sucessfully===================");
			}
				@Test(priority=3)
				public void print_Button() throws Throwable  {
			   //Step08:Print Button Should be display
			    Print_Page pri=new Print_Page(driver);
			    pri.clickiaccept();
			    //pri.clickiaccept();
			    System.out.println("====================Print button is display Sucessfully===================");
				}
			
			    @Test(priority=4)
				public void Login_again() throws Throwable  {
				//Document_Upload isso=new Document_Upload(driver);
				//isso.clickiaccept();
				//Step09: Login Again
			    Admission_Report logagain=new Admission_Report(driver);
			    logagain.Loginagain();
			    System.out.println("====================login again is Sucessfully===================");
			    }
			    @Test(priority=5)
				public void RuralButton_again() throws Throwable  {
			    
			  //Step06:Check Rular radio button
				Admission_Form adm=new  Admission_Form(driver);
				adm.Radiobutton();
				System.out.println("====================Radio Button click Sucessfully===================");
			*/
	
}


