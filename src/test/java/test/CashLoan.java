package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CashLoan //extends Annotations
{
	@Test(groups = {"smoke","regression"}, enabled = false)
	public void webCashLoan()
	{
		System.out.println("Hello! I am web cash loan");
	}
	@Test(groups = {"regression"})
	public void mobileCashLoan()
	{
	System.out.println("Hi there! I am Mobile Cash loan");	
	}
	@Test(groups = {"smoke"})
	public void APICashLoan()
	{
		System.out.println("Hello! I am API cash loan");
	}
	
	@Test(groups = {"regression"},timeOut = 10000)
	public void DeskCashLoan()
	{
	System.out.println("Hi there! I am Desk Cash loan");	
	}
	
	@Test(dataProvider = "getData")
	public void TestLogin(String username,String password,String passcode)
	{
		System.out.println("Username : "+username+"\nPassword : "+password+"\nPasscode : "+passcode);
	}
	
	@DataProvider
	public String[][] getData()
	{
		String data[][]=new String[3][3];
		//data set1
		data[0][0]="user1";
		data[0][1]="password1";
		data[0][2]="123";
		
		//data set2
		data[1][0]="user2";
		data[1][1]="password2";
		data[1][2]="456";
		
		//data set2
		data[2][0]="user3";
		data[2][1]="password3";
		data[2][2]="789";
		
		return data;
	}
	
	@Test
	public void failedTest()
	{
		Assert.assertTrue(false);
	}

}
