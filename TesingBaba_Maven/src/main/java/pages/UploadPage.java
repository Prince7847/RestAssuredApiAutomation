package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class UploadPage extends BaseLibrary {
	
	String path = "/Users/princedahaliya/eclipse-workspace/TesingBaba_Maven/excel-data/Prince_CV_Automation.docx";
	
	public UploadPage() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//button[text()='×']")
		private WebElement close;
		
		
		@FindBy(xpath = "//a[text()='Practice']")
		private WebElement clickonpracticeElement;
		
		@FindBy(xpath = "//button[@data-target=\"#elements\"]")
		private WebElement clickonElement;
		
		@FindBy(xpath = "//a[@href=\"#tab_8\"]")
		private WebElement clickonuploadbutton;
		
		@FindBy(xpath = "//input[@id=\"File1\"]")
		private WebElement clickonchoosefile;
		
		
		
		
		public void clickonclose() {
			close.click();
		}
		
		public void clickonpractice() {
			clickonpracticeElement.click();
		}
		
		public void clickonelement() {
			clickonElement.click();
		}
		
		public void clickonuploadbutton() throws InterruptedException {
			Thread.sleep(2000);
			clickonuploadbutton.click();
		}

		public void clickonchoose()   {
			click(clickonchoosefile);
		}
		
		public void uploadfile() {
			uploadFile(path);
		}
}
