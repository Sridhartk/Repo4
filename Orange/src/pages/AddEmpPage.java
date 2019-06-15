package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmpPage {
	@FindBy(xpath=".//b[text()='PIM']")
	private WebElement pim;
	
	@FindBy(xpath=".//a[text()='Add Employee']")
	private WebElement addemp;
	
	@FindBy(id="firstName")
	private WebElement FNtxt;
	
	@FindBy(id="lastName")
	private WebElement LNtxt;
	
	@FindBy(id="employeeId")
	private WebElement empid;
	
	@FindBy(id="chkLogin")
	private WebElement chkBOX;
	
	@FindBy(id="btnSave")
	private WebElement saveBTN;

	public AddEmpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setFN(String fn)
	{
		FNtxt.sendKeys(fn);
	}
	
	public void setLN(String ln)
	{
		LNtxt.sendKeys(ln);
	}
	
	public void setid(String id)
	{
		empid.sendKeys(id);
	}
	
	public void ClickchkBOX()
	{
	    chkBOX.click();
	}
	
	public void Clicksave()
	{
	    saveBTN.click();
	}
}
