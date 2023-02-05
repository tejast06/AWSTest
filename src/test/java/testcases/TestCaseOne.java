package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class TestCaseOne extends BaseClass {
	
	public HomePage homePage;

	public TestCaseOne() throws IOException, IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setUp() throws IOException {
		initialization();
		homePage = new HomePage();
	}
	
	@Test
	public void click() {
		
		
		homePage.clickOnTesting();
	}
	
	

}
