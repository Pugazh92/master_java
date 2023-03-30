package ObjectRepository;

public interface VisitObjects {
	String VisitCreateBtn = "//a[@aria-label='Create' and @aria-hidden='false']";
	String VisitLocationDrp = "//input[contains(@placeholder,'Location') and @aria-hidden='false']";
//	 String VisitLocDrp = "//div[@id='baseComboBoxRemote-3110-trigger-picker']";
	String VisitSearchVisitor = "//input[contains(@placeholder, 'Recent Visitor')]";
	String SetVisitDetailsBtn = "//a[contains(@aria-label, 'Set Visit Details') and @role='button']";
	String DisclCheckBox = "//input[@type='checkbox' and @aria-label='Disclaimer Check *']";
	String VisitSaveBtn = "//span[text()='Submit']";
}
