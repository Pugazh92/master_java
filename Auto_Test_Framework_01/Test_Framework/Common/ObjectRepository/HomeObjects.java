package ObjectRepository;

public interface HomeObjects {

	/** Home **/
	String homeTabLnk =".//*[@id='tabmenu']//span[contains(text(),'Home')]";
	
	String homeWorkItemsForApprovalTbl = ".//table[@class='ui-iggrid-headertable']";
	
	String homeApplicantPreEnrollmentApproveBtn = ".//button[@id='message' and @class='approveAlert mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-orange ng-binding']";

	String homeGoBackToInboxBtn = ".//button[text()='Go Back To Inbox']";
	
	//*********** NEW PLATFORM ***********
		String HomeSearchMenuBtn1= "//a[@data-qtip='Search Menu']";
		String HomeSearchMenuBtn2 = "//input[@aria-label='Search Menu']";
		String HomeSearchMenuTxt = "//input[@placeholder='Search Menu']";
	
		String homeAnnouncementPopUpCloseLnk ="//div[text()='Announcement']//parent::div//following-sibling::div//div[@class='x-tool-tool-el x-tool-img x-tool-close ']";
		String homeTabBtn =".//*[@class='x-btn-inner x-btn-inner-aeTopMenuButton-small' and text()='Home']";
		String myRequestsTabBtn =".//*[@class='x-btn-inner x-btn-inner-aeTopMenuButton-small' and text()='My Requests']";
		String inboxTabBtn =".//*[@class='x-btn-inner x-btn-inner-aeTopMenuButton-small' and text()='Inbox']";
		String dashboardTabBtn =".//*[@class='x-btn-inner x-btn-inner-aeTopMenuButton-small' and text()='Dashboard']";
		String homeInboxOpenBtn =".//a[@role='button' and @data-qtip='Open']";
		String homeInboxCompletedBtn =".//a[@role='button' and @data-qtip='Completed']";
		String adminTabBtn =".//*[@class='x-btn-inner x-btn-inner-aeTopMenuButton-small' and text()='Admin']";
		String adminProvMonitorLnk =".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Provisioning Monitor']";
		String adminProvMonitorPageLbl = ".//h1[contains(@class,'x-component x-box-item x-component-activitytext') and text()='Provisioning Monitor']|.//label[contains(@class,'x-component x-box-item x-component-activitytext') and text()='Provisioning Monitor']";
		
		String adminConnectorLibraryLnk =".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Connector Library']";
		String adminConnectorLibraryPageLbl = ".//h1[contains(@class,'x-component x-box-item x-component-activitytext') and text()='Connector Library']|.//label[contains(@class,'x-component x-box-item x-component-activitytext') and text()='Connector Library']";
		String adminConnectorLibrarySearchFieldTxt = ".//input[@name='searchField' and @aria-label='Enter to Search']";
		
		String reconTabBtn =".//*[@class='x-btn-inner x-btn-inner-aeTopMenuButton-small' and text()='Recon']";
		String reconReconMonitorLnk =".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Recon Monitor']";
		String reconReconSetupLnk =".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Recon setup' or text()='Recon Setup']";
		String reconReconMonitorPageLbl = ".//h1[contains(@class,'x-component x-box-item x-component-activitytext') and text()='Recon Monitor']|.//label[contains(@class,'x-component x-box-item x-component-activitytext') and text()='Recon Monitor']";
		String reconReconSetupPageLbl = ".//h1[contains(@class,'x-component x-box-item x-component-activitytext') and text()='Recon Setup']|.//label[contains(@class,'x-component x-box-item x-component-activitytext') and text()='Recon Setup']";
		String selfServiceSearchUserTxt = ".//label[@data-ref='placeholderLabel' and text()='Search Identity or User']//preceding-sibling::div//input";
		
