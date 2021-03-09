package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenBrowser {
	
	public static WebDriver driver;
	
	public  static WebDriver openUrl()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://cit-ap-app-01.sg.bimamobile.internal:8080/MIPLK/pages/login.jsp");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    //To minimize the window
	    try {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_N);
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_N);
		} catch (AWTException e) {
			
			e.printStackTrace();
		}
	    
	    /*TakesScreenshot ts=(TakesScreenshot)driver;
	    File filesrc=ts.getScreenshotAs(OutputType.FILE);
	    File filedest= new File("D:\\screenshots");
	    */
	    return driver;
	    
	    
		
	}

}
