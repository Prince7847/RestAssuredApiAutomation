package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class LinkPage  extends BaseLibrary{
	
	
	public LinkPage() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//button[text()='×']")
		private WebElement close;
		
		
		@FindBy(xpath = "//a[text()='Practice']")
		private WebElement clickonpracticeElement;
		
		@FindBy(xpath = "//button[@data-target=\"#elements\"]")
		private WebElement clickonElement;
		
		@FindBy(xpath = "//a[@href=\"#tab_6\"]")
		private WebElement clickonlink;
		
		@FindBy(xpath = "//a[@href=\"index.html\" and @target=\"_blank\"]")
		private WebElement clickondemo;
		
		
		
		public void clickonclose() {
			close.click();
		}
		
		public void clickonpractice() {
			clickonpracticeElement.click();
		}
		
		public void clickonelement() {
			clickonElement.click();
		}
		
		public void link() {
			clickonlink.click();
		}
		
		public void democontent() {
			clickondemo.click();
		}
		
		public void clickonclosenewtab() {
			
			switchtotab(1);
			close.click();
		}
		

}
