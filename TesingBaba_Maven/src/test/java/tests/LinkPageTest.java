package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.LinkPage;

public class LinkPageTest extends BaseLibrary {
	
	
	LinkPage ob;
	
	@BeforeTest
	public void launchURl() {
		launchurl();
		ob = new LinkPage();
		
	}
	
	@Test(priority = 1)
	public void clickOnclose() {
		ob.clickonclose();
		
	}
	
	
	@Test(priority = 2)
	public void clickonpractice() {
		ob.clickonpractice();
	}
	
	@Test(priority = 3)
	public void clickonelement() {
		ob.clickonelement();
	}
	
	@Test(priority = 4)
	public void clickonlink() {
		ob.link();
	}
	
	@Test(priority = 5)
	public void clickondemo() {
		ob.democontent();
	}
	
	@Test(priority = 6)
	public void clickoncloseontab() {
		ob.clickonclosenewtab();
	}
	
	
	
	
	

}
