package com.Centurian_Admission_Form_ObjectRepositaryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admission_Form {

	
		WebDriver driver;
		
		
		public Admission_Form(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(id="uphn1")
		private WebElement modilenoproEdt1;
		
		@FindBy(id="uphn2")
		private WebElement modilenoproEdt2;
		
		@FindBy(id="ufname")
		private WebElement fathersnameEdt;
		
		@FindBy(id="ufocc")
		private WebElement FOccupationEdt;
		
		@FindBy(id="umname")
		private WebElement MothersnameEdt;
		
		@FindBy(id="umocc")
		private WebElement MOccupationEdt;
		
		@FindBy(id="inc")
		private WebElement IncomeEdt;
		
		@FindBy(id="ufphn")
		private WebElement modilenoproEdt3;
		
		@FindBy(id="umphn")
		private WebElement modilenoproEdt4;
		
		@FindBy(id="gen")
		private WebElement genEdt;
		
		@FindBy(id="cadr")
		private WebElement blankEdt1;
		
		@FindBy(id="cast")
		private WebElement stateEdt1;
		
		@FindBy(id="capin")
		private WebElement pinEdt1;
		
		@FindBy(id="camob")
		private WebElement modilenoproEdt6;
		
		@FindBy(id="padr")
		private WebElement blankEdt2;
		
		@FindBy(id="past")
		private WebElement stateEdt2;
		
		@FindBy(id="papin")
		private WebElement papinEdt2;
		
		@FindBy(id="pamob")
		private WebElement modilenoproEdt7;
		
		@FindBy(id="rur")
		private WebElement RuralclickEdt;
		
		@FindBy(id="natn")
		private WebElement NationalityEdt;
		
		@FindBy(id="relg")
		private WebElement ReligionEdt;
		
		@FindBy(id="cat")
		private WebElement catclickEdit;
		
		@FindBy(id="oarank")
		private WebElement RankEdt;
		
		@FindBy(id="oaroll")
		private WebElement RollnoEdt;
		
		@FindBy(id="oabrn")
		private WebElement AllotedbranchEdt;
		
		@FindBy(id="pcm")
		private WebElement PCMEdt;
		
		@FindBy(id="nob1")
		private WebElement UniversityEdt1;
		
		@FindBy(id="yop1")
		private WebElement passingEdt1;
		
		@FindBy(id="tm1")
		private WebElement TmarksEdt1;
		
		@FindBy(id="mo1")
		private WebElement MobtainedEdt1;
		
		@FindBy(id="divs1")
		private WebElement DivisionEdt1;
		
		@FindBy(id="pom1")
		private WebElement marksEdt1;
		
		@FindBy(id="nob2")
		private WebElement University2;
		
		@FindBy(id="yop2")
		private WebElement passingEdt2;
		
		@FindBy(id="tm2")
		private WebElement TmarksEdt2;
		
		@FindBy(id="mo2")
		private WebElement MobtainedEdt2;
		
		@FindBy(id="divs2")
		private WebElement DivisionEdt2;
		
		@FindBy(id="pom2")
		private WebElement marksEdt;
		
		
		
		@FindBy(xpath="//input[@value='English']")
		private WebElement LanguageBtm;
		
		@FindBy(xpath="//input[@value='Loan']")
		private WebElement PaymenyBtm;
		
		@FindBy(id="frmnext")
		private WebElement NextEdt;
		
		public void Radiobutton() {
			RuralclickEdt.click();
		}
	


public void Admission(String modilenopro, String modilenopro1,String fathersname,String FOccupation ,String Mothersname,String MOccupation ,String Income,String modilenopro2,String modilenopro3,String blank,String state,String pin,String modilenopro4,String blank2,String state2,String pin2,String modilenopro5,String Rural,String Nationality,String Religion ,String ST,String Rank,String Rollno ,String Allotedbranch,String PCM,String University ,String passing,String Tmarks,String Mobtained,String Division,String marks,String University1,String passing1,String Mobtained1,String Division1, String marks1 )
{
	modilenoproEdt1.sendKeys(modilenopro);
	modilenoproEdt2.sendKeys(modilenopro);
	fathersnameEdt.sendKeys(fathersname);
	FOccupationEdt.sendKeys(FOccupation);
	MothersnameEdt.sendKeys(Mothersname);
	MOccupationEdt.sendKeys(MOccupation);
	IncomeEdt.sendKeys(Income);
	modilenoproEdt3.sendKeys(modilenopro);
	modilenoproEdt4.sendKeys(modilenopro);
	genEdt.click();
	blankEdt1.sendKeys(blank);
	stateEdt1.sendKeys(state);
	pinEdt1.sendKeys(pin);
	modilenoproEdt6.sendKeys(modilenopro);
	blankEdt2.sendKeys(blank);
	stateEdt2.sendKeys(state);
	papinEdt2.sendKeys(pin);
	modilenoproEdt7.sendKeys(modilenopro);
	RuralclickEdt.click();
	NationalityEdt.sendKeys(Nationality);
	ReligionEdt.sendKeys(Religion);
	catclickEdit.click();
	RankEdt.sendKeys(Rank);
	RollnoEdt.sendKeys(Rollno);
	AllotedbranchEdt.sendKeys(Allotedbranch);
	PCMEdt.sendKeys(PCM);
	UniversityEdt1.sendKeys(University);
	passingEdt1.sendKeys(passing);
	TmarksEdt1.sendKeys(Tmarks);
	MobtainedEdt1.sendKeys(Mobtained);
	DivisionEdt1.sendKeys(Division);
	marksEdt1.sendKeys(marks);
	University2.sendKeys(University);
	passingEdt2.sendKeys(passing);
	TmarksEdt2.sendKeys(Tmarks);
	MobtainedEdt2.sendKeys(Mobtained);
	MobtainedEdt2.sendKeys(Mobtained);
	DivisionEdt2.sendKeys(Division);
	marksEdt.sendKeys(marks);
	LanguageBtm.click();
	PaymenyBtm.click();
	NextEdt.click();
}




	
}

