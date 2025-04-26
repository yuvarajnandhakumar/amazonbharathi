package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.reusable.CommonAction;

public class SignupLocator extends CommonAction{
	
	public WebElement signinBtn()//variable- act
	{
		WebElement singin_Btn = driver.findElement(By.xpath("//span[contains(text(),'sign in')]"));
		return singin_Btn;
	}
	
	public WebElement singInUserName()
	{
		WebElement singindata = driver.findElement(By.xpath("//input[@name='email']"));
		return singindata;
	}
	

}
