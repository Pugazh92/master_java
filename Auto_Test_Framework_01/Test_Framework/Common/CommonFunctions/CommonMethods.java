package CommonFunctions;

import static org.testng.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import CommonClassReusables.BrowserSelection;
import CommonClassReusables.ByAttribute;
import CommonClassReusables.Utility;
import ObjectRepository.AssetObjects;
import ObjectRepository.HomeObjects;
import ObjectRepository.IdentityObjects;
import ObjectRepository.VisitObjects;
import jdk.jfr.internal.Logger;

public class CommonMethods extends BrowserSelection {

//	Action action = new Action(driver);
	public static String ManageVisit = "Visit";
	public static String ManageVisitor = "Visitor";
	public static String VisitorDashboard = "visitor dashboard";
	public static String VisitorValue = "p.ravi@alertenterprise.com";
	public static String VisitLocation = "a";
	public static String ExpTitleVisit = "AlertE: Visit";

	public static Actions act = new Actions(driver);

	private static int assetCodeIndex = 0;
	private static int index = 0;

	/**
	 * <h1>validateMajorMenuItems</h1> This is Method to Validate Major Menu Items
	 * 
	 * @author Jiten Khanna
	 * @modified
	 * @version 1.0
	 * @since 2-1-2022
	 * @param none
	 * @return none
	 * @throws Throwable
	 **/

	public static void searchMenuInput() throws Throwable {

		if (unhandledException == false) {
			System.out
					.println("******************************** Menu search  *****************************************");
			logger.log(LogStatus.INFO, "***************************** Menu search *********************************");

			try {

				/** Search menu from input **/
				driver.findElement(By.xpath(HomeObjects.HomeSearchMenuBtn1)).click();
				driver.findElement(By.xpath(HomeObjects.HomeSearchMenuTxt)).sendKeys(ManageVisit);

				act.sendKeys(Keys.ENTER);
				act.build().perform();
				logger.log(LogStatus.PASS, "Before visit page");
				Thread.sleep(1500);

				/** VALIDATE Visit page **/
				String currTitle = driver.getTitle();
				System.out.println("Title:********* " + currTitle);
				Thread.sleep(1000);
				
//				logger.log(LogStatus.PASS, "V page");

				if (currTitle.equalsIgnoreCase(ExpTitleVisit)) {
					logger.log(LogStatus.PASS, "Visit Page **********");

				} else {
					logger.log(LogStatus.FAIL, "Not a Visit Page **********");
				}

			}

			catch (Exception e) {
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				Utility.recoveryScenario(nameofCurrMethod, e);

			}
		}
	}

