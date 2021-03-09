package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods extends OpenBrowser {
	
	public static void dropdownByValue(WebElement ele,String value)
	{
		Select sel=new Select(ele);
		sel.selectByValue(value);
				
	}
	
	public static void dropdownByIndex(WebElement ele,int index)
	{
		Select sel=new Select(ele);
		sel.selectByIndex(index);
				
	}
	public static void dropdownByVisibleText(WebElement ele,String value)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(value);;
				
	}
	public static void clearField(WebElement ele)
	{
		ele.clear();
	}
	
	public static void visibilityOfElement(WebDriver driver,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
}
