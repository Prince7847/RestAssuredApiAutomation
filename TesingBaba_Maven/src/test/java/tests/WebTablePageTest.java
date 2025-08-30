package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.WebTablePage;

public class WebTablePageTest extends BaseLibrary{
	
	
	
       WebTablePage ob;
	
	@BeforeTest
	public void launchURl() {
		launchurl();
		ob = new WebTablePage();
		
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
	public void webtable() {
		ob.webtable();
	}
	
	@Test(priority = 5)
    public void formsubmit() {
		ob.clickonname();
	}	

}
