package Script;

import java.awt.AWTException;

import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.XL;
import pages.AddEmpPage;
import pages.LoginPage;


public class AddEmpTest extends BaseTest{
	@Test
	public void Addemptest() throws InterruptedException, AWTException {
	String un=XL.getData(XL_PATH,"Login",1,0);
	String pw=XL.getData(XL_PATH,"Login",1,1);
	String fn=XL.getData(XL_PATH, "AddEmp", 1, 0);
	String ln=XL.getData(XL_PATH, "AddEmp", 1, 1);
	String id=XL.getData(XL_PATH, "AddEmp", 1, 2);
	String UN=XL.getData(XL_PATH, "AddEmp", 1, 3);
	String PW=XL.getData(XL_PATH, "AddEmp", 1, 4);
	String cpw=XL.getData(XL_PATH, "AddEmp", 1, 5);
	
	LoginPage lp;
	AddEmpPage AEP;
	lp=new LoginPage(driver);
	AEP=new AddEmpPage(driver);
	
	//enter the username
	lp.setUN(un);
	//enter the pwassword
	lp.setPWD(pw);
	Thread.sleep(2000);
	//click on login
	lp.Loginbtn();
	Thread.sleep(2000);
	
	AEP.clickPIM();
	Thread.sleep(4000);
	AEP.clickaddemp();
	Thread.sleep(4000);
	//Enter the Firstname
	AEP.setFN(fn);
	Thread.sleep(2000);
	
	//Enter the LastName
	AEP.setLN(ln);
	Thread.sleep(2000);
	//Enter the Empid
	AEP.setid(id);
	Thread.sleep(2000);
	
	//Click on checkbox
	AEP.ClickchkBOX();
	Thread.sleep(2000);
	
	AEP.setUn(UN);
	Thread.sleep(2000);
	
	AEP.setpw(PW);
	Thread.sleep(2000);
	
	AEP.setcpw(cpw);
	Thread.sleep(2000);
	//click on save button
	AEP.Clicksave();
	
	

	}
}
