package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement addBag;
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement addLight;
	@FindBy(id = "shopping_cart_container")
	WebElement clickingShopTrolleybtn;
	@FindBy(id = "checkout")
	WebElement checkoutBtn;
	@FindBy(id = "first-name")
	WebElement fname;
	@FindBy(id = "last-name")
	WebElement lname;
	@FindBy(id = "postal-code")
	WebElement zipCode;
	@FindBy(id = "continue")
	WebElement continueBtn;
	@FindBy(id = "finish")
	WebElement finishBtn;
	@FindBy(id = "react-burger-menu-btn")
	WebElement burgerBtn;
	@FindBy(id = "about_sidebar_link")
	WebElement aboutLink;
	@FindBy(xpath = "//span[text()='Products']")
	WebElement product;
	@FindBy(id = "logout_sidebar_link")
	WebElement logoutBtn;
	@FindBy(className  = "product_sort_container")
	WebElement dropDownSource;
	@FindBy(className = "title")
	WebElement titleName;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void cartList()
	{
		addBag.click();
		addLight.click();
		clickingShopTrolleybtn.click();
	}
	public void checkingOutFromWebsite(String first,String last,String postalCode) {
		checkoutBtn.click();
		fname.sendKeys(first);
		lname.sendKeys(last);
		zipCode.sendKeys(postalCode);
		continueBtn.click();	
		finishBtn.click();
		navigateToMainHomePage();
	}
	public void dropDown() {
		dropDownSource.click();
		Select select=new Select(dropDownSource);
		List<WebElement> allOptions = select.getOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			select.selectByIndex(i);
		}
	}
	public void navigateToMainHomePage() {
		driver.navigate().to("https://www.saucedemo.com/inventory.html");
	}
	public void logOutOptions() {
		burgerBtn.click();
		logoutBtn.click();
	}
}
