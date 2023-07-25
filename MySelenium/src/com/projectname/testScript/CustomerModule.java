package com.projectname.testScript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic1.FileLib;
import com.activitime.pom1.HomePage;
import com.activitime.pom1.TaskListPage;
import com.projectname.generic.BaseClass;

@Listeners(com.projectname.generic.ListnerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException {
		Reporter.log("createCustomer", true);
		FileLib f = new FileLib();
		String custName = f.getExcelData("createcustomer", 1, 3);
		String custDescription = f.getExcelData("createcustomer", 1, 4);
		HomePage h = new HomePage(driver);
		h.setTaskTab();
		TaskListPage t = new TaskListPage(driver);
		t.getTaskBtn();
		t.getAddNewBtn();
		t.getNewCustomerBtn();
		t.getEnterCustomerBtn().sendKeys(custName);
		t.getEnterCustomerDesc().sendKeys(custDescription);
		t.getSelectCustomerDD();
		t.getBigBangCompany();
		t.getCreateCustomerBtn();
		t.getActualCustomerFld();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();

		} catch (NoAlertPresentException e) {

		}
		wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomerFld(), custName));

		String actualText = t.getActualCustomerFld().getText();
		Assert.assertEquals(actualText, custName);

	}

}
