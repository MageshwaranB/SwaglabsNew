package com.testcases;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage login;
	
	@Test(groups = {"LoginPage"})
	public void loginActivityTest() {
		login=new LoginPage();
		login.loginDetails("standard_user", "secret_sauce");
	}
}
