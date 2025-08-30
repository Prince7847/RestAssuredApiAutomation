package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.LoginPage;

public class LoginTest extends BaseLibrary {
	
	LoginPage ob;
	
	@BeforeTest
	public void launchURl() {
		launchurl();
		ob = new LoginPage();
		
	}
	
	@Test(priority = 1)
	public void clickOnclose() {
		ob.clickonclose();
		
	}
	
	@Test(priority = 2)
	public void getTitle() {
		ob.gettitle();
	}

	@Test(priority = 3)
	public void clickonpractice() {
		ob.clickonpractice();
	}
	
	@Test(priority = 4)
	public void clickonelement() {
		ob.clickonelement();
	}
	
	@Test(priority = 5)
	public void clickonText() {
		ob.clickontext();
	}
	
	}