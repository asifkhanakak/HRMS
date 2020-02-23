package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;

public class LeaveListPageTest extends CommonMethods {

	@Test(groups="regression")
	public void leaveLabelvalidation() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dash = new DashboardPageElements();
		LeaveListPageElements leaveList = new LeaveListPageElements();
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");
		click(login.loginBtn);
		jsClick(dash.leaveLink);
		jsClick(dash.leaveList);
		Assert.assertTrue(leaveList.leaveListLbl.isDisplayed(), "label is not displayed");

		takeScreenshot("label");
	}
	
	@Test(groups="regression")
	public void leaveLabelvalidation1() {
		LoginPageElements login=new LoginPageElements();
		DashboardPageElements dashboard=new DashboardPageElements();
		LeaveListPageElements leaveList=new LeaveListPageElements();
		
		login.login("admin", "Syntax@123" );
		dashboard.navigateToLeaveList();
		Assert.assertTrue(leaveList.leaveListLbl.isDisplayed(), "label is not displayed");
	}
	
	
	
	
	
	
	

}
