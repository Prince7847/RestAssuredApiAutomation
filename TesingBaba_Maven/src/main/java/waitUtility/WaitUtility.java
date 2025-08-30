package waitUtility;

import org.openqa.selenium.WebElement;

public interface WaitUtility {
	
	public void waitforclick(WebElement element);
	public void waitforvisibility(WebElement element, String text);
	public void waitforalert(WebElement element);
	public void uploadFile(String path);

}
