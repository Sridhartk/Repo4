package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
@FindBy(id="txtUsername")
private WebElement UN;

@FindBy(id="txtPassword")
private WebElement PWD;

@FindBy(id="btnLogin")
private WebElement LoginBTN;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setUN(String un)
{
	UN.sendKeys(un);
}

public void setPWD(String pw)
{
	PWD.sendKeys(pw);
}

public void Loginbtn()
{
	LoginBTN.click();
}

/*public void VerifyErrMsgDisplayed()
{
	boolean actual = errMsg.isDisplayed();
	Assert.assertEquals(actual, true);
	
	Assert.assertTrue(errMsg.isDisplayed());
}*/

}
