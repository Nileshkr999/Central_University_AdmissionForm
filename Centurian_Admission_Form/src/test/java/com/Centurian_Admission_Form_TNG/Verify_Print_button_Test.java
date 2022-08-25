package com.Centurian_Admission_Form_TNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Centurian_Admission_Form.genericutility.Base_Class;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Admission_Form;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Admission_Report;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Document_Upload;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Print_Page;
@Listeners(com.Centurian_Admission_Form.genericutility.LisImpClass.class)
public class Verify_Print_button_Test extends Base_Class{
	@Test(priority=4)
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
			{
			System.out.println("====================Admission form fill with valid Data Sucessfully===================");
	        }
			
				//Step07:Fill the Admission Form With Valid Data
			{
				System.out.println("====================Admission form fill with valid Data Sucessfully===================");}
			 //Document upload
			   Document_Upload isso=new Document_Upload(driver);
				isso.clickiacc();
				{System.out.println("====================Document ia uploaded Sucessfully===================");
			}
				
			  /* //Step08:Print Button Should be display
			    Print_Page pri=new Print_Page(driver);
			    pri.clickloginagain();
			    //pri.clickiaccept();
			     * 
			     */
			      System.out.println("====================Print button is display Sucessfully===================");
			       
			      //verification
			    
			      String actualUrl = driver.getCurrentUrl();
			  	String expectedUrl = "admsnreport.php";
			  	SoftAssert soft= new SoftAssert();
			  	soft.assertTrue(actualUrl.contains(expectedUrl));
			  	System.out.println("verify Print Button test case pass");
			  	soft.assertAll();
			  	
			  	
			  	
				}
			
}
