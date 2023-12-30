package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations 
{
	@BeforeSuite
	public void openSQLConnection()
	{
		System.out.println("I will start SQL connection: Before suite");
	}
	@AfterSuite
	public void closeSQLclose()
	{
		System.out.println("I will close SQL connection: After suite");
	}
	@BeforeTest
	public void addCertificate()
	{
		System.out.println("I am before Test and I will add certificate");
	}
	@AfterTest
	public void removeCertificate()
	{
		System.out.println("I am after Test and I will remove certificate");
	}
	@BeforeClass
	public void addPlugIn()
	{
		System.out.println("I will add plug");
	}
	@AfterClass
	public void removePlugIn()
	{
		System.out.println("I will remove plug");
	}
	@BeforeMethod
	public void initializeBrowser()
	{
		//chrome
		System.out.println("Open broswer");
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Close browser");
	}

}
