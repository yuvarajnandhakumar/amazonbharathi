package org.testcase;

import java.io.IOException;

import org.reusable.CommonAction;
import org.testmethod.HomePage;
import org.testmethod.SearchItem;
import org.testng.annotations.Test;

public class ExeJavaFile extends CommonAction{

	HomePage hp = new HomePage();
	SearchItem si = new SearchItem();
	
	
	public static void main(String[] args) throws Exception 
	{
		ExeJavaFile e = new ExeJavaFile();
		e.sss();
	}
	
	
	
	public void sss() throws Exception
	{
		System.out.println("hello");
		launchBrowser();
		passURL("https://www.amazon.in");
		
		hp.singUpValidation();
		hp.Login();
		si.searchclick();
		si.searchItemValidation("mobile1"); //excelread
	}
}
