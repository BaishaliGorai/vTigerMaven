package com.vtiger.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepo.CampInfoPage;
import com.vtiger.objectRepo.CampaignPage;
import com.vtiger.objectRepo.CreateNewCampPage;
import com.vtiger.objectRepo.HomePage;

@Listeners(com.vtiger.genericLib.ListnerImplementaion.class)
public class CreateCampTest extends BaseClass{

	@Test
	public void createCamp() throws IOException
	{
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		CampaignPage cp = PageFactory.initElements
									(driver, CampaignPage.class);
		CreateNewCampPage cncp = PageFactory.initElements
									(driver, CreateNewCampPage.class);
		CampInfoPage cip = PageFactory.initElements
									(driver, CampInfoPage.class);
		
		hp.navigateToCamp();
		cp.navigateCreateNewCampPage();
		cncp.createCampWithManditaryField();
		String actMsg = cip.getSuccessMsg().getText();
		String expMsg = data.fetchDataFromExcel("LoginPageData", 2, 3);
		Assert.assertTrue(actMsg.contains(expMsg));
		System.out.println("Campaign Created Successfully");
	}
}









