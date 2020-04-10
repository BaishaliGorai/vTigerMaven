package com.vtiger.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name = "user_name")
	private WebElement un;
	
	@FindBy(name = "user_password")
	private WebElement pwd;
	
	@FindBy(id = "submitButton")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[contains(text(),'valid username and password')]")
	private WebElement errorMsg;
	

	public WebElement getUn()
	{
		return un;
	}
	public WebElement getPwd()
	{
		return pwd;
	}
	public WebElement getLoginBtn()
	{
		return loginBtn;
	}
	public WebElement getErrorMsg()
	{
		return errorMsg;
	}
	
	public void loginToVtiger(String username, String password)
	{
		un.sendKeys(username);
		pwd.sendKeys(password);
		loginBtn.click();
	}

}
