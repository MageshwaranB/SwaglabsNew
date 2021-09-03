package com.testcases;

import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.HomePage;

public class HomePageTest extends TestBase{
	HomePage home;
	
	public void objectCreation() {
		home=new HomePage();
	}
	
	@Test(dependsOnGroups = "LoginPage")
	public void addingItemsTest() {
		objectCreation();
		home.cartList();
	}
	@Test(dependsOnMethods = "addingItemsTest")
	public void buyingProductTest() {
		objectCreation();
		home.checkingOutFromWebsite("john", "doe", "234157");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test(dependsOnMethods = "buyingProductTest")
	public void dropDownTest()
	{
		objectCreation();
		home.dropDown();
	}
	
	@Test(dependsOnMethods = "dropDownTest")
	public void loggingoutFromWebsiteTest() {
		objectCreation();
		home.logOutOptions();
	}
}
