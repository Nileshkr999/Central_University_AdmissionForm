package com.Centurian_Admission_Form.genericutility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryImp implements IRetryAnalyzer{

	int counter=0;
	int retrylimit=4;
	
	public boolean retry(ITestResult result) {
		if(counter<retrylimit) {
			counter++;
			return true;}
		return false;
			
		}
	}

	

