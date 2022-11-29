package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class UtilClass extends TestBase{
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	public static void screenshot(String filename) 
	
	{
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 String path ="C:\\Users\\mayur\\eclipse-workspace\\DalalStreetTDD\\Screenshot\\";
		  File des = new File(path);
		  FileHandler.copy(src, des);
		}
		catch(IOException e)
		{
			System.out.println("IO Exception -file not found");
			e.printStackTrace();
		}
		  
		  
	}
}
