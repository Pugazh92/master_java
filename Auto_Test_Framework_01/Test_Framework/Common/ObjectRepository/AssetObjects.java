package ObjectRepository;

public interface AssetObjects {

	String assetTypeTxt = "//*[contains(@id,'baseBusObjType') and @placeholder='Select Type']";
	String assetSubTypeTxt = ".//input[@role='combobox' and @aria-label='SubType']";
	String assetSerialNumberTxt = ".//input[@role='textbox' and contains(@aria-label,'Serial Number')]";
	String assetBadgeIdTxt = "//*[contains(@id,'baseText') and @placeholder='Enter Access ID']";
	String assetBadgeNameTxt = "//*[contains(@id,'baseText') and @placeholder='Enter Name']";
	String assetSourceIdTxt = "//*[contains(@id,'baseText') and @placeholder='Enter Source ID']";
	String assetSystemTxt = ".//*[contains(@id,'baseComboBoxRemote') and @placeholder='Select System' or @placeholder='Select Recon System']";
	String assetCreateAssetBtn = ".//*[@class='x-btn-inner x-btn-inner-aebtnPrimary-medium' and text()='Create']";
	String assetManageAssetLnk = "//*[contains(@id,'button') and text()='Manage Asset']";
	String assetTabBtn = ".//*[@class='x-btn-inner x-btn-inner-aeTopMenuButton-small' and text()='Asset']";
	String assetSaveBtn = ".//*[@class='x-btn-inner x-btn-inner-aebtnPrimary-medium' and text()='Save']";
	String cardHoldersAndAssetsTabBtn = ".//*[@class='x-btn-inner x-btn-inner-aeTopMenuButton-small' and text()='Cardholders & Assets']";
	String manageAssetsLnk = ".//*[@class='x-btn-inner x-btn-inner-aeThirdMenuButton-small' and text()='Manage Assets']";

	/** Asset **/
	String assetTabLnk = "//span[contains(@class,'x-btn-inner-aeTopMenuButton-small') and contains(text(),'Asset')]";

	String manageAssetLnk = "//span[text()='Manage Asset']";

	String assetTypeLnk = "//span[contains(text(),'Manage Asset Type')]";

	String assetInventoryLabel = "//label[text()='Asset Inventory']";

	String createViewLabel = "//label[text()='Create, View & Manage']";

	String searchField = "//input[contains(@id,'baseComboBox') and @name='searchField']";

	String filterIcon = "//span[contains(@class,'x-btn-icon-el-aetextlink-medium aegrid-filter')]";

	String settingsIcon = "//span[contains(@class,'x-btn-icon-el-aetextlink-medium aegrid-setting')]";

	String showHideFilterWidget = "//span[contains(@class,'x-menu-item-text-default x-menu-item-indent-no-separator') and contains(text(),'Show/hide Filter Widget')]";

	String createNewView = "//span[contains(@class,'x-menu-item-text-default x-menu-item-indent-no-separator') and contains(text(),'Create New View')]";

	String createBtn = "//span[contains(@class,'x-btn-inner x-btn-inner-aebtnPrimary-medium') and contains(text(),'Create')]";

	String menuOption = "//span[contains(@class,'x-btn-icon-el x-btn-icon-el-aetextlink-medium aegrid-menu')]";

	String reloadOption = "//span[contains(@class,'x-menu-item-text x-menu-item-text-default x-menu-item-indent-no-separator') and contains(text(),'Reload')]";

	String deleteOption = "//span[contains(@class,'x-menu-item-text x-menu-item-text-default x-menu-item-indent-no-separator') and text() = 'Delete']";

	String openDeletedItems = "//span[contains(@class,'x-menu-item-text x-menu-item-text-default x-menu-item-indent-no-separator') and text() = 'Open Deleted Items']";

	String uploadOption = "//span[contains(@class,'x-btn-icon-el x-btn-icon-el-aetextlink-medium aegrid-upload')]";

	String downloadOption = "//span[contains(@class,'x-btn-icon-el x-btn-icon-el-aetextlink-medium aegrid-download')]";