		String homeAccessRequestLnk =".//span[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Access Request' or text()='My Requests']";
		String homeMyRequestsLnk =".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='My Requests']";
		String homeMyRequestLnk =".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and contains( text(),'My Requests')]";
		String homeInboxLnk = "(.//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Inbox' or text()='inbox'] | .//*[@class='x-btn-inner x-btn-inner-aeSecondMenuButton-small' and text()='Inbox'])";
		String homeDashboardLnk = ".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and contains( text(),'Dashboard')]";
		String homeMyDashboardLbl = ".//h1[contains(@class,'x-component x-box-item x-component-activitytext') and text()='My Dashboard']|.//label[contains(@class,'x-component x-box-item x-component-activitytext') and text()='My Dashboard']";
		String homeMyDashboardBtn =".//*[@class='x-btn-inner x-btn-inner-aeTopMenuButton-small' and text()='My Dashboard']";
		String downloadBtn =".//a[@role='button' and @data-qtip='Download']";
		String homeUserProfileLnk = ".//a[@role='button' and @href='#profile_newadminrole']";
		String homeUserProfileHireDateTxt = ".//span[@class='x-form-item-label-text' and text()='Hire Date']//ancestor::label//following-sibling::div[contains(@class,'x-form-text-field-body')]//input[@placeholder='Select Hire Date']";
		String homeUserPreferencesCancelBtn = ".//div[@class='x-title-text x-title-text-default x-title-item' and text()='User Preferences']//ancestor::div[contains(@class,'x-header-draggable')]//following-sibling::div[@class='x-window-bodyWrap']//span[@class='x-btn-inner x-btn-inner-aebtnSecondary-medium' and text()='Cancel']";
		String homeLoggedInUserBtn = ".//span[@class='x-btn-wrap x-btn-wrap-aetextlink-medium x-btn-arrow x-btn-arrow-right' and @role='presentation']//parent::a";
		String homeUserProfileAboutBtn = ".//span[contains(text(),'About')]//parent::a";
		String homeBuildVersionLbl = ".//div[contains(@class,'x-component x-box-item') and contains(text(),'Version')]";
		String homeCloseAboutDialogBtn = ".//div[contains(@class,'x-tool-tool-el x-tool-img x-tool-close') and @data-ref='toolEl']";
		String homeAccessRequestNewBadgeRdb = ".//label[text()='New Badge']//parent::div//input[@type='radio']";
		
