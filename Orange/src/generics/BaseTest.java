package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst{
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApp()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(APP_URL);
	}
	
	@AfterMethod
	public void CloseApp(ITestResult iTestResult)
	{
		int status=iTestResult.getStatus();
		String name=iTestResult.getName();
		if(status==1) {
			Reporter.log("Test "+name+" is PASS",true);
		}
		else {
		driver.close();
		}
	}
}
