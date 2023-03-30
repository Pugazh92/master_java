package CommonFunctions;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import CommonClassReusables.BrowserSelection;
import CommonClassReusables.ByAttribute;
import CommonClassReusables.Utility;
import CommonClassReusables.dynamicwait;
import ObjectRepository.LoginObjects;

public class LoginPage extends BrowserSelection
{
	
	
	/**
	* <h1>login</h1>
	* This is Method to Login to Application
	* @author  	Jiten Khanna
	* @modified 
	* @version 	1.0z
	* @since   	04-06-2020
	* @param   	String userName, String passWord
	* @return  	boolean
	 * @throws Throwable 
	**/
	
	public static boolean loginAEHSC(String userName, String passWord) throws Throwable
	{
		boolean flag = false;
		if (unhandledException == false) {
			System.out.println("*************************** Login as : "+userName+" *********************************");
			logger.log(LogStatus.INFO, "*************************** Login as : "+userName+" *********************************");
		
			logger.log(LogStatus.INFO, "Browser : "+AGlobalComponents.browserName);
			driver.get(AGlobalComponents.applicationURL);
			System.out.println("Successfully: open url-"+AGlobalComponents.applicationURL);
			dynamicwait.WAitUntilPageLoad();
						
			boolean flg=false;
			for(int i=0;i<5;i++)
			{
				if(driver.findElements(By.xpath(LoginObjects.loginUserName)).size()>0){
					flg=true;
					System.out.println("Login Page has Opened");
					logger.log(LogStatus.PASS, "Login Page has Opened");
					break;
				}else{
					Utility.pause(10);
				}
			}
			
			if(flg)
			{
				driver.findElement(By.xpath(LoginObjects.loginUserName)).sendKeys(userName);
				System.out.println("Enter Username");
				driver.findElement(By.xpath(LoginObjects.pswdTxt)).sendKeys(passWord);
				System.out.println("Enter Password");
				driver.findElement(By.xpath(LoginObjects.loginButtonLnk)).click();
				System.out.println("Click Sign-in Button");
				Utility.pause(15);
				dynamicwait.WAitUntilPageLoad();
				driver.navigate().refresh();
				dynamicwait.WAitUntilPageLoad();
				try{
					
					for(int j=0;j<5 && (!flag);j++){
						if(driver.findElements(By.xpath(LoginObjects.loginButtonLnk)).size()>0)
						{
							System.out.println("Re-Login Required");
							driver.navigate().refresh();
							driver.findElement(By.xpath(LoginObjects.loginUserName)).sendKeys(userName);
							System.out.println("Enter Username");
							driver.findElement(By.xpath(LoginObjects.pswdTxt)).sendKeys(passWord);
							System.out.println("Enter Password");
							driver.findElement(By.xpath(LoginObjects.loginButtonLnk)).click();
							System.out.println("Click Sign-in Button");
							Utility.pause(15);
						}
						else{
							logger.log(LogStatus.PASS, "Login Successful");
							flag=true;
						}
					}
					if(!flag){
						logger.log(LogStatus.FAIL, "Unable to login to the application");
					}
					Thread.sleep(5000);
					//Utility.handleHomeDashboardPopup();
				}
				catch(Exception e){
					System.out.println("login successful");
				}
			}else{
				System.out.println("Login Page is NOT Available");
				Utility.takeScreenshot("LoginError"+Utility.UniqueNumber(5));
				logger.log(LogStatus.FAIL, "Failed: Login Page is NOT Available" + imgeHtmlPath);
			}
		}
		return flag;
	}
	
	/**
	* <h1>logout</h1>
	* This is Method to Logout from Application
	* @author  	Jiten Khanna
	* @modified 
	* @version 	1.0
	* @since   	04-06-2020
	* @param   	none
	* @return  	boolean
	**/
	public static boolean logout() throws Throwable
	{
		
		System.out.println("*************************** Logout *********************************");
		logger.log(LogStatus.INFO, "*************************** Logout *********************************");
		
		driver.findElement(By.xpath(".//span[@class='x-btn-wrap x-btn-wrap-aetextlink-medium x-btn-arrow x-btn-arrow-right' and @role='presentation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//span[contains(text(),'Logout')]")).click();
		Thread.sleep(3000);
		logger.log(LogStatus.INFO, "Logout from Appplication");
		Utility.verifyElementPresent(".//div[contains(text(),'You have been successfully logged out.')]", "Login Page",  false);
		
		return true;
	}

