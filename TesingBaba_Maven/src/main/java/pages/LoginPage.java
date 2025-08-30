package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class LoginPage extends BaseLibrary{
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement clickonpracticeElement;
	
	@FindBy(xpath = "//button[@data-target=\"#elements\"]")
	private WebElement clickonElement;
	
	@FindBy(xpath = "//a[text()='text box']")
	private WebElement clickontextbox;	
	
	
	
	public void clickonclose() {
		waitforclick(close);
		
	}
	
	public void gettitle() {
	String title = driver.getTitle();
	System.out.println(title);
	}
	
	public void clickonpractice() {
		waitforclick(clickonpracticeElement);
		
	}
	
	public void clickonelement() {
		clickonElement.click();
	}

	public void clickontext() {
		clickontextbox.click();
	}
	
	
}