		String homeAccessRequestPageLbl =".//*[contains(@id,'label') and text()='Access Request']";
		String homeMyRequestsPageLbl =".//label[@class='x-component x-box-item x-component-activitytext' and text()='My Requests']";
		String homeAccessRequestCreateBtn =".//*[@class='x-btn-inner x-btn-inner-aebtnPrimary-medium' and text()='Create']";
		String homeCreateAccessRequestPageLbl = ".//*[@role='heading' and text()='Create Access Request' or text()='Create My Requests']";
		String homeAccessRequestSelfRdb =".//span[@data-ref='labelTextEl' and text()='Request For:']//ancestor::div[@class='x-container x-form-checkboxgroup x-form-item x-form-item-default x-box-item x-container-default x-vbox-form-item']//label[@data-ref='boxLabelEl' and text()='Self']";
		String homeAccessRequestOthersRdb =".//span[@data-ref='labelTextEl' and text()='Request For:']//ancestor::div[@class='x-container x-form-checkboxgroup x-form-item x-form-item-default x-box-item x-container-default x-vbox-form-item']//label[@data-ref='boxLabelEl' and text()='Others']";
		String homeAccessRequestTypeOthersRdb =".//label[contains(@class,'activitySubtext') and text()='Request Type']//following-sibling::div//table//label[@data-ref='boxLabelEl' and text()='Others']";
		String homeAccessRequestSearchLocationTxt =".//input[@data-ref='inputEl' and @placeholder='Search or Filter by Location']";
		String homeAccessRequestSearchPositionTxt =".//input[@data-ref='inputEl' and @placeholder='Search or Filter by Position Access']";
		String homeAccessRequestSearchApplicationTxt =".//input[@data-ref='inputEl' and @placeholder='Search or Filter by Application Access']";
		String homeAccessRequestSearchITSystemTxt =".//input[@data-ref='inputEl' and @placeholder='Search or Filter by IT System']";
		String homeAccessRequestSearchAccessTxt =".//div[@class='tab-title' and contains(text(),'Review')]//ancestor::div[@class='x-tab-bar x-docked x-tab-bar-default x-horizontal x-tab-bar-horizontal x-tab-bar-default-horizontal x-top x-tab-bar-top x-tab-bar-default-top x-docked-top x-tab-bar-docked-top x-tab-bar-default-docked-top x-noborder-trl']//parent::div/div[@class='x-panel-body x-panel-body-default x-panel-body-default x-noborder-trbl']//input[@data-ref='inputEl' and @placeholder='Search or Filter by Location']";
		String homeAccessRequestSearchPositionAccessTxt ="//input[contains(@class,'x-form-field x-form-empty-field x-form-empty-field-default x-form-text x-form-text-default') and @placeholder='Search or Filter by Position Access']";
		String homeAccessRequestSearchApplicationAccessTxt ="(.//div[@class='tab-title' and contains(text(),'Review')]) | (//span[@class='x-tab-inner x-tab-inner-default' and text()='Review'])//ancestor::div[@class='x-tab-bar x-docked x-tab-bar-default x-horizontal x-tab-bar-horizontal x-tab-bar-default-horizontal x-top x-tab-bar-top x-tab-bar-default-top x-docked-top x-tab-bar-docked-top x-tab-bar-default-docked-top x-noborder-trl']//parent::div/div[@class='x-panel-body x-panel-body-default x-panel-body-default x-noborder-trbl']//input[@data-ref='inputEl' and @placeholder='Search or Filter by Application Access']";
		String homeAccessRequestSearchITAccessLbl =".//label[contains(@id,'placeholderLabel') and text()='Search or Filter by IT Access']";
		String homeAccessRequestCreateNextBtn =".//*[@class='x-btn-inner x-btn-inner-aebtnSmallPrimary-small' and contains(text(),'Next')]";
		String homeAccessRequestCreateAddBtn =".//*[@class='x-btn-inner x-btn-inner-aebtnSmallPrimary-small' and contains(text(),'Add')]";
		String homeAccessRequestCreatePreviousBtn =".//*[@class='x-btn-inner x-btn-inner-aebtnSmallPrimary-small' and contains(text(),'Previous')]";
		String homeAccessRequestAddLocationBtn =".//*[contains(@id,'baseAccessLocationBox')]//div[@class='selecteditem btnadd' and text()='Add']";
		String homeAccessRequestReviewTab ="(.//div[@class='tab-title' and contains(text(),'Review')]) | (//span[@class='x-tab-inner x-tab-inner-default' and text()='Review'])";
		String homeAccessRequestCommentsBtn =".//*[@data-ref='btnInnerEl' and text()='Comments']";
		String homeAccessRequestAttachmentsBtn =".//*[@data-ref='btnInnerEl' and text()='Attachments']";
		String homeAccessRequestUploadAttachmentBtn =".//*[@class='x-btn-icon-el x-btn-icon-el-aebtnSecondary-medium aegrid-upload ']";
		String homeAccessRequestAddCommentBtn =".//*[@data-ref='btnInnerEl' and text()='Add Comment']";
		String homeAccessRequestCloseDialogBtn =".//div[@class='x-title-text x-title-text-default x-title-item' and text()='Add Comment' or text()='Attachments']//parent::div[contains(@class,'x-title x-window-header-title')]//following-sibling::div[@data-qtip='Close dialog']";
		String homeAccessRequestAddLocationSubmitBtn =".//*[@class='x-btn-inner x-btn-inner-aebtnPrimary-medium' and text()='Submit']";
		String homeAccessRequestAddPositionSubmitBtn =".//*[@class='x-btn-inner x-btn-inner-aebtnPrimary-medium' and text()='Submit']";
		String homeAccessRequestAddApplicationSubmitBtn =".//*[@class='x-btn-inner x-btn-inner-aebtnPrimary-medium' and text()='Submit']";
		String homeAccessRequestAddLocationCancelBtn =".//a[@data-qtip='Cancel' and @aria-hidden='false']";
		String homeAccessRequestAddLocationChangesWillBeLostMsgLbl =".//*[contains(@id,'messagebox') and text()='You request changes will lost, do you want to proceed?']";
		String homeAccessRequestHistoryBtn = "//*[@class='x-btn-inner x-btn-inner-aebtnSmallSecondary-small' and text()='History']";
		String homeAccessRequestHistoryPopUpCloseIcn= "//div[text()='History']//parent::div//following-sibling::div//*[@class='x-tool-tool-el x-tool-img x-tool-close ']";
		