	public static void createVisit() throws Throwable {

		if (unhandledException == false) {
			System.out
					.println("******************************** Create Visit*****************************************");
			logger.log(LogStatus.INFO,
					"***************************** Create Visit for existing Visitor*********************************");

			try {
				driver.findElement(By.xpath(VisitObjects.VisitCreateBtn)).click();
				driver.findElement(By.xpath(VisitObjects.VisitLocationDrp)).click();

				driver.findElement(By.xpath(VisitObjects.VisitLocationDrp)).sendKeys(VisitLocation);
				Thread.sleep(3000);
				act.sendKeys(Keys.ENTER);
				act.build().perform();
				logger.log(LogStatus.PASS,
						"Successfully selected location");
				Thread.sleep(2000);
				driver.findElement(By.xpath(VisitObjects.VisitSearchVisitor)).clear();
				driver.findElement(By.xpath(VisitObjects.VisitSearchVisitor)).sendKeys(VisitorValue);
				Thread.sleep(3500);
				act.sendKeys(Keys.ENTER);
				act.build().perform();
				Thread.sleep(4000);

//				WebDriverWait wait = new WebDriverWait(driver, 3);
//				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(VisitObjects.SetVisitDetailsBtn))));

				driver.findElement(By.xpath(VisitObjects.SetVisitDetailsBtn)).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(VisitObjects.DisclCheckBox)).click();
				driver.findElement(By.xpath(VisitObjects.VisitSaveBtn)).click();

				String currTitle2 = driver.getTitle();
				System.out.println("Title2:********* " + currTitle2);
				Thread.sleep(1000);

				if (currTitle2.equalsIgnoreCase(ExpTitleVisit)) {
					logger.log(LogStatus.PASS, "Visit created successfully **********");

				} else {
					logger.log(LogStatus.FAIL, "Failed to create a new visit **********");
				}

//				List<WebElement> locVal = driver.findElements(By.xpath(VisitObjects.VisitLocationDrp));
//				for(WebElement setLocVal : locVal)
//				{
//					System.out.println("Values from Location Dropdown: " +setLocVal.getText());
//
//				}
//				

			} catch (Exception e) {
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				Utility.recoveryScenario(nameofCurrMethod, e);
			}
		}
	}

	public static void validateMajorMenuItems() throws Throwable {

		if (unhandledException == false) {
			System.out.println(
					"******************************** validateMajorMenuItems  *****************************************");
			logger.log(LogStatus.INFO,
					"***************************** validateMajorMenuItems *********************************");

			try {

				/** FIND BUILD VERSION **/
				driver.findElement(By.xpath(HomeObjects.homeLoggedInUserBtn)).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(HomeObjects.homeUserProfileAboutBtn)).click();
				Thread.sleep(2000);
				String versionText = ByAttribute.getText("xpath", HomeObjects.homeBuildVersionLbl, "Get Build Version");
				String[] versionTxt = versionText.split(" ");
				String buildVersion = versionTxt[1].trim();
				Utility.reportLogStatus("INFO",
						"#################### BUILD VERSION : " + buildVersion + " ####################");
				driver.findElement(By.xpath(HomeObjects.homeCloseAboutDialogBtn)).click();
				Thread.sleep(1000);

				/** VALIDATE INBOX **/
				Utility.reportLogStatus("INFO", "$$$$$ VALIDATE INBOX $$$$$");
				if (driver.findElements(By.xpath(HomeObjects.inboxTabBtn)).size() > 0) {
					ByAttribute.click("xpath", HomeObjects.inboxTabBtn, "Click Inbox Link");
					Utility.pause(5);
					Utility.verifyElementPresent(HomeObjects.homeInboxOpenBtn, "Open Inbox Button", false);
					Thread.sleep(1000);
					Utility.verifyElementPresent(HomeObjects.homeInboxCompletedBtn, "Completed Inbox Button", false);
				} else {
					ByAttribute.mouseHover("xpath", HomeObjects.homeTabBtn, "Mouse Hover on Home Tab Link");
					Thread.sleep(1000);
					ByAttribute.click("xpath", HomeObjects.homeInboxLnk, "Click Inbox Link");
					Utility.pause(10);
					Utility.verifyElementPresent(HomeObjects.homeInboxOpenBtn, "Open Inbox Button", false);
					Thread.sleep(1000);
					Utility.verifyElementPresent(HomeObjects.homeInboxCompletedBtn, "Completed Inbox Button", false);
				}

				/** VALIDATE DASHBOARD **/
				Utility.reportLogStatus("INFO", "$$$$$ VALIDATE DASHBOARD $$$$$");
				if (driver.findElements(By.xpath(HomeObjects.dashboardTabBtn)).size() > 0) {
					ByAttribute.click("xpath", HomeObjects.dashboardTabBtn, "Click on Dashboard Link");
					Utility.pause(5);
					Utility.verifyElementPresent(HomeObjects.homeMyDashboardLbl, "My Dashboard Page Header", false);
				} else {
					ByAttribute.mouseHover("xpath", HomeObjects.homeTabBtn, "Mouse Hover on Home Tab Link");
					Thread.sleep(1000);
					if (Utility.verifyElementPresentReturn(HomeObjects.homeDashboardLnk, "Dashboard Link", true,
							false)) {
						ByAttribute.click("xpath", HomeObjects.homeDashboardLnk, "Click Dashboard Link");
					} else {
						ByAttribute.click("xpath", HomeObjects.homeMyDashboardBtn, "Click Dashboard Link");
					}
					Utility.pause(10);
					Utility.verifyElementPresent(HomeObjects.homeMyDashboardLbl, "My Dashboard Page Header", false);
				}

				/** VALIDATE ACCESS REQUESTS AND AEAM-5760 **/
				Utility.reportLogStatus("INFO", "$$$$$ VALIDATE ACCESS REQUESTS AND AEAM-5760 $$$$$");
				if (driver.findElements(By.xpath(HomeObjects.myRequestsTabBtn)).size() > 0) {
					ByAttribute.click("xpath", HomeObjects.myRequestsTabBtn, "Click on Access Request Link");
					Utility.pause(5);
				} else {
					ByAttribute.mouseHover("xpath", HomeObjects.homeTabBtn, "Mouse Hover on Home Tab Link");
					Thread.sleep(1000);
					ByAttribute.click("xpath", HomeObjects.homeAccessRequestLnk, "Click on Access Request Link");
					Utility.pause(5);
				}

				if (driver.findElements(By.xpath(HomeObjects.homeAccessRequestCreateBtn)).size() > 0) {
					System.out.println("Access Request Page Loaded Successfully");
					logger.log(LogStatus.PASS, "Access Request Page Loaded Successfully");

					ByAttribute.click("xpath", HomeObjects.homeAccessRequestCreateBtn, "Click Create Button");
					Thread.sleep(1000);
					Utility.verifyElementPresent(HomeObjects.homeCreateAccessRequestPageLbl,
							"Create Access Request Page", false);
					if (AGlobalComponents.applicationURL.contains("autouathsc")) {
						ByAttribute.click("xpath", HomeObjects.homeAccessRequestNewBadgeRdb,
								"Click New Badge Radio Button");
						Thread.sleep(2000);

						ByAttribute.click("xpath", HomeObjects.homeAccessRequestOthersRdb,
								"Click on Others Radio Button");
						Thread.sleep(2000);

						ByAttribute.clearSetText("xpath", HomeObjects.selfServiceSearchUserTxt, "autoq4m7",
								"Enter Other User");
						Thread.sleep(1000);
						ByAttribute.click("xpath",
								".//span[contains(text(),'autoq4m7')]|.//td[contains(text(),'autoq4m7')]",
								"Select User autoq4m7 from List");
						Thread.sleep(1000);
						if (Utility.verifyElementPresent(
								".//div[@class='x-tagfield-item-text' and contains(text(),'autoq4m7')]",
								"Searched User Selected from List", false)) {
							Utility.reportLogStatus("PASS", "Able to search user while raising any request for Others");
						} else {
							Utility.reportLogStatus("FAIL",
									"Unable to search user while raising any request for Others");
						}
					}
				}

				/** VALIDATE PROVISIONING MONITOR **/
				Utility.reportLogStatus("INFO", "$$$$$ VALIDATE PROVISIONING MONITOR $$$$$");
				ByAttribute.mouseHover("xpath", HomeObjects.adminTabBtn, "Mouse Hover on Admin Tab Link");
				Thread.sleep(1000);
				ByAttribute.click("xpath", HomeObjects.adminProvMonitorLnk, "Click on Provisioning Monitor Link");
				Utility.pause(10);
				Thread.sleep(10000);
				Utility.verifyElementPresent(HomeObjects.adminProvMonitorPageLbl, "Provisioning Monitor Page Header",
						false);

				if (AGlobalComponents.applicationURL.contains("autouathsc")) {
					/** VALIDATE CONNECTOR LIBRARY **/
					Utility.reportLogStatus("INFO", "$$$$$ VALIDATE CONNECTOR LIBRARY (CCURE 9000 and Lenel) $$$$$");
					ByAttribute.mouseHover("xpath", HomeObjects.adminTabBtn, "Mouse Hover on Admin Tab Link");
					Thread.sleep(1000);
					ByAttribute.click("xpath", HomeObjects.adminConnectorLibraryLnk, "Click on Connector Library Link");
					Utility.pause(10);
					Utility.verifyElementPresent(HomeObjects.adminConnectorLibraryPageLbl,
							"Connector Library Page Header", false);
					Thread.sleep(1000);
					ByAttribute.clearSetText("xpath", HomeObjects.adminConnectorLibrarySearchFieldTxt, "CCURE 9000",
							"Enter Connector as CCURE 9000");
					Thread.sleep(1000);
					ByAttribute.click("xpath", HomeObjects.homeConnLibCCUREOptionLnk,
							"Select CCURE 9000 Option from List");
					Thread.sleep(1000);
					ByAttribute.click("xpath", HomeObjects.homeCCURETestConnLnk,
							"Click Test Connection for CCURE 9000");
					Thread.sleep(15000);
					if (driver.findElements(By.xpath(HomeObjects.homeTestConnectionFailedErrorLbl)).size() > 0) {
						Utility.verifyElementPresent(HomeObjects.homeTestConnectionFailedErrorLbl,
								"Test Connection Failed Error Message", false);
						Utility.reportLogStatus("FAIL", "Test Connection Failed for CCURE 9000");
						Thread.sleep(1000);
					} else {
						Utility.reportLogStatus("PASS", "Test Connection PASS for CCURE 9000");
						Thread.sleep(1000);
					}
					ByAttribute.clearSetText("xpath", HomeObjects.adminConnectorLibrarySearchFieldTxt, "Lenel",
							"Enter Connector as Lenel");
					Thread.sleep(1000);
					ByAttribute.click("xpath", ".//li[@role='option' and text()='Lenel']",
							"Select Lenel Option from List");
					Thread.sleep(1000);
					ByAttribute.click("xpath",
							".//div[contains(@class,'x-grid-cell-inner') and text()='Lenel']//ancestor::tr[@role='row']//div[@role='button' and @data-qtip='Test Connection']",
							"Click Test Connection for Lenel");
					Thread.sleep(15000);
					if (driver
							.findElements(By.xpath(
									".//div[@class='x-autocontainer-innerCt' and text()='Test Connection Failed']"))
							.size() > 0) {
						Utility.verifyElementPresent(
								".//div[@class='x-autocontainer-innerCt' and text()='Test Connection Failed']",
								"Test Connection Failed Error Message", false);
						Utility.reportLogStatus("FAIL", "Test Connection Failed for Lenel");
						Thread.sleep(1000);
					} else {
						Utility.reportLogStatus("PASS", "Test Connection PASS for Lenel");
						Thread.sleep(1000);
					}
				}

				/** VALIDATE RECON MONITOR **/
				Utility.reportLogStatus("INFO", "$$$$$ VALIDATE RECON MONITOR $$$$$");
				ByAttribute.mouseHover("xpath", HomeObjects.reconTabBtn, "Mouse Hover on Recon Tab Link");
				Thread.sleep(1000);
				ByAttribute.click("xpath", HomeObjects.reconReconMonitorLnk, "Click on Recon Monitor Link");
				Utility.pause(10);
				Utility.verifyElementPresent(HomeObjects.reconReconMonitorPageLbl, "Recon Monitor Page Header", false);

				/** VALIDATE RECON SETUP **/
				Utility.reportLogStatus("INFO", "$$$$$ VALIDATE RECON SETUP $$$$$");
				ByAttribute.mouseHover("xpath", HomeObjects.reconTabBtn, "Mouse Hover on Recon Tab Link");
				Thread.sleep(1000);
				ByAttribute.click("xpath", HomeObjects.reconReconSetupLnk, "Click on Recon Setup Link");
				Utility.pause(10);
				Utility.verifyElementPresent(HomeObjects.reconReconSetupPageLbl, "Recon Setup Page Header", false);

			} catch (Exception e) {
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				Utility.recoveryScenario(nameofCurrMethod, e);
			}
		}
	}

	/**
	 * <h1>createNewAsset</h1> This is Method to Create a New Asset
	 * 
	 * @author Jiten Khanna
	 * @modified
	 * @version 1.0
	 * @since 02-09-2021
	 * @param String requestStatus
	 * @return none
	 **/

	public static String createNewAsset(String badgeType, String badgeSubType, String system) throws Throwable {

		String badgeName = "";
		String badgeId = "";
		if (unhandledException == false) {
			System.out.println("***************************** createNewAsset *********************************");
			logger.log(LogStatus.INFO,
					"***************************** createNewAsset *********************************");
			try {

				if (driver.findElements(By.xpath(AssetObjects.assetTabBtn)).size() > 0) {
					ByAttribute.mouseHover("xpath", AssetObjects.assetTabBtn, "Mouse Hover on Asset Tab Link");
					Thread.sleep(1000);
					ByAttribute.click("xpath", AssetObjects.assetManageAssetLnk, "Click on Manage Asset Link");
					Utility.pause(5);
				} else {
					ByAttribute.mouseHover("xpath", IdentityObjects.cardHoldersAndAssetsTabBtn,
							"Mouse Hover on Card Holders & Assets Tab Link");
					Thread.sleep(1000);
					ByAttribute.click("xpath", AssetObjects.manageAssetsLnk, "Click on Manage Asset Link");
					Utility.pause(5);
				}

				if (driver.findElements(By.xpath(HomeObjects.homeManageAssetsPageHeaderLbl)).size() > 0) {
					System.out.println("Manage Assets Page Loaded Successfully");
					logger.log(LogStatus.PASS, "Manage Assets Page Loaded Successfully");

					ByAttribute.click("xpath", AssetObjects.assetCreateAssetBtn, "Click Create Button");
					Thread.sleep(1000);
					ByAttribute.clearSetText("xpath", AssetObjects.assetTypeTxt, badgeType,
							"Enter Badge Type: " + badgeType);
					Thread.sleep(500);
					ByAttribute.click("xpath", ".//li[@role='option' and text()='" + badgeType + "']",
							"Select " + badgeType + " Option from List");
					Thread.sleep(1000);
					if (badgeSubType.equals("")) {

					} else {
						ByAttribute.clearSetText("xpath", AssetObjects.assetSubTypeTxt, badgeSubType,
								"Enter Bdge Sub Type: " + badgeSubType);
						Thread.sleep(500);
						ByAttribute.click("xpath", ".//li[@role='option' and text()='" + badgeSubType + "']",
								"Select " + badgeSubType + " Option from List");
					}

					badgeName = "AUTO-" + Utility.getRandomNumber(5);
					ByAttribute.clearSetText("xpath", AssetObjects.assetSerialNumberTxt, badgeName,
							"Enter Serial Number");
					Thread.sleep(1000);

					switch (system) {

					case "AMAG":
						badgeId = "9" + Utility.getRandomNumber(11);
						break;

					case "CCURE 9000":
						badgeId = "8" + Utility.getRandomNumber(5);
						break;

					case "Lenel":
						badgeId = "7" + Utility.getRandomNumber(5);
						break;

					case "Database Connector":
						badgeId = "6" + Utility.getRandomNumber(5);
						break;

					default:
						badgeId = "";

					}

					AGlobalComponents.badgeId = badgeId;
					ByAttribute.clearSetText("xpath", AssetObjects.assetBadgeIdTxt, badgeId,
							"Enter Badge ID: " + badgeId);
					Thread.sleep(1000);

					ByAttribute.clearSetText("xpath", AssetObjects.assetBadgeNameTxt, badgeName,
							"Enter Badge Name: " + badgeName);
					Thread.sleep(1000);

					ByAttribute.clearSetText("xpath", AssetObjects.assetSystemTxt, system, "Enter System");
					Thread.sleep(1000);
					ByAttribute.click("xpath", ".//li[@role='option' and contains(text(),'" + system + "')]",
							"Select " + system + " Option from List");
					Thread.sleep(1000);

					ByAttribute.clearSetText("xpath", AssetObjects.assetSourceIdTxt, badgeId, "Enter Source Id");
					Thread.sleep(1000);

					ByAttribute.click("xpath", AssetObjects.assetSaveBtn, "Click Save Button");
					Thread.sleep(3000);

					if (driver.findElements(By.xpath(AssetObjects.assetTabBtn)).size() > 0) {
						ByAttribute.mouseHover("xpath", AssetObjects.assetTabBtn, "Mouse Hover on Asset Tab Link");
						Thread.sleep(1000);
						ByAttribute.click("xpath", AssetObjects.assetManageAssetLnk, "Click on Manage Asset Link");
						Utility.pause(5);
					} else {
						ByAttribute.mouseHover("xpath", IdentityObjects.cardHoldersAndAssetsTabBtn,
								"Mouse Hover on Card Holders & Assets Tab Link");
						Thread.sleep(1000);
						ByAttribute.click("xpath", AssetObjects.manageAssetsLnk, "Click on Manage Asset Link");
						Utility.pause(5);
					}

					Utility.verifyElementPresent(".//tbody//div[text()='" + badgeName + "']", "Newly Created Badge",
							false);
					getIndexOfManageAssetsHeaders();
					WebElement asstCode = driver.findElement(By.xpath(
							"(//div[@class='x-grid-item-container' and contains(@style,'transform: translate')]//tr[1]/td["
									+ assetCodeIndex + "]/div)[1]"));
					AGlobalComponents.assetCode = asstCode.getText();
				} else {
					System.out.println("Navigation to 'Manage Asset' Page Failed");
					logger.log(LogStatus.FAIL, "Navigation to 'Manage Asset' Page Failed");
				}

			} catch (Exception e) {
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				Utility.recoveryScenario(nameofCurrMethod, e);
			}
		}

		return badgeName;

	}

	public static void getIndexOfManageAssetsHeaders() throws Throwable {
		try {
			List<WebElement> headers = driver.findElements(By.xpath(".//div[@class='x-column-header-text']//span"));
			int size = headers.size(), j = 1;
			boolean flag = true;

			for (int i = 1; i < size && flag; i++) {
				WebElement header = headers.get(i);
				String heading = header.getText();
				System.out.println("heading " + (i) + " " + heading);

				switch (heading.toLowerCase()) {
				case "asset code":
					assetCodeIndex = j + 1;
					j++;
					flag = false;
					break;
				case "":
					break;
				default:
					System.out.println("Need to skip this header : " + heading);
					j++;
				}
			}
		} catch (Exception e) {
			logger.log(LogStatus.ERROR, "Failed: Header Not Found ");
		}
	}

	public static void createIdentity(String firstName, String lastName) throws Throwable {

		if (unhandledException == false) {

			try {
				System.out.println("*************************** createNewIdentity *******************************");
				logger.log(LogStatus.INFO,
						"*************************** createNewIdentity *******************************");

				if (driver.findElements(By.xpath(IdentityObjects.idmTabBtn)).size() > 0) {
					ByAttribute.mouseHover("xpath", IdentityObjects.idmTabBtn, "Mouse Hover on IDM Tab Link");
					Thread.sleep(1000);
					ByAttribute.click("xpath", IdentityObjects.idmManageIdentityLnk, "Click on Manage Identity Link");
					Utility.pause(5);
				} else {
					ByAttribute.mouseHover("xpath", IdentityObjects.cardHoldersAndAssetsTabBtn,
							"Mouse Hover on Cardholders & Assets Tab Link");
					Thread.sleep(1000);
					ByAttribute.click("xpath", IdentityObjects.idmManageIdentitiesLnk,
							"Click on Manage Identities Link");
					Utility.pause(5);
				}

				ByAttribute.click("xpath", IdentityObjects.createBtn, "click on create  icon to create new identity");
				Thread.sleep(1000);

				fillProfileInfo(firstName, lastName);

				ByAttribute.click("xpath", IdentityObjects.SaveBtn, "Click on save Button ");
				Thread.sleep(5000);

				if (driver.findElements(By.xpath(IdentityObjects.idmTabBtn)).size() > 0) {
					ByAttribute.mouseHover("xpath", IdentityObjects.idmTabBtn, "Mouse Hover on IDM Tab Link");
					Thread.sleep(1000);
					ByAttribute.click("xpath", IdentityObjects.idmManageIdentityLnk, "Click on Manage Identity Link");
					Utility.pause(5);
				} else {
					ByAttribute.mouseHover("xpath", IdentityObjects.cardHoldersAndAssetsTabBtn,
							"Mouse Hover on Cardholders & Assets Tab Link");
					Thread.sleep(1000);
					ByAttribute.click("xpath", IdentityObjects.idmManageIdentitiesLnk,
							"Click on Manage Identities Link");
					Utility.pause(5);
				}

				if (driver.findElements(By.xpath(".//a[@role='button' and @aria-label='Yes']")).size() > 0) {
					Utility.verifyElementPresent(".//a[@role='button' and @aria-label='Yes']", "Save Changes ? Popup",
							false);
					Thread.sleep(1000);
					ByAttribute.click("xpath", ".//a[@role='button' and @aria-label='Yes']",
							"Click Save Changes Yes Button");
					Thread.sleep(3000);
				}
				String userId = firstName + "." + lastName;
				if (Utility.verifyElementPresent(".//div[@class='x-grid-cell-inner ' and text()='" + userId + "']",
						"User in IDM table", false)) {
					Utility.reportLogStatus("PASS", "Identity Created Successfully");
				} else {
					Utility.reportLogStatus("FAIL", "Identity NOT Created. Please Check Application for more details.");
				}
				Thread.sleep(2000);
				ByAttribute.clearSetText("xpath", IdentityObjects.idmManageIdentitySearchFieldTxt, userId,
						"Enter User ID in Search field");
				Thread.sleep(3000);
				if (Utility.verifyElementPresent(".//div[@class='x-grid-cell-inner ' and text()='" + userId + "']",
						"User in IDM table", false)) {
					Utility.reportLogStatus("PASS", "Identity Created Successfully");
				} else {
					Utility.reportLogStatus("FAIL",
							"Search Field is NOT Working. Please Check Application for more details.");
				}
				Thread.sleep(2000);
			} catch (Exception e) {
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				Utility.recoveryScenario(nameofCurrMethod, e);
			}
		}

	}

	public static void fillProfileInfo(String fName, String lName) throws Throwable {

		if (unhandledException == false) {
			System.out.println("********************Fill Profile Info********************");
			try {

				String validFrom = null, validTo = null;
				String empType = "Contractor";

				Calendar c = Calendar.getInstance();
				DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy h:mm:ss a");
				Date date = new Date();
				String currentDate = dateFormat.format(date);
				validFrom = currentDate;
				System.out.println(currentDate);

				try {
					// Setting the date to the given date
					c.setTime(dateFormat.parse(currentDate));
				} catch (Exception e) {
					e.printStackTrace();
				}

				// Number of Days to add
				c.add(Calendar.DAY_OF_MONTH, 370);
				// Date after adding the days to the given date
				validTo = dateFormat.format(c.getTime());
				// Displaying the new Date after addition of Days
				System.out.println("Date after Addition: " + validTo);

				ByAttribute.setText("xpath", IdentityObjects.employeeTypeLnk, empType, "Enter employee Type");
				Thread.sleep(4000);
				ByAttribute.click("xpath", IdentityObjects.idmManageIdentityProfileInfoFirstNameTxt,
						"Enter first Name");
				Thread.sleep(1000);
				ByAttribute.setText("xpath", IdentityObjects.idmManageIdentityProfileInfoFirstNameTxt, fName,
						"Enter first Name");
				Thread.sleep(1000);
				ByAttribute.setText("xpath", IdentityObjects.idmManageIdentityProfileInfoLastNameTxt, lName,
						"Enter Last Name");
				Thread.sleep(1000);
				ByAttribute.setText("xpath", IdentityObjects.idmManageIdentityProfileInfoPhoneNoTxt,
						(String.valueOf(Utility.getRandomNumber(5))), "Enter Phone Number");
				Thread.sleep(1000);
				ByAttribute.setText("xpath", IdentityObjects.idmManageIdentityProfileInfoDepartmentTxt, "Sales",
						"Enter Department");
				Thread.sleep(1000);
				ByAttribute.setText("xpath", IdentityObjects.idmManageIdentityProfileInfoCompanyTxt, "AlertEnterprise",
						"Enter Company");
				Thread.sleep(1000);

				if (driver.findElements(By.xpath(IdentityObjects.collapseBasicInfoSection)).size() > 0)
					ByAttribute.click("xpath", IdentityObjects.collapseBasicInfoSection,
							"collapse Basic Information Section");
				Thread.sleep(1000);
				if (driver.findElements(By.xpath(IdentityObjects.collapseContactInfoSection)).size() > 0)
					ByAttribute.click("xpath", IdentityObjects.collapseContactInfoSection,
							"collapse Contact Information Section");
				Thread.sleep(1000);
				ByAttribute.clearSetText("xpath", IdentityObjects.idmProfileUserIdTxt, fName + "." + lName,
						"Enter user id");
				Thread.sleep(1000);

				if (driver.findElements(By.xpath(IdentityObjects.collapseOrganisationInfoSection)).size() > 0)
					ByAttribute.click("xpath", IdentityObjects.collapseOrganisationInfoSection,
							"collapse Organisation Information Section");
				Thread.sleep(1000);

				ByAttribute.click("xpath", IdentityObjects.identityValidToDateTimePickerBtn,
						"Click Valid To Calendar Button");
				Thread.sleep(1000);
				ByAttribute.click("xpath", IdentityObjects.identityValidToConfirmBtn, "Click Confirm Button");

			} catch (Exception e) {
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				Utility.recoveryScenario(nameofCurrMethod, e);
			}
		}

	}

	public static void fillAccessesInfo() throws Throwable {
		if (unhandledException == false) {
			index++;
			System.out.println("****************Fill Access Info******************");
			try {

				String accessToBeAssigned1 = "End User Role";
				String accessToBeAssigned2 = "Restricted Access";
				String accessToBeAssigned3 = "";

				if ((accessToBeAssigned1 == null) || (accessToBeAssigned1.equals(""))) {
				} else {
					String addRecordsIcon = "(//a[normalize-space(text())='Click here to Add'])[" + index + "]";
					if (driver.findElements(By.xpath(addRecordsIcon)).size() > 0)
						ByAttribute.click("xpath", addRecordsIcon, "click on add icon to insert new access");
					else {
						ByAttribute.click("xpath", IdentityObjects.addRecordsIconAccessTab,
								"click on add icon to insert new access");
					}
					Thread.sleep(5000);
					Actions action = new Actions(driver);
					action.sendKeys(accessToBeAssigned1);
					action.build().perform();
					Thread.sleep(5000);
					WebElement accessValue = driver.findElement(By.xpath(
							"//div[contains(@class,'x-boundlist-list-ct')]//li[text()='" + accessToBeAssigned1 + "']"));
					action.moveToElement(accessValue).click();
					action.build().perform();
					logger.log(LogStatus.INFO, "Access Value selected");
					Thread.sleep(2000);

					WebElement ele = driver.findElement(By.xpath("//span[text()='Description']"));
					ele.click();
				}

				if ((accessToBeAssigned2 == null) || (accessToBeAssigned2.equals(""))) {
				} else {
					ByAttribute.click("xpath", IdentityObjects.idmManageIdentityaddRowLnk,
							"Click on Add icon to add more accesses");
					Thread.sleep(5000);
					Actions action = new Actions(driver);
					action.sendKeys(accessToBeAssigned2);
					action.build().perform();
					Thread.sleep(5000);
					WebElement accessValue = driver
							.findElement(By.xpath("//div[contains(@class,'x-boundlist-list-ct')]//li[contains(text(),'"
									+ accessToBeAssigned2 + "')]"));
					action.moveToElement(accessValue).click();
					action.build().perform();
					logger.log(LogStatus.INFO, "Access Value selected");
					Thread.sleep(2000);

					WebElement ele = driver.findElement(By.xpath("//span[text()='Description']"));
					ele.click();
				}
				if ((accessToBeAssigned3 == null) || (accessToBeAssigned3.equals(""))) {
				} else {
					ByAttribute.click("xpath", IdentityObjects.idmManageIdentityaddRowLnk,
							"Click on Add icon to add more accesses");
					Thread.sleep(5000);
					Actions action = new Actions(driver);
					action.sendKeys(accessToBeAssigned3);
					action.build().perform();
					Thread.sleep(5000);
					WebElement accessValue = driver
							.findElement(By.xpath("//div[contains(@class,'x-boundlist-list-ct')]//li[contains(text(),'"
									+ accessToBeAssigned3 + "')]"));
					action.moveToElement(accessValue).click();
					action.build().perform();
					logger.log(LogStatus.INFO, "Access Value selected");
					Thread.sleep(2000);

					WebElement ele = driver.findElement(By.xpath("//span[text()='Description']"));
					ele.click();
				}

			} catch (Exception e) {
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				Utility.recoveryScenario(nameofCurrMethod, e);
			}
		}
	}

	public static void fillPrerequisitesInfo() throws Throwable {
		if (unhandledException == false) {
			index++;
			System.out.println("**************Fill Prerequisite Info***********");
			try {

				String prerequisiteName1 = "";
				String prerequisiteType1 = "";

				String prerequisiteName2 = "";
				String prerequisiteType2 = "";

				if (prerequisiteName1 != "") {
					ByAttribute.click("xpath", "(//a[normalize-space(text())='Click here to Add'])",
							"Click on Click here to Add");
					Thread.sleep(3000);

					getIndexOfPrerequisiteHeaders();
					Actions action = new Actions(driver);
					action.sendKeys(prerequisiteType1);
					action.build().perform();
					WebElement prerequisiteTypeValue = driver.findElement(By.xpath(
							"//div[contains(@class,'x-boundlist-list-ct x-unselectable x-scroller')]//li[text()='"
									+ prerequisiteType1 + "']"));
					action.moveToElement(prerequisiteTypeValue).click();
					action.build().perform();
					logger.log(LogStatus.INFO, "Entered the Prerequisite Type");

					action.sendKeys(Keys.TAB);
					action.sendKeys(prerequisiteType1);
					action.build().perform();
					Thread.sleep(3000);
					WebElement prerequisiteValue = driver.findElement(By.xpath(
							"//div[contains(@class,'x-boundlist-list-ct x-unselectable x-scroller')]//li[text()='"
									+ prerequisiteName1 + "']"));
					action.moveToElement(prerequisiteValue).click();
					action.build().perform();
					logger.log(LogStatus.INFO, "Entered the Prerequisite Name");
				}

				if (prerequisiteName2 != "") {
					ByAttribute.click("xpath", "//div[text()='" + prerequisiteType1
							+ "']//parent::td//preceding-sibling::td//*[contains(@class,'x-action-col-icon x-action-col-0  aegrid-rowAdd')]",
							"Click on Add icon to add more accesses");
					Thread.sleep(3000);
					Actions action = new Actions(driver);
					action.sendKeys(prerequisiteType2);
					action.build().perform();
					WebElement prerequisiteTypeValue = driver.findElement(By.xpath(
							"//div[contains(@class,'x-boundlist-list-ct x-unselectable x-scroller')]//li[text()='"
									+ prerequisiteType2 + "']"));
					action.moveToElement(prerequisiteTypeValue).click();
					action.build().perform();
					logger.log(LogStatus.INFO, "Entered the Prerequisite Type");

					action.sendKeys(Keys.TAB);
					action.sendKeys(prerequisiteName2);
					action.build().perform();
					Utility.pause(5);
					WebElement prerequisiteValue = driver.findElement(By.xpath(
							"//div[contains(@class,'x-boundlist-list-ct x-unselectable x-scroller')]//li[text()='"
									+ prerequisiteName2 + "']"));
					action.moveToElement(prerequisiteValue).click();
					action.build().perform();
					logger.log(LogStatus.INFO, "Entered the Prerequisite Name");
				}
			} catch (Exception e) {
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				Utility.recoveryScenario(nameofCurrMethod, e);
			}
		}
	}

	private static void getIndexOfPrerequisiteHeaders() {
		List<WebElement> headers = driver.findElements(By.xpath(".//div[@class='x-column-header-text']//span"));
		int size = headers.size(), j = 1;

		for (int i = 1; i < size; i++) {
			WebElement header = headers.get(i);
			String heading = header.getText();
			System.out.println(i);
			System.out.println(j);
			System.out.println("heading " + (i) + " " + heading);

			switch (heading.toLowerCase()) {
			case "type":
				j++;
				break;
			case "":

				break;
			default:
				System.out.println("Need to skip this header : " + heading);
				j++;
			}
		}

	}

	public static void checkCompletedItemInComletedRequests() throws Throwable {

		if (unhandledException == false) {
			System.out.println(
					"******************************** checkCompletedItemInComletedRequests  *****************************************");
			logger.log(LogStatus.INFO,
					"***************************** checkCompletedItemInComletedRequests *********************************");

			try {

				/** Check Completed Requests **/
				Utility.reportLogStatus("INFO", "$$$$$ Check Completed Requests $$$$$");
				if (driver.findElements(By.xpath(HomeObjects.homeTabBtn)).size() > 0) {
					ByAttribute.mouseHover("xpath", HomeObjects.homeTabBtn, "Mouse Hover on Home Tab Link");
					Thread.sleep(1000);
					if (Utility.verifyElementPresentReturn(HomeObjects.homeDashboardLnk, "Dashboard Link", true,
							false)) {
						ByAttribute.click("xpath", HomeObjects.homeDashboardLnk, "Click Dashboard Link");
					}
					if (Utility.verifyElementPresentReturn(HomeObjects.homeDashboardCompletedReqBtn,
							"CompletedRequestLink", true, false)) {
						ByAttribute.click("xpath", HomeObjects.homeDashboardCompletedReqBtn,
								"Click Completed requests");
						Thread.sleep(1000);
					}
					if (Utility.verifyElementPresent(
							".//*[@role='presentation' and @class='x-panel-body x-grid-with-row-lines x-grid-body x-panel-body-default x-panel-body-default x-noborder-trbl']//table[@data-recordindex='0']//div[text() ='COMPLETED']",
							"First Request Completed", false)) {
						Utility.reportLogStatus("PASS", "The status of first request is Completed");
					} else {
						Utility.reportLogStatus("FAIL", "The status of first request is not Completed");
					}

				}

			} catch (Exception e) {
				String nameofCurrMethod = new Throwable().getStackTrace()[0].getMethodName();
				Utility.recoveryScenario(nameofCurrMethod, e);
			}
		}
	}

}
