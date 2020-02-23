package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;

import com.hrms.utils.CommonMethods;

public class LoginPageTest1 extends CommonMethods {
	// Test case to validate valid login
	@Test(groups="smoke")
	public void login() {
		test.info("Logging In to the application ");
		LoginPage login = new LoginPage();
		sendText(login.userName, "Admin");
		sendText(login.password, "Syntax@123");
		test.info("Clicking on the login button");
		click(login.loginBtn);
	}
	
	/* Navigate to HRMS 
	 * Enter uid
	 * leave password field blank
	 * click login
	 * verify "Password cannot be empty" text 
	 * close browser
	 */
	
	@Test
	public void negativeLogin() {
		LoginPage login=new LoginPage();
		sendText(login.userName, "Admin");
		click(login.loginBtn);
		
	}
}