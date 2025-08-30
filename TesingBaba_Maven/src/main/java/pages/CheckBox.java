package pages;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Factory;

import baselibrary.BaseLibrary;

public class CheckBox extends BaseLibrary {
	
	
	public CheckBox() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement clickonpracticeElement;
	
	@FindBy(xpath = "//button[@data-target=\"#elements\"]")
	private WebElement clickonElement;
	
	@FindBy(xpath = "//a[text()='check box']")
	private WebElement clickoncheckboxElement;
	
	@FindBy(xpath = "//input[@id=\'myCheck\']")
	private WebElement mobilElement;
	
	@FindBy(xpath = "//iframe[@src=\"Checkbox.html\"]")
	private WebElement iframElement;
	
	@FindBy(xpath = "//input[@id=\"mylaptop\"]")
	private WebElement clickonlaptopElement;
	
	@FindBy(xpath = "//input[@id=\"mydesktop\"]")
	private WebElement clickondesktopElement;
	
	
	@FindBy(xpath = "//h6[@id=\"text\"]")
	private WebElement clickonmobiletext;
	
	@FindBy(xpath = "//iframe[@src=\"Checkbox.html\"]")
	private WebElement listofcheckbox;
	
	
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
	
	public void clickoncheckbox() {
		clickoncheckboxElement.click();
	}
	
	public void clickonmobile() {
		
		
		driver.switchTo().frame(iframElement);		
		mobilElement.click();
		
		
//		ArrayList<String> expected = new ArrayList<String>();
//		ArrayList<String> actual = new ArrayList<String>();
//		
//		expected.add(getreadData("mobile"));
//		expected.add(getreadData("laptop"));
//		expected.add(getreadData("desktop"));
//		
//		actual.add(listofcheckbox.getText());
//		
	
		
		
		//Below:  it is verify single string value 
		String expected = getreadData("mobile");
		String actual = clickonmobiletext.getText();
		
		System.out.println("Expected data ");
		System.out.println(expected);
		System.out.println("Actual data");
		System.out.println(actual);
		
		
		Assert.assertEquals(expected, actual);
		
	
		
		clickonlaptopElement.click();
		clickondesktopElement.click();
		driver.switchTo().defaultContent();
		
		
		
	}
	
	

}
