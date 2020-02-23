package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {
	
	@FindBy(linkText="Leave")
	public WebElement leaveLink;
	
	@FindBy(linkText="Leave List")
	public WebElement leaveList;
	
	@FindBy(linkText = "PIM")
	public WebElement pim;
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement addEmployee;
	
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public void navigateToLeaveList() {
		jsClick(leaveLink);
		jsClick(leaveList);
	}
	
	public void navigateToAddEmployee() {
		jsClick(pim);
		jsClick(addEmployee);
	}

}
