package com.activitime.pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath = "//a[@class='content tasks']")
	private WebElement taskBtn;

	@FindBy(xpath = "//*[@class='addNewButton']")
	private WebElement addNewBtn;

	@FindBy(xpath = "//*[@class='item createNewCustomer'] ")
	private WebElement newCustomerBtn;

	@FindBy(xpath = "//input[contains(@class,'inputFieldWithPlaceholder newName')]")
	private WebElement enterCustomerBtn;

	@FindBy(xpath = "//*[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDesc;

	@FindBy(xpath = "//*[@class='emptySelection']")
	private WebElement selectCustomerDD;

	@FindBy(xpath = "//*[text()='Big Bang Company']")
	private WebElement bigBangCompany;

	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerBtn;

	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomerFld;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskBtn() {
		return taskBtn;
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getEnterCustomerBtn() {
		return enterCustomerBtn;
	}

	public WebElement getEnterCustomerDesc() {
		return enterCustomerDesc;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getBigBangCompany() {
		return bigBangCompany;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomerFld() {
		return actualCustomerFld;
	}

}
