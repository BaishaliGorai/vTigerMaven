package com.vtiger.objectRepo;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericLib.BaseClass;

public class CreateNewCampPage extends BaseClass{
	@FindBy(name = "campaignname")
	private WebElement campNameTb;
	
	@FindBy(css = "input[value='  Save  ']")
	private WebElement saveBtn;
	
	public WebElement getCampNameTb()
	{
		return campNameTb;
	}
	public WebElement getSaveBtn()
	{
		return saveBtn;
	}
	public void createCampWithManditaryField() throws IOException
	{
		campNameTb.sendKeys(data.fetchDataFromExcel("LoginPageData", 2, 2));
		saveBtn.click();
	}

}
