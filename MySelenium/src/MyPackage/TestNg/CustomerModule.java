package MyPackage.TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test(priority = 1, invocationCount = 2)
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test(priority = 2, invocationCount = 2)
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	@Test(priority = 3,invocationCount =2 )
	public void alterCustomer() {
		Reporter.log("alterCustomer",true);
	}
	@Test(priority = 4, invocationCount = 2)
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
