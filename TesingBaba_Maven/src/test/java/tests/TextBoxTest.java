package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.TextBox;

public class TextBoxTest  extends BaseLibrary{
	
	TextBox ob;
	
	@BeforeTest
	public void launchURl() {
		launchurl();
		ob = new TextBox();
		
	}
	
	@Test(priority = 1)
	public void clickonclose() {
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
	
	@Test(priority = 6)
	public void filldetails() {
		ob.filldetails();
	}
	
	@Test(priority = 7)
	public void validation() {
		ob.validate();
	}
	
	
	
	
	
	}
	
	
