package com.vtiger.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericLib.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(linkText = "More")
	private WebElement moreDD;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaginLink;
	
	@FindBy(name = "Assets")
	private WebElement assetsLink;
	
	@FindBy(xpath = "//span[text()=' Administrator']/../following-sibling::td/img")
	private WebElement signOutMouseOver;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	public WebElement getMoreDD()
	{
		return moreDD;
	}
	public WebElement getCampaginLink()
	{
		return campaginLink;
	}
	public WebElement getSignOutMouseOver()
	{
		return signOutMouseOver;
	}
	public WebElement getSignOutLink()
	{
		return signOutLink;
	}
	
	public WebElement getAssetsLink()
	{
		return assetsLink;
	}
	
	public void signOutFromVtiger()
	{
		wlib.moveMousePointer(signOutMouseOver);
		signOutLink.click();
	}
	public void navigateToCamp()
	{
		wlib.moveMousePointer(moreDD);
		campaginLink.click();
	}
	
	public void navigateToAsset()
	{
		wlib.moveMousePointer(moreDD);
		assetsLink.click();
	}

}
