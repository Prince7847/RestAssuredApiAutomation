package baselibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v136.filesystem.model.File;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import applicationUtility.ApplicationUtility;
import excelUtility.getReadData;
import io.github.bonigarcia.wdm.WebDriverManager;
import propertyUtility.PropertyUtility;
import screenshotUtility.ScreenshotUtility;
import waitUtility.WaitUtility;

public class BaseLibrary implements getReadData , PropertyUtility, WaitUtility , ApplicationUtility, ScreenshotUtility{

	
	public static WebDriver driver = null;
	public void launchurl() {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testingbaba.com/old/");
        driver.manage().window().maximize();
	}
	
	
	
	@Override
	public String getreadData(int SheetNo, int row, int col) {
		String path = "/Users/princedahaliya/eclipse-workspace/TesingBaba_Maven/excel-data/Excelsheet.xlsx";
		String val = "";
		
		try {
			
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
		    XSSFSheet sheet = 	wb.getSheetAt(SheetNo);
			val = 	sheet.getRow(row).getCell(col).getStringCellValue();
			
		} catch (Exception e) {
			System.out.println("Issue in reading the data "+ e);
		}
		
		
		
		return val;
	}



	@Override
	public String getreadData(String key) {
		
		String path = "/Users/princedahaliya/eclipse-workspace/TesingBaba_Maven/excel-data/Config.properties";
		String val = "";
		
		try {
			
			FileInputStream fis = new FileInputStream(path);
			Properties pro = new Properties();
			pro.load(fis);
		    val =	pro.getProperty(key);
			
		} catch (Exception e) {
			System.out.println("Issue in get read data of property " + e);
		}
		
		return val;
	}



	@Override
	public void waitforclick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
		
	}

	@Override
	public void waitforvisibility(WebElement element, String text) {
		WebDriverWait wait = new WebDriverWait(driver,   Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
		
	}



	@Override
	public void waitforalert(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}



	@Override
	public void doubleClick(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		
	}



	@Override
	public void rightClick(WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();            
		
	}



	@Override
	public void click(WebElement ele) {
		Actions act = new Actions(driver);
//		act.click(ele);
		act.moveToElement(ele).click().build().perform();
		
	}



	@Override
	public void switchtotab(int index) {
	Set<String> set =	driver.getWindowHandles();
	ArrayList<String> list	= new ArrayList<String>(set);
	driver.switchTo().window(list.get(index));
	
	}



	@Override
	public void uploadFile(String path) {
		StringSelection sel = new StringSelection(path);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(sel, null);
		
		try {
			
			Robot rob = new Robot();
			rob.delay(250);
			
//			rob.keyPress(KeyEvent.VK_ENTER);
			
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_C);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.keyRelease(KeyEvent.VK_V);

			rob.keyRelease(KeyEvent.VK_ENTER);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	@Override
	public void getScreenshot(String folderName, String fileName) {
		
		String loc =  System.getProperty("user.dir");
		String path = loc + "//screenshot//" + folderName + "//" + fileName + ".png";
		  		

		
	}



	
	
	
}