		String homeAccessRequestAddLocationReasonTxt =".//*[contains(@id,'baseComboBox') and @placeholder='Select Reason for request']";
		String homeAccessRequestAddLocationBusinessJustificationTxt =".//textarea[contains(@id,'baseTextArea')]";
		String homeAccessRequestAddLocationJustificationTxt =".//*[text()='Justification']//following::div[contains(@id,'baseTextArea') and @class='x-form-text-wrap x-form-text-wrap-default']//textarea";
		String homeAccessRequestAddLocationGroupNameTxt =".//*[contains(@id,'fieldset') and @data-ref='tbody']//input[contains(@id,'baseComboBox')]";
		String homeAccessRequestAddLocationConfirmBtn =".//*[@class='x-btn-inner x-btn-inner-aebtnPrimary-medium' and text()='Confirm']";
		String homeAccessRequestDetailExpandBtn =".//fieldset[@aria-label='Request Detail field set']//div[@class='x-tool x-fieldset-header-tool-default x-tool-default' and @aria-label='Expand field set']";
		String homeConnLibCCUREOptionLnk = ".//li[@role='option' and text()='CCURE 9000']";
		String homeCCURETestConnLnk = ".//div[contains(@class,'x-grid-cell-inner') and text()='CCURE 9000']//ancestor::tr[@role='row']//div[@role='button' and @data-qtip='Test Connection']";
		String homeTestConnectionFailedErrorLbl = ".//div[@class='x-autocontainer-innerCt' and text()='Test Connection Failed']";
		String homeManageAssetsPageHeaderLbl = ".//h1[contains(text(),'Manage Asset')]|.//label[contains(text(),'Manage Asset')]";
		
		String homeInboxRequestApproveBtn = ".//button[contains(@data-qtip,'Approve') or contains(@data-qtip,'Click to')]";
		String homeInboxRequestRejectBtn = ".//button[contains(@data-qtip,'Reject')]";
		String homeInboxRequestHoldBtn = ".//a[@role='button' and @data-qtip='Click to Hold']";
		String homeInboxRequestUnholdBtn = ".//a[@role='button' and @data-qtip='Click to Unhold']";
		String homeInboxCommentRequiredLbl = ".//*[@class='x-title-text x-title-text-default x-title-item' and text()='Comment Required']";
		String homeInboxCommentRequiredConfirmBtn = ".//*[@data-ref='btnInnerEl' and text()='Confirm']";
		String homeInboxRequestWorkflowApprovedLbl = ".//td[@data-columnid='workflowActionColumn']//div[text()='Approved']";
		String homeInboxRequestWorkflowViewStatusBtn = ".//td[@data-columnid='workflowActionColumn']//button[@data-qtip='View Status']";
		String homeInboxRequestWorkflowRejectedLbl = ".//td[@data-columnid='workflowActionColumn']//div[text()='Rejected']";
		String homeInboxRequestWorkflowViewStatusCancelBtn = ".//div[@class='x-title-text x-title-text-default x-title-item' and contains(text(),'Request Number')]//parent::div[contains(@class,'window-header-title-default')]//following-sibling::div[@data-qtip='Close dialog']";
		String homeInboxRequestInboxExpandBtn = ".//span[contains(@class,'hamburgerexpand')]";
		String homeInboxRequestInboxCollapseBtn = ".//span[@class='x-btn-icon-el x-btn-icon-el-aetextlink-medium aegrid-hamburger ']";
		String homeInboxRequestInboxCompletedBtn = ".//span[@class='x-tree-node-text ' and text()='Completed']";
		String homeGenericRemoveRowBtn = ".//*[@data-ref='btnIconEl' and @class='x-btn-icon-el x-btn-icon-el-aebtnSecondary-medium aegrid-rowMinus ']";
		String homeGenericAddRowBtn = ".//*[@data-ref='btnIconEl' and @class='x-btn-icon-el x-btn-icon-el-aebtnSecondary-medium aegrid-rowAdd ']";
		String homeInboxRequestMenuIconLnk = "(//*[contains(@id,'button') and @class='x-btn-icon-el x-btn-icon-el-aetextlink-medium aegrid-menu '])[2]";
		String homeInboxRequestHistoryOptionInMenuLnk = "(//*[text()='History'])[2]";
		String homeInboxRequestCloseHistoryPopUpWindowLnk = "//div[@class='x-tool-tool-el x-tool-img x-tool-close ']";
		String homeInboxMoreMenuBtn = ".//a[@class='x-btn x-unselectable x-box-item x-btn-aetextlink-medium' and @data-qtip='More']";
		String homeInboxMoreMenuHistoryBtn = ".//span[contains(@id,'menuitem') and text()='History']//parent::a[@role='menuitem']";
		String homeInboxHistoryDownloadAsExcelBtn = ".//a[@role='button' and @data-qtip='Download As Excel']";
		String homeInboxHistoryDownloadAsPDFBtn = ".//a[@role='button' and @data-qtip='Download As PDF']";
		String homeInboxForwardRequestIdentityRdb = ".//label[@data-ref='boxLabelEl' and text()='Identity']//preceding-sibling::span//input[@name='recipientType']";
		String homeInboxForwardRequestSearchIdentityTxt = ".//label[contains(@id,'placeholderLabel') and text()='Search Identity or User']//parent::div//input[@role='textbox']";
		String homeInboxForwardRequestConfirmBtn = ".//span[@data-ref='btnInnerEl' and text()='Confirm']//ancestor::a[@role='button']";
		String homeInboxForwardRequestWithNoReturnChk = ".//span[@class='x-form-item-label-text' and text()='Forward with no return:']//ancestor::td//input[@type='checkbox']";
		
