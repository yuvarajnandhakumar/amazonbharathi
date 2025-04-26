package org.testcase;

import java.io.IOException;

import org.reusable.CommonAction;
import org.testmethod.HomePage;
import org.testmethod.SearchItem;
import org.testng.annotations.Test;

public class Tc12233_SearchData extends CommonAction{

	HomePage hp = new HomePage();
	SearchItem si = new SearchItem();
	
	@Test
	public void Test343() throws IOException, InterruptedException
	{
		launchBrowser();
		passURL("https://www.amazon.in");
		
		hp.singUpValidation();
		hp.Login();
		si.searchclick();
		si.searchItemValidation("mobile1"); //excelread
	}
	
}
