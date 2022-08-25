package com.Centurian_Admission_Form.genericutility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class LisImpClass implements ITestListener  {
	

	public void onTestFailure(ITestResult result)   {
		
	
	String testName=result.getMethod().getMethodName();
	System.out.println(testName+"===================Listnening============");
      JavaUtility j = new JavaUtility();
          String Date = j.getSystemDate();
          int intRanNum=j.getRanDomNumber();
	EventFiringWebDriver eDriver= new EventFiringWebDriver(Base_Class.sdriver);
	 File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
	File dst=new File(".\\ScreenShort\\"+Date+testName+intRanNum+".png");
	try
	{

		FileUtils.copyFile(srcFile, dst);
		
	}catch
		(IOException e){
			e.printStackTrace();
		}
	}
	}	
		
		
		
		
		
		
		
		

	
	
		
	
	
