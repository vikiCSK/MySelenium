package com.activitime.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement taskTab;

	@FindBy(id = "Logout")
	private WebElement logOut;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLogOut() {
		logOut.click();
	}

	public void setTaskTab() {
		taskTab.click();
	}
}
