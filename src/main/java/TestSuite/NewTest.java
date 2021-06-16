package TestSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.PageObject;


public class NewTest{
	@BeforeTest
	static void initialiseFrameworkSetup() {
		PageObject.init();
	}
	@Test(priority = 1)
	static void Test1() {
		//TestCase1.Test1();
	}
	@AfterTest()
	static void quit() {
		PageObject.closeBrowser();
	}
}