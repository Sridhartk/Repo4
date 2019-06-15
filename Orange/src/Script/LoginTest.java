package Script;

import org.testng.annotations.Test;


import pages.LoginPage;
import generics.BaseTest;
import generics.XL;

public class LoginTest extends BaseTest {

		@Test(priority=1)
		public void testValidLogin() throws InterruptedException
		{
			String un=XL.getData(XL_PATH,"Login",1,0);
			String pw=XL.getData(XL_PATH,"Login",1,1);
		//	String title=XL.getData(XL_PATH,"Login",1,2);
			//Enter valid user name
			LoginPage lp=new LoginPage(driver);
			Thread.sleep(4000);
			lp.setUN(un);
			//Enter valid password
			Thread.sleep(4000);
			lp.setPWD(pw);
			//click login button
			lp.Loginbtn();
	
		}

}
