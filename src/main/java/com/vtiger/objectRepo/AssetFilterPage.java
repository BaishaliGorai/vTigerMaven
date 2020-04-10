package com.vtiger.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssetFilterPage {
	@FindBy(id = "stdDateFilter")
	private WebElement selectDuration;
	
	@FindBy(id = "jscal_trigger_date_start")
	private WebElement startDateCal;
	
	@FindBy(id = "jscal_trigger_date_end")
	private WebElement endDateCal;
	
	@FindBy(id = "jscal_field_date_start")
	private WebElement startDate;
	
	@FindBy(id = "jscal_field_date_end")
	private WebElement endDate;
	
	public WebElement getSelectDuration()
	{
		return selectDuration;
	}
	
	public WebElement getStartDateCal()
	{
		return startDateCal;
	}
	
	public WebElement getEndDateCal()
	{
		return endDateCal;
	}
	
	public WebElement getStartDate()
	{
		return startDate;
	}
	
	public WebElement getEndDate()
	{
		return endDate;
	}
}
