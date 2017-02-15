package com.hrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class HomePage extends BasePage{

	@FindBy(xpath="//a[@id='welcome']")
	private WebElement welcome;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public void logout(){
		welcome.click();
		logout.click();
	}
	
	
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_menu;
	
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addemp_menu;
	
	public void clickPIM_Menu(){
		pim_menu.click();
	}
	
	public void clickAddemp_menu(){
		addemp_menu.click();
	}
}
