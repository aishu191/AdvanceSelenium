package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ChronologicalAnnotation {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	@Test
	public void testcase1() {
		System.out.println("testcase");
	}
	@Test
	public void testcase2() {
		System.out.println("testcase");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}
	
	
}
