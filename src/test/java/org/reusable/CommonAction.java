package org.reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonAction {

	public static WebDriver driver;
	public static int sn=1;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void launchBrowser(String bname) //chrome
	{
		
		if(bname.equals("chrome"))
		{WebDriverManager.chromedriver().setup();//version download use
		 driver = new ChromeDriver();}
		
		if(bname.equals("edge"))
		{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		 System.out.println("browser launched");
		 Reporter.log("browser launched");
		
	}
	
	public void launchBrowser() //chrome
	{
		
	
		WebDriverManager.chromedriver().setup();//version download use
		 driver = new ChromeDriver();
		
		 System.out.println("browser launched");
		 Reporter.log("browser launched");
		
	}
	
	public String getdata(String input) throws IOException
	{
	FileInputStream i =new FileInputStream(".//data//crendential.properties");
	Properties p = new Properties();
	p.load(i);
	String op = p.getProperty(input);
	//System.out.println(op);//yuvarajsrec4
	return op;
	}
	
	
	public void passURL(String url) throws IOException
	{
		//driver.get(url);//JSE can be used
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=\'"+url+"\'");

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);//3 - minimum 1sec
		System.out.println("url passed");
		takesnap();
	}
	
	public void waitforsec(int sec) throws InterruptedException
	{
		Thread.sleep(sec*1000);
	}
	
	
	public void takesnap() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;//interface
		File src = ts.getScreenshotAs(OutputType.FILE);//snap
		FileUtils.copyFile(src, new File(".//data//screen"+sn+".png"));
		sn++;
	}
	public void closeDriver()
	{
		driver.close();
		System.out.println("driver is closed");
	}
	
	public void JSE_Scrolldown() throws InterruptedException
	{
		js.executeScript("window.scrollBy(0,500)");//down
		Thread.sleep(2000);
	}
	
	public void JSE_Scrollup() throws InterruptedException
	{
		js.executeScript("window.scrollBy(0,-500)");//down
		Thread.sleep(2000);
	}
	
	public void JSEscrollendofPage() throws InterruptedException
	{
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");//end of page
		Thread.sleep(2000);  
	}
	
	public void alertAccept()
	{
		driver.switchTo().alert().accept();
	}
	
	public void JSEClick(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);//JSE click

	}
}