	String typeHeader = "//span[contains(@class,'x-column-header-text-inner') and text()='Type' ]";

	String subTypeHeader = "//span[contains(@class,'x-column-header-text-inner') and text()='SubType' ]";

	String techHeader = "//span[contains(@class,'x-column-header-text-inner') and text()='Technology']";

	String printHeader = "//span[contains(@class,'x-column-header-text-inner') and text()='Print Status']";

	String ownerHeader = "//span[contains(@class,'x-column-header-text-inner') and text()='Owner']";

	String assigneeHeader = "//span[contains(@class,'x-column-header-text-inner') and text()='Assignee']";

	String headerExpander = "(//div[@class='x-column-header-trigger' and contains(@id,'gridcolumn')])[3]";

	String sortAscending = "//span[contains(@class,'x-menu-item-text x-menu-item-text-default x-menu-item-indent-no-separator') and text()='Sort Ascending']";

	String sortDescending = "//span[contains(@class,'x-menu-item-text x-menu-item-text-default x-menu-item-indent-no-separator') and text()='Sort Descending']";

	String columnCustomizer = "//span[contains(@class,'x-menu-item-text x-menu-item-text-default x-menu-item-indent-no-separator') and text()='Columns']";

	String refineSearchLabel = "//label[contains(@class,'x-component x-box-item x-component-activitytext') and text()='Refine Search']";

	String typeFilter = "//label[contains(@class,'x-component dataViewClass x-box-item x-component-activitySubtext') and text()='Select Type']";

	String filterBy = "//label[contains(@class,'x-component x-box-item x-component-activitySubtext') and text()='Filter By']";

	String createAssetInventoryLabel = "//label[contains(@class,'x-component x-box-item x-component-activitytext') and text()='Create Asset Inventory']";

	String cancelBtn = "//span[contains(@class,'x-btn-inner x-btn-inner-aebtnSecondary-medium') and text()='Cancel']";

	String setUpLabel = "//span[contains(@class,'x-tab-inner x-tab-inner-default') and text()='Setup']";

	String typeLabel = "//span[contains(@class,'x-form-item-label-text') and text()='Type']";

	String subTypeLabel = "//span[contains(@class,'x-form-item-label-text') and text()='SubType']";

	String vendorLabel = "//span[contains(@class,'x-form-item-label-text') and text()='Vendor']";

	String technologyLabel = "//span[contains(@class,'x-form-item-label-text') and text()='Technology']";

	String printStatusLabel = "//span[contains(@class,'x-form-item-label-text') and text()='Print Status']";

	String nameLabel = "//span[contains(@class,'x-form-item-label-text') and text()='Name']";

	String locationLabel = "//span[contains(@class,'x-form-item-label-text') and text()='Location']";

	String statusLabel = "//span[contains(@class,'x-form-item-label-text') and text()='Status']";

	String parentIdLabel = "//span[contains(@class,'x-form-item-label-text') and text()='Parent ID']";

	String assigneeLabel = "//span[contains(@class,'x-form-item-label-text') and text()='Assignee']";

	String saveBtn = "//span[contains(@class,'x-btn-inner x-btn-inner-aebtnPrimary-medium') and text()='Save']";

	String typeReq = "//li[contains(text(),'Type is required')]";

	String serialReq = "//li[contains(text(),'Serial Number is required')]";

	String typeField = "//input[contains(@class,'x-form-text x-form-text-default') and contains(@id,'baseBusObjType')]";

	String serialField = "//input[@placeholder = 'Enter Serial Number' and contains(@class,'x-form-text x-form-text-default')]";

	String nameField = "//input[@placeholder = 'Enter Name' and contains(@class,'x-form-text x-form-text-default')]";

	String accessIdField = "//input[@placeholder = 'Enter Access ID' and contains(@class,'x-form-text x-form-text-default')]";

	String techField = "//*[text()='Select Technologies']";

	String descField = "//input[@placeholder = 'Write a short Description' and contains(@class,'x-form-text x-form-text-default')]";

	String codeField = "//input[@placeholder = 'Enter Code' and contains(@class,'x-form-text x-form-text-default')]";

}
