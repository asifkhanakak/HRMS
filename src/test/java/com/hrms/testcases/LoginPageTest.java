package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class LoginPageTest extends CommonMethods {

	 @Test(groups = "smoke")
	public void login() {
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

	}
	/*
	 * Navigate to HRMS Enter uid leave password field blank click login verify
	 * "Password cannot be empty" text close browser
	 */

	 @Test(groups="regression")
	public void negativeLogin() {
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, "Admin");
		click(login.loginBtn);
		String expectedError = "Password cannot be empty";
		Assert.assertEquals(login.errorMsg.getText(), expectedError, "Error message text does not matches");
	}

	// Logining with with Login function created in LoginPageElement Claass
	 @Test
	public void usingLoginFuncation() {
		LoginPageElements login = new LoginPageElements();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Test(dataProvider = "getdata")
	public void xlLogin(String uid, String pwd) throws InterruptedException {
		LoginPageElements login = new LoginPageElements();
		login.login(uid, pwd);
		Thread.sleep(3000);
	}

	@DataProvider
	public static Object[][] getdata() {
		return ExcelUtility.excelIntoArray(Constants.XL_DATA_FILEPATH, "Login");
	}

}
