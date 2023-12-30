package test;

import org.testng.annotations.Test;

public class JumboLoan 
{
	@Test (invocationCount = 5, enabled = false)
	public void webJumboLaon()
	{
		System.out.println("I am web jumbo loan");
	}
	@Test(enabled = false)
	public void APIJumboLoan()
	{
		System.out.println("I am API jumbo loan");
	}

	@Test (enabled = false)
	public void mobileJumboLoan()
	{
		System.out.println("I am mobile jumbo loan");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void excption()
	{
		int x=10/0;
		System.out.println("Password arithmetic exception");
	}
}