		String createBtn = ".//*[@class='x-btn-inner x-btn-inner-aebtnPrimary-medium' and text()='Create']";
		String wellnessCheckLnk = "//div[@class='x-component location-chooser-view x-box-item x-component-default x-scroller']//p[text()='Wellness Check']";
		String physicalAccessLnk = "//div[@class='x-component location-chooser-view x-box-item x-component-default x-scroller']//p[text()='Physical Access']";
		String requestLocationAccessLnk = "//div[@class='x-component location-chooser-view x-box-item x-component-default x-scroller']//p[text()='Request Location Access']";
		String homeCreateRequestPositionAccessPod = "//div[@class='x-component location-chooser-view x-box-item x-component-default x-scroller']//p[text()='Position Access']";
		String homeCreateRequestApplicationAccessPod = "//div[@class='x-component location-chooser-view x-box-item x-component-default x-scroller']//p[text()='Application Access']";
		String homeCreateRequestITAccessPod = "//div[@class='x-component location-chooser-view x-box-item x-component-default x-scroller']//p[text()='IT Access']";
		String acknowledgementCheckbox = "(//input[@type='checkbox'])[1]";
		String submitBtn = "//*[@class='x-btn-inner x-btn-inner-aebtnPrimary-medium' and text()='Submit']";
		String questionOneNo = "//*[@class='x-form-item-label-text' and contains(text(),'tested positive')]//ancestor::label//following-sibling::div//label[text()='No']//preceding-sibling::span//input";
		String questionTwoNo = "//*[@class='x-form-item-label-text' and contains(text(),'COVID-19 symptoms')]//ancestor::label//following-sibling::div//label[text()='No']//preceding-sibling::span//input";
		String questionThreeNo = "//*[@class='x-form-item-label-text' and contains(text(),'temperature')]//ancestor::label//following-sibling::div//label[text()='No']//preceding-sibling::span//input";
		String questionOneYes = "//*[@class='x-form-item-label-text' and contains(text(),'tested positive')]//ancestor::label//following-sibling::div//label[text()='Yes']//preceding-sibling::span//input";
		String userRequestHeader = "//div[@class='x-box-target']//label[text()='User Request']";
		String requestNoLnk = "(//tr[@class='  x-grid-row'])[1]//*[contains(text(),'ACR-')]";
		String homeAccessRequestOtherRequestsPod = "//div[@class='x-component location-chooser-view x-box-item x-component-default x-scroller']//p[text()='Other Requests']";
		String selectRequestType = "//*[contains(@id,'baseComboBoxRemote') and @placeholder ='Select Request Type']";
		String uploadImgBtn = ".//*[@class='x-btn-inner x-btn-inner-aebtnSecondary-medium' and text()='Upload']";
		String cropAndSaveBtn = ".//*[@class='x-btn-inner x-btn-inner-aebtnPrimary-medium' and text()='Crop & Save']";
		String homeMyRequestsActualPhotoLnk = "//div[@class='jcrop-tracker']";
		String employeeType = "//input[contains(@id,'baseBusObjType') and @placeholder='Select Employee Type']";
		String homeMyRequestsUploadedImageLnk = "//*[@class='x-img x-box-item x-img-default']";
		String homeMyRequestsUploadedImageSectionLnk = "//label[@class='x-component x-box-item x-component-activitySubtext' and text()='photo']";
		String homeAccessRequestFirstNameTxt = "//*[contains(@id,'baseText') and @placeholder='Enter First Name']";
		String homeAccessRequestLastNameTxt = "//*[contains(@id,'baseText') and @placeholder='Enter Last Name']";
		String homeAccessRequestEmpTypeTxt = "//*[contains(@id,'baseBusObjType') and @placeholder='Select Employee Type']";
		String homeAccessRequestCountryDdn = "//*[contains(@id,'baseComboBoxRemote') and @placeholder='Select Country']";
		String homeAccessRequestJobTitle = "//*[contains(@id,'baseText') and @placeholder='Enter Job Title']";
		String homeAccessRequestDepartmentDdn = "//*[contains(@id,'baseComboBoxRemote') and @placeholder='Select Department Name']";
		String homeAccessRequestLocationDdn = "//*[contains(@class,'x-placeholder-label') and text()='Select Location']";
		String homeAccessRequestAccessListGrid = "//*[@class='x-box-target']//label[text()='Access List']";
		String homeAccessRequestBadgeListGrid = "//*[@class='x-box-target']//label[text()='Badge List']";
		String homeAccessRequestSystemListGrid = "//*[@class='x-box-target']//label[text()='System List']";
		String homeAccessRequestPrerequisiteList = "//*[@class='x-box-target']//label[text()='Prerequisite List']";
		String homeAccessRequestApproveButton = "//*[text()='Approve']";
		String homeOpenRequestsLnk = ".//*[@class='activeReq' and contains( text(),'Open Requests')]";
		String homeAccessRequestSelectBadgeDDn = "//div[@class='x-grid-cell-inner ' and text()='Select Badge']";
		String homeAccessRequestYesButtonOnPopUpWindow = "//*[@class='x-btn-inner x-btn-inner-default-small' and text()='Yes']";
		String TempWorkerTab = ".//*[@class='x-btn-inner x-btn-inner-aeTopMenuButton-small' and text()='Temp Worker']";
		String TempWorkerOnboardingLnk =".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Temp Worker Onboarding']";
		String TempWorkerModificationLnk =".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Temp Worker Modification']";
		String TempWorkerOffboardingLnk =".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Temp Worker Offboarding']";
		String TempWorkerRehireLnk =".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Temp Worker Rehire']";
		String ComparisonButton = "//*[@class='x-btn-inner x-btn-inner-aebtnSmallSecondary-small' and text()='Comparison']";
		String homeMyRequestsHeader = "//*[@class='x-box-target']//label[text()='My Requests']";
		String homeAccessRequestWorkFlowBtn = "//td[contains(@class,' x-grid-cell-workflowActionColumn x-grid-cell-last')]//button[@class='aegrid-view']";
		String workflowStatusHeaderInWFPopupWindow = "//div[contains(@id,'header-title') and contains(text(),'Workflow Status')]";
		String closeIconInWFStatusWindow = "//div[@class='x-tool-tool-el x-tool-img x-tool-close ']";
		String homeAccessRequestSelectTerminationReasonTxt = "//*[contains(@id,'baseComboBox') and @ placeholder='Select Termination Reason']";
		String homeAccessRequestSelectRehireReasonTxt = "//input[contains(@id,'baseText') and @class='x-form-field x-form-text x-form-text-default  x-form-empty-field x-form-empty-field-default']";
		String homeAccessRequestValidToDate = "//*[contains(@id,'baseDateTime') and @placeholder='Select Valid To']";
		String homeRequestInboxCloseHistoryWindowIcn = "//div[@class='x-tool-tool-el x-tool-img x-tool-close ']";
		String homeRequestInboxMenuIcn = "(//*[contains(@id,'button') and @class='x-btn-icon-el x-btn-icon-el-aetextlink-medium aegrid-menu '])[2]";
	    String homeRequestInboxHistoryMenuLnk = "(//*[text()='History'])[2]";
	    String homeRequestInboxUserIdTxt = "//input[contains(@id,'baseText') and @placeholder='Enter User ID']";
	    String homeMyRequestsActionMenuBtn = "//*[contains(@id,'button') and text()='Actions']";
	    String homeMyRequestsApprovalMenuItemLnk = "//*[contains(@id,'menuitem') and text()='Approve']";
	    String homeMyRequestsRequesterNameLnk = ".//span[@class='x-btn-wrap x-btn-wrap-aetextlink-medium x-btn-arrow x-btn-arrow-right' and @role='presentation']";
	    String homeMyRequestSearchUserTxt = ".//*[contains(@class,'x-placeholder-label') and text()='Search Identity or User']";
	    String homeRequestNumberColumnLbl = ".//span[@class='x-column-header-text-inner' and text()='Request Number']";
	    
