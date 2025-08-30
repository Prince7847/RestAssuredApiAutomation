package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;

public class TextBox extends BaseLibrary{
	

	
	public TextBox() {
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
	
	@FindBy(xpath = "//input[@id=\"fullname1\"]")
	private WebElement namElement;
	
	@FindBy(xpath = "//input[@id=\"fullemail1\"]")
	private WebElement emailElement;
	
	@FindBy(xpath = "//textarea[@id=\"fulladdresh1\"]")
	private WebElement caddElement;
	
	@FindBy(xpath = "//textarea[@id=\"paddresh1\"]")
	private WebElement paddElement;
	
	@FindBy(xpath = "//input[@class='btn btn-success']")
	private WebElement submitElement;
	
	@FindBy(xpath = "//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> list;
	
	
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

	public void clickontext() {
		clickontextbox.click();
	}
	
    public void filldetails() {
    	
    		waitforvisibility(namElement,getreadData(1, 1, 0) );
    		
    		emailElement.sendKeys(getreadData(1, 1, 1));
    		caddElement.sendKeys(getreadData(1, 1, 2));
    		paddElement.sendKeys(getreadData(1, 1, 3));
    		submitElement.click();	
		
	}
    
    public void validate() {
    	
    	//SoftAssert sassert = new SoftAssert();    //	  make object an for soft assertion
    	
    	ArrayList<String> expected = new ArrayList<String>();
    	ArrayList<String> actual = new ArrayList<String>();
    	
    	
    	for(int i=0; i<4; i++) {
    		expected.add(getreadData(1, 1, i));
    	}
    	
    	for(int i=1; i<list.size(); i=i+2) {
    		actual.add(list.get(i).getText());
    	}
    	
//    	System.out.println("Actual data is ");
//    	System.out.println(actual);
//    	System.out.println("Expected data is ");
//    	System.out.println(expected);
    	
    	
    //	Now we will use assertion for validation
    	
    	for(int i=0; i<expected.size(); i++) {
    		Assert.assertEquals(expected.get(i), actual.get(i));
//    		sassert.assertEquals(expected.get(i), actual.get(i));
    	}
    	System.out.println("Assertion has successfully completed");
//    	sassert.assertAll();
    }

}
