package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.CheckBox;

public class CheckboxTest extends BaseLibrary{
	
	
	
	CheckBox ob;
	
	@BeforeTest
	public void launchURl() {
		launchurl();
		ob = new CheckBox();
	}
	
	@Test(priority = 1)
	public void clickonclose() {
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
	public void clickoncheckbox() {
		ob.clickoncheckbox();
	}
	
	@Test(priority = 5)
	public void clickonmobile() {
		ob.clickonmobile();
	}
	
	
	
	
	

}
