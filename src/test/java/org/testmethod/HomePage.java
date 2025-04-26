package org.testmethod;

import java.io.IOException;

import org.locator.SignupLocator;
import org.reusable.CommonAction;
import org.reusable.ExcelReadData;
import org.testng.Reporter;

public class HomePage extends CommonAction{

	SignupLocator sl = new SignupLocator();
	ExcelReadData re = new ExcelReadData();
	
	public void singUpValidation() throws IOException, InterruptedException
	{
		sl.signinBtn().click();
		waitforsec(2);
		sl.singInUserName().sendKeys(getdata("uname"));
		System.out.println("user entered value");
		Reporter.log("user entered value");
		//sl.singInUserName().sendKeys(re.excelread("uname"));
	}
	
	public void forgetPassword()
	{
		
	}
	
	public void Login()
	{
		
	}
	
}
