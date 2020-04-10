package com.vtiger.testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepo.AssetFilterPage;
import com.vtiger.objectRepo.AssetPage;
import com.vtiger.objectRepo.HomePage;


public class AssetFilterModTC13 extends BaseClass{

	@Test
	public void customDuration() throws IOException
	{		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		AssetPage ap = PageFactory.initElements(driver, AssetPage.class);
		AssetFilterPage afp = PageFactory.initElements(driver, AssetFilterPage.class);
		
		hp.navigateToAsset();
		ap.navigateToCreateAssetFilter();		
		
		WebElement dateFilter = afp.getSelectDuration();
		String expSelDateFilter = data.fetchDataFromExcel("CampaignPageData", 2, 2);
		
		wlib.selectItemFromListByText(dateFilter, expSelDateFilter);
		String actSelDateFilter = wlib.getSelectedItemFromList(dateFilter);
		
		System.out.println(expSelDateFilter);
		System.out.println(actSelDateFilter);
		
		Assert.assertEquals(actSelDateFilter, expSelDateFilter);
		System.out.println("Previous financial year selected");
		
		String startDateValue = afp.getStartDate().getText();
		
		String endDateValue = afp.getEndDate().getText();
	}
}
