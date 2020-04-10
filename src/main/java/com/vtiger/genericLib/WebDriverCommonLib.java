package com.vtiger.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	public void waitForElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void alertAccept()
	{
		BaseClass.driver.switchTo().alert().accept();
	}
	public String getAlertMsg()
	{
		return BaseClass.driver.switchTo().alert().getText();
	}
	public void switchToFrame(WebElement element)
	{
		BaseClass.driver.switchTo().frame(element);
	}
	public void switchToDefaultPage()
	{
		BaseClass.driver.switchTo().defaultContent();
	}
	public void moveMousePointer(WebElement element)
	{
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(element).perform();
	}
	public void selectItemFromListByText(WebElement listbox, String itemName)
	{
		Select s = new Select(listbox);
		s.selectByVisibleText(itemName);
	}
	public void selectItemFromListByValue(WebElement listbox, String itemName)
	{
		Select s = new Select(listbox);
		s.selectByValue(itemName);
	}
	public String getSelectedItemFromList(WebElement listbox)
	{
		Select s = new Select(listbox);
		String selText = s.getFirstSelectedOption().getText();
		return selText;
	}
	
	public String getAttribValue(WebElement ele, String attr)
	{
		return ele.getAttribute(attr);
	}
}
