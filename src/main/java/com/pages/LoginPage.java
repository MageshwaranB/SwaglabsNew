package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(id = "user-name")
	WebElement user;
	@FindBy(id = "password")
	WebElement pass;
	@FindBy(id = "login-button")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String validateTitle() {
		return driver.getTitle();
	}
	public void loginDetails(String uname,String pwd) {
		user.sendKeys(uname);
		pass.sendKeys(pwd);
		loginBtn.click();
	}
}
