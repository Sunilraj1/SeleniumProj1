package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddEmpPage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmpPersonalDetails;

import generics.Excel;

public class CreateEmployee extends BaseTest {
	
	@Test
	public void testcreateemployee() throws InterruptedException{
	int rc=Excel.getRowCount(INPUT_PATH, "CreateEmployee");
	for(int i=1;i<=rc;i++){
		String aepURL=Excel.getCellValue(INPUT_PATH, "CreateEmployee", i, 0);
		String fn=Excel.getCellValue(INPUT_PATH, "CreateEmployee", i, 1);
		String ln=Excel.getCellValue(INPUT_PATH, "CreateEmployee", i, 2);
		String vpdURL=Excel.getCellValue(INPUT_PATH, "CreateEmployee", i, 3);
		
		//Click on PIM
		DashboardPage dbPage=new DashboardPage(driver);
		dbPage.clickPIM_Menu();
		
		//Click on Add_Emp
		dbPage.clickAddemp_menu();
		
		//Verify AddEmpPage
		AddEmpPage aePage=new AddEmpPage(driver);
		aePage.verifyURLhas(aepURL);
		
		
		//Enter Valid UN
		aePage.setfirstName(fn);
		
		//Enter Valid LN
		aePage.setlastName(ln);
		
		//Click on Save
		aePage.clickSave();
		
		//Verify Employee Personal Details page
		EmpPersonalDetails epdPage=new EmpPersonalDetails(driver);
		epdPage.verifyURLhas(vpdURL);
		
		//Verify the FirstName
		epdPage.verifyfirstName(fn);
	
	  }
	
	
	}

}
