package webDriverTestCases;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import CommonClassReusables.BrowserSelection;
import CommonClassReusables.Utility;
import CommonFunctions.AGlobalComponents;
import CommonFunctions.CommonMethods;
import CommonFunctions.LoginPage;

public class Application_Sanity extends BrowserSelection {

	String testName;

	@BeforeMethod
	public void commonPage(java.lang.reflect.Method method) throws Throwable {
		unhandledException = false;
		testName = method.getName();
		AGlobalComponents.takeScreenshotIfPass = true;
		driver.navigate().refresh();
	}

	public static void isConditionX(boolean condition) {
		if (condition == false) {
			throw new SkipException("skipp");
		}
	}

	@Test(priority = 1, enabled = false)
	public void Application_Sanity_Test() throws Throwable {

		logger = report.startTest("Application_Sanity_Test", "Login and Check if the Application is Up");
		System.out.println("[INFO]--> Application_Sanity_Test - TestCase Execution Begins");

		/** Login to Application **/
		boolean loginStatus = LoginPage.loginAEHSC(AGlobalComponents.username, AGlobalComponents.password);

		if (loginStatus) {

			logger.log(LogStatus.PASS, "Login Successful----> Application is Up !!!");

			/** Validate Menu Items **/
			CommonMethods.validateMajorMenuItems();

			/** Create New Badge **/
			CommonMethods.createNewAsset("Permanent Badge", "", "Database Connector");

			/** Create New Identity **/
			String firstName = "auto" + Utility.getRandomString(4);
			String lastName = "test" + Utility.getRandomString(4);
			CommonMethods.createIdentity(firstName, lastName);

			/** Refresh Browser **/
			Utility.refreshBrowserDriver();

			/** Logout from Application **/
			LoginPage.logout();

		} else {
			logger.log(LogStatus.FAIL, "Unable to Login----> Plz Check Application");
			LoginPage.logout();

		}

	}

	@Test(priority = 1, enabled = false)
	public void Application_Sanity_Test1() throws Throwable {

		logger = report.startTest("Application_Sanity_Test", "Login and Check if the Application is Up");
		System.out.println("[INFO]--> Application_Sanity_Test - TestCase Execution Begins");

		/** Login to Application **/
		boolean loginStatus = LoginPage.loginAEHSC(AGlobalComponents.username, AGlobalComponents.password);

		if (loginStatus) {

			logger.log(LogStatus.PASS, "Login Successful----> Application is Up !!!");

			/** Validate Completed Item **/
			CommonMethods.checkCompletedItemInComletedRequests();

			/** Refresh Browser **/
			Utility.refreshBrowserDriver();

			/** Logout from Application **/
			LoginPage.logout();

		} else {
			logger.log(LogStatus.FAIL, "Unable to Login----> Plz Check Application");
			LoginPage.logout();

		}

	}

	@Test(priority = 1, enabled = true)
	public void Login_Logout_Test() throws Throwable {

		logger = report.startTest("LOGIN_LOGOUT_TEST", "Login and Check if the Application is Up");
		System.out.println("[INFO]--> LOGIN_LOGOUT_TEST - TestCase Execution Begins");

		/** Login to Application **/
		System.out.println("Before login_app:::::::::");
		boolean loginStatus = LoginPage.login_app(AGlobalComponents.username, AGlobalComponents.password);
		System.out.println("After login_app:::::::::");

		if (loginStatus) {
			System.out.println("Login Successful::::::");
			logger.log(LogStatus.PASS, "Login Successful----> Application is Up !!!");

			/** Refresh Browser **/
			Utility.refreshBrowserDriver();

			/** Navigate to Manage visit **/
			CommonMethods.searchMenuInput();

			/** Create Visit for existing visitor **/
			CommonMethods.createVisit();

			/** Logout from Application **/
			LoginPage.logout_app();

		} else {
			System.out.println("ELSE BLOCK:::::::::");
			logger.log(LogStatus.FAIL, "Unable to Login----> Please Check Application");
		}

	}

}
