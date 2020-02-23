package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class LoginPage extends BaseClass{
	
	//one way
	public WebElement userName= driver.findElement(By.id("txtUsername"));
	public WebElement password=driver.findElement(By.id("txtPassword"));
	public WebElement loginBtn=driver.findElement(By.id("btnLogin"));

	
//	// Preferred way is @FindBy and page Factory
//	
//	@FindBy(id="txtUsername")
//	WebElement userNameN;
//	
//	@FindBy(id="txtPassword")
//	WebElement passwordP;
//	
//	@FindBy(id="btnLogin")
//	WebElement loginBtnL;
//	
//	public LoginPage() {
//		PageFactory.initElements(driver, this);
//	}
//	
}
