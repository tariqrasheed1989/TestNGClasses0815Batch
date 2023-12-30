package test;

import org.testng.annotations.Test;

public class HomeLoan extends Annotations
{
	@Test
	public void webHomeLoan()
	{
		System.out.println("I am web Home Loan");
	}
	
	@Test(groups = {"smoke"})
	public void APIHomeLoan()
	{
		System.out.println("I am API Home Loan");
	}
	
	@Test (enabled=true)
	public void mobileHomeLoan()
	{
		System.out.println("I am mobile Home Loan");
	}

}
