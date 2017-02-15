package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.hrm.base.HomePage;

public class EmpPersonalDetails extends HomePage {
	
	public EmpPersonalDetails(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="personal_txtEmpFirstName")
	private WebElement firstname;
	
	public void verifyfirstName(String efn){
		String afn=firstname.getAttribute("value");
		Assert.assertEquals(afn, efn);
	}


}
