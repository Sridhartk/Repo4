package Script;

import generics.BaseTest;
import generics.XL;
import pages.AddEmpPage;
import pages.LoginPage;

public class AddEmpTest extends BaseTest{
	
	String un=XL.getData(XL_PATH,"Login",1,0);
	String pw=XL.getData(XL_PATH,"Login",1,1);
	String fn=XL.getData(XL_PATH, "AddEmp", 1, 0);
	String ln=XL.getData(XL_PATH, "AddEmp", 1, 1);
	String id=XL.getData(XL_PATH, "AddEmp", 1, 2);
	
	LoginPage lp=new LoginPage(driver);


	
	AddEmpPage AEP=new AddEmpPage(driver);
	
}