	public static boolean login_app(String username, String password) throws Throwable
	{
		System.out.println("Entered login_app:::::::::");
		boolean loginstatus = false;
		if (unhandledException == false) {
			System.out.println("Entered code block:::::::::");
			System.out.println("*************************** login_app *********************************");
			logger.log(LogStatus.INFO, "*************************** login_app *********************************");
			
			logger.log(LogStatus.INFO, "Browser : "+AGlobalComponents.browserName);
			driver.get(AGlobalComponents.applicationURL);
			System.out.println("Successfully: open url-"+AGlobalComponents.applicationURL);
			dynamicwait.WAitUntilPageLoad();
			

			for(int i=0;i<5;i++)
			{
				if(driver.findElements(By.xpath(LoginObjects.UserNameTextBox)).size()>0){
					loginstatus=true;
					System.out.println("Login Page has Opened");
					logger.log(LogStatus.PASS, "Login Page has Opened");
					break;
				}else{
					Utility.pause(10);
				}
			}
			
if (loginstatus) {
			try {
				if(driver.findElements(By.xpath(LoginObjects.UserNameTextBox)).size()>0) {
					ByAttribute.setText("xpath", LoginObjects.UserNameTextBox, username, "Enter Username");
					//driver.findElement(By.xpath(LoginObjects.UserNameTextBox)).sendKeys(username);
					System.out.println("UserName is filled");
					loginstatus=true;
				}
				else {
					System.out.println("Username text box not found");
					logger.log(LogStatus.INFO, "UserName text box not found");
					loginstatus=false;
				}
				if(driver.findElements(By.xpath(LoginObjects.passwordTextBox)).size()>0) {
					ByAttribute.setText("xpath", LoginObjects.passwordTextBox, password,"Enter Password" );
					//driver.findElement(By.xpath(LoginObjects.passwordTextBox)).sendKeys(password);
					System.out.println("Password is filled");
					loginstatus=true;
				}
				else {
					System.out.println("Password text box not found");
					logger.log(LogStatus.INFO, "Password text box not found");
					loginstatus=false;
				}
				if(driver.findElements(By.xpath(LoginObjects.LoginBtn)).size()>0) {
					ByAttribute.click("xpath", LoginObjects.LoginBtn, "Clicked on login button");
					//driver.findElement(By.xpath(LoginObjects.LoginBtn)).click();
					System.out.println("Clicked on login button");
					loginstatus=true;
				}
				else {
					System.out.println("Login button box not found");
					logger.log(LogStatus.INFO, "Login Button not found");
					loginstatus=false;
				}
				Utility.pause(15);
			}
			catch(Exception e) {
				System.out.println("Exception - logout unsuccessful");
		}
	}
}
		System.out.println("Exited login_app::::::::: returned value = "+ loginstatus);

	return loginstatus;
}

	public static void logout_app() throws Throwable
	{
		System.out.println("*************************** logout_app *********************************");
		logger.log(LogStatus.INFO, "*************************** logout_app *********************************");
		Thread.sleep(2000);
		if(unhandledException == false) {
			try {
				if(driver.findElements(By.xpath(LoginObjects.UserOptionsBtn)).size()>0) {
					driver.findElement(By.xpath(LoginObjects.UserOptionsBtn)).click();
					System.out.println("Option button clicked:::::");
				}
				else
				{
					System.out.println("Option button not found:::::");
				}
				Utility.pause(2);
				if(driver.findElements(By.xpath(LoginObjects.UserOptionsLogoutBtn)).size()>0) {
					driver.findElement(By.xpath(LoginObjects.UserOptionsLogoutBtn)).click();
					System.out.println("Logout button clicked:::::");
				}
				else
				{
					System.out.println("Logout button not found:::::");
				}
				Utility.pause(3);
				Utility.verifyElementPresent(".//div[contains(text(),'You have been successfully logged out.')]", "Login Page",  false);
				logger.log(LogStatus.PASS,"Logot is successful");
			}
			catch(Exception e) {
				System.out.println("Exception - logout unsuccessful");
			}
		}
	}
	

}
