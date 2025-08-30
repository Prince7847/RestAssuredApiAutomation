package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class ButtonPage extends BaseLibrary{
	
	public ButtonPage() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//button[text()='×']")
		private WebElement close;
		
		
		@FindBy(xpath = "//a[text()='Practice']")
		private WebElement clickonpracticeElement;
		
		@FindBy(xpath = "//button[@data-target=\"#elements\"]")
		private WebElement clickonElement;
		
		@FindBy(xpath = "//a[@href=\"#tab_5\"]")
		private WebElement clickonbutton;
		
		@FindBy(xpath = "//button[@ondblclick=\"doubletext()\"]")
		private WebElement doubleclick;
		
		@FindBy(xpath = "//button[@oncontextmenu=\"righttext()\"]")
		private WebElement rightclick;
		
		@FindBy(xpath = "//button[@onclick=\"clicktext()\"]")
		private WebElement singleclick;
		
		
		
		
		public void clickonclose() {
			close.click();
		}
		
		public void clickonpractice() {
			clickonpracticeElement.click();
		}
		
		public void clickonelement() {
			clickonElement.click();
		}
		
		public void clickonbutton() {
			clickonbutton.click();
		}
		
		public void doubleclick() {
			
			doubleClick(doubleclick);
		}
		
		public void rightclick() {
			rightClick(rightclick);
		}
		
		public void click() {
			click(singleclick);
			
		}

}
