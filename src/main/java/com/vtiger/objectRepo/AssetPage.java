package com.vtiger.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssetPage {
	@FindBy(linkText = "Create Filter")
	private WebElement createAssetFilter;
	
	public void navigateToCreateAssetFilter()
	{
		createAssetFilter.click();
	}
			
}
