package applicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {
	
	public void doubleClick(WebElement ele);
	public void rightClick(WebElement ele);
	public void click(WebElement ele);
	public void switchtotab(int index);

}