	    /** Reports & Dashboards **/
	    String reportsAndDashboardsTabBtn =".//*[@class='x-btn-inner x-btn-inner-aeTopMenuButton-small' and text()='Reports & Dashboards']";
	    String reportsAndDashboardsDashboardsMenuBtn =".//*[@class='x-btn-inner x-btn-inner-aeSecondMenuButton-small' and text()='Dashboards']";
	    String reportsAndDashboardsAdminDashboardBtn =".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Admin Dashboard']";
	    String reportsAndDashboardsIdentityRequestDashboardLbl =".//label[@class='x-component x-box-item x-component-activitytext' and text()='Identity - Request Dashboard']";
	    String reportsAndDashboardsCancelBtn =".//a[@role='button' and @data-qtip='Cancel']";
	    String reportsActiveIdentityReportPageLbl =".//label[@class='x-component x-box-item x-component-activitytext' and text()='List Of All Active Identities']";
	    String reportsReportsDataTbl =".//table[@class='x-grid-item']//parent::div[@class='x-grid-item-container']";
	    String reportsFiltersBtn =".//a[@role='button' and @data-qtip='Filters']";
	    String reportsAddRowBtn =".//span[@class='x-btn-icon-el x-btn-icon-el-aebtnSecondary-medium aegrid-rowAdd ']//ancestor::a[@role='button']";
	    String reportsChooseFieldTxt =".//input[@data-ref='inputEl' and @placeholder='Choose Field']";
	    String reportsRecordsFoundLbl =".//label[contains(text(),'Records Found')]";
	    String reportsDownloadBtn =".//a[@role='button' and @data-qtip='Download']";
	    String reportsDownloadToExcelBtn =".//span[@role='presentation' and text()='Download to Excel']//parent::a";
	    String reportsDownloadToPDFBtn =".//span[@role='presentation' and text()='Download to PDF']//parent::a";
	    String reportsScheduleBtn =".//a[@role='button' and @data-qtip='Schedule']";
	    String reportsReportScheduleLbl =".//label[@class='x-component x-box-item x-component-activitytext' and text()='Report Schedule - List Of All Active Identities']";
	    String reportsCreateScheduleBtn =".//span[@data-ref='btnInnerEl' and text()='Create']//ancestor::a[@role='button']";
	    String reportsCreateReportScheduleLbl =".//label[@class='x-component x-box-item x-component-activitytext' and text()='Create Report Schedule']";
	    String reportsEnterNameTxt =".//input[@role='textbox' and @placeholder='Enter Name']";
	    String reportsEnterDescriptionTxt =".//input[@role='textbox' and @placeholder='Write a short Description']";
	    String reportsOutputFormatTxt =".//input[@role='combobox' and @placeholder='Select Output Format']";
	    String reportsNotificationTemplateTxt =".//input[@role='combobox' and @placeholder='Select Notification Template']";
	    String reportsScheduleDetailsTabLnk =".//span[@class='x-tab-inner x-tab-inner-default' and text()='Schedule Details']//ancestor::a[@role='tab']";
	    String reportsFilterTabLnk =".//span[@class='x-tab-inner x-tab-inner-default' and text()='Filter']//ancestor::a[@role='tab']";
	    String reportsTimeZoneTxt =".//input[@role='combobox' and @placeholder='Select Time Zone']";
	    String reportsStartDateTimeTxt =".//input[@role='combobox' and @placeholder='Enter Start Date / Time']";
	    String reportsSaveBtn =".//a[@role='button' and @data-qtip='Save']";
	    String dashboardViewAllBtn =".//a[@role='button' and @data-qtip='View All Requests']";
	    
	    String homeDashboardCompletedReqBtn = ".//*[ text()='Completed Requests']//ancestor::button[@role='presentation']";
	    
	    String UserOptionsBtn = "//*[@role='presentation' and @class='x-btn-wrap x-btn-wrap-aetextlink-medium x-btn-arrow x-btn-arrow-right']";
	    String UserOptionsLogoutBtn = "//*[contains(text(),'Logout')]";
	    
}












