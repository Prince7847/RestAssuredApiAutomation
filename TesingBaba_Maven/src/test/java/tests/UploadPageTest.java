package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.UploadPage;

public class UploadPageTest extends BaseLibrary{
	
	UploadPage ob;
	
	@BeforeTest
	public void launchURl() {
		launchurl();
		ob = new UploadPage();
		
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
	public void clickonuploadbuttn() throws InterruptedException {
		ob.clickonuploadbutton();
	}
	
	@Test(priority = 5)
	public void clickonchoose()  {
		ob.clickonchoose();
	}
	
	@Test(priority = 6)
	public void uploadfile()  {
		ob.uploadfile();
	}

}
