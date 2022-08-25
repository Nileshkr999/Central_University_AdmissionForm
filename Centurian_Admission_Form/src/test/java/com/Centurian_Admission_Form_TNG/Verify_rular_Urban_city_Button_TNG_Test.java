package com.Centurian_Admission_Form_TNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Centurian_Admission_Form.genericutility.Base_Class;
import com.Centurian_Admission_Form_ObjectRepositaryUtility.Admission_Form;
@Listeners(com.Centurian_Admission_Form.genericutility.LisImpClass.class)
public class Verify_rular_Urban_city_Button_TNG_Test extends Base_Class {
	
	@Test(priority=5)
	public void VerifyRularButton() throws Throwable  {
	Admission_Form adm=new  Admission_Form(driver);
	adm.Radiobutton();
//Close the application
	String actualUrl = driver.getCurrentUrl();
	String expectedUrl = "admsnform.php";
	SoftAssert soft= new SoftAssert();
	soft.assertTrue(actualUrl.contains(expectedUrl));
	System.out.println("verify Admission form test case pass");
	soft.assertAll();
	
	
	//CLOSE Browser
	driver.close();
}
}