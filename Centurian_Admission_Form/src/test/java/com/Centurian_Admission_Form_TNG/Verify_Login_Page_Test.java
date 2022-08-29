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
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Fetch_UserId_Pass;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Login_Page;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.SignUp_Page;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.Centurian_Admission_Form.genericutility.LisImpClass.class)
public class Verify_Login_Page_Test extends Base_Class{


	@Test(priority=3)
	public void TestLogin() throws Throwable{
		System.out.println("====================Login is Sucessfully===================");
		//
	}


}



