package ObjectRepository;

public interface LoginObjects {

	// ******************************************************************//
		// **********************Login controls*********************//
	

	String loginUsernameTxt = ".//*[@name='signinpod:userName']";
//	String loginUsernameTxt = "//input[@name='username']";

	
	String loginPasswordTxt = ".//*[@name='signinpod:password']";
//	String loginPasswordTxt = "//input[@name='password']";
	
	String loginSigninBtn = ".//*[@name='signinpod:logIn']";
	
	String loginRemberMeChk = ".//*[@id='rememberMe']";
	
	String loginTimeZoneDdn = ".//*[@class='select-control' and @name='signinpod:tzDropdown']";
	
	String loginUserName = "//input[@placeholder='Enter Username']";
	
	String pswdTxt = "//input[@placeholder='Enter Password']";
	
	String loginButtonLnk = "//span[normalize-space(text())='Login']";
	
	
	// **********************Self Service Login controls*********************//
	
	String selfServiceSigninWithOKTABtn = ".//a/button/span[text()='SIGN IN WITH OKTA']";
	String selfServiceOKTAUsernameTxt = ".//input[@id='okta-signin-username']";
	String selfServiceOKTAPasswordTxt = ".//input[@id='okta-signin-password']";
	String selfServiceOKTASigninBtn = ".//input[@id='okta-signin-submit']";
	
	String UserNameTextBox ="//*[@role='textbox' and @name='username']";
	String passwordTextBox ="//*[@role='textbox' and @name='password']";
	String LoginBtn ="//*[@role='button' and @class='x-btn x-unselectable x-box-item x-btn-aebtnPrimary-medium']";
	
    String UserOptionsBtn = "//*[@role='presentation' and @class='x-btn-wrap x-btn-wrap-aetextlink-medium x-btn-arrow x-btn-arrow-right']";
    String UserOptionsLogoutBtn = "//*[contains(text(),'Logout')]";
    
	
}
