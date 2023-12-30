package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan
{
	@Test(priority = 0)
	public void webPersonalLoan()
	{
		System.out.println("I am web PL");
	}

	@Test(groups = {"smoke"}, priority = 1)
	public void mobilePersonalLoan()
	{
		System.out.println("I am mobile PL");
	}
	
	@Test(priority = 2)
	public void DoorToDoorPersonalLoan()
	{
		System.out.println("I am DTD PL");
	}
	
	@Test(priority = 3)
	public void interestNewPersonalLoan()
	{
		System.out.println("I am new interest PL");
	}
	@Parameters({"username","password"})
	@Test(dependsOnMethods = "webPersonalLoan", priority = 4)
	public void CorpPersonalLoan(String username,String password)
	{
		System.out.println("I am Corp PL. \n"+"username:"+username+"\npassword: "+password);
	}
	
	@Parameters("URL")
	@Test(groups = {"smoke"}, priority=5)
	public void LalaPersonalLoan(String url)
	{
		System.out.println("I am Lala PL"+url);
	}
}

