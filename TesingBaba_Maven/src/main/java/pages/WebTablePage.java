package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class WebTablePage  extends BaseLibrary{
	
	
	public WebTablePage() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//button[text()='×']")
		private WebElement close;
		
		
		@FindBy(xpath = "//a[text()='Practice']")
		private WebElement clickonpracticeElement;
		
		@FindBy(xpath = "//button[@data-target=\"#elements\"]")
		private WebElement clickonElement;
		
		@FindBy(xpath = "//a[text()=\"web tables\"]")
		private WebElement clickonWebtable;
		
		@FindBy(xpath = "//input[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
		private WebElement clickonname;
		
		@FindBy(xpath = "//input[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"]")
		private WebElement clickonemail;
		
		@FindBy(xpath = "//button[@type=\"submit\"]")
		private WebElement clickonsubmit;
		
		@FindBy(xpath = "//iframe[@src=\"Webtable.html\"]")
		private WebElement iframElement;
		
//		@FindBy(xpath = "//button[text()=\"Edit\"]")
//		private WebElement clickonEdit;
		
		
		
		public void clickonclose() {
			close.click();
		}
		
		public void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
		}
		
		public void clickonpractice() {
			clickonpracticeElement.click();
		}
		
		public void clickonelement() {
			clickonElement.click();
		}
		
		public void webtable() {
			clickonWebtable.click();
		}
		
		public void clickonname() {
			driver.switchTo().frame(iframElement);
			
			for(int i=1; i<4; i++) {
				clickonname.sendKeys(getreadData(1, i, 0));
				clickonemail.sendKeys(getreadData(1, i, 1));
				clickonsubmit.submit();
			}
			
			
			
			driver.switchTo().defaultContent();
		}
		
		

}
