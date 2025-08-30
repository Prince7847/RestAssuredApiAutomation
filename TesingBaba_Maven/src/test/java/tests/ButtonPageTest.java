package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.ButtonPage;

public class ButtonPageTest  extends BaseLibrary{
	
	
	ButtonPage ob;
	
	@BeforeTest
	public void launchURl() {
		launchurl();
		ob = new ButtonPage();
		
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
	public void clickonbutton() {
		ob.clickonbutton();
	}
	
	@Test(priority = 5)
	public void clickondoubleclick() {
		ob.doubleclick();
	}
	
	@Test(priority = 6)
	public void rightclick() {
		ob.rightclick();
	}
	
	@Test(priority = 7)
	public void singleclick() {
		ob.click();
	}

}
