package Utility;


import org.testng.ITestListener;
import org.testng.ITestResult;

import TestBase.TestBase;



public class ListenerSetup extends TestBase implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		logger.info("TestCase execution started" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		logger.info("TestCase execution complted" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	
	{
		logger.info("TestCase execution failed" + result.getName());
		UtilClass.screenshot(result.getName()+System.currentTimeMillis());
		System.out.println("Take screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		logger.info("TestCase execution skipped" + result.getName());
	}


	}


