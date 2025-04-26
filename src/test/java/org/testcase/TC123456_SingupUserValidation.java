package org.testcase;

import java.io.IOException;

import org.locator.SignupLocator;
import org.reusable.CommonAction;
import org.reusable.ExcelReadData;
import org.testmethod.HomePage;
import org.testng.annotations.Test;

public class TC123456_SingupUserValidation extends CommonAction{

	HomePage hp = new HomePage();

	@Test(groups="sanity")
	public void Test2331() throws IOException, InterruptedException
	{
		System.out.println("Test2331");
		launchBrowser();
		passURL("https://www.amazon.in");
		hp.singUpValidation();
		hp.forgetPassword();
		hp.Login();
	}
	
	@Test(groups="april")
	public void Test123() throws IOException, InterruptedException
	{
		System.out.println("Test123");
		launchBrowser();
		passURL("https://www.amazon.in");
		hp.singUpValidation();
		hp.forgetPassword();
		hp.Login();
	}
	
	@Test(groups= {"april","sanity"})
	public void Test1232() throws IOException, InterruptedException
	{
		System.out.println("Test1232");
		launchBrowser();
		passURL("https://www.amazon.in");
		hp.singUpValidation();
		hp.forgetPassword();
		hp.Login();
	}
	
}
