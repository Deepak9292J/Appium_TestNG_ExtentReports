package testcases2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testCases.testbase;

public class DataProviderTest extends testbase  {
	
	@AfterMethod(alwaysRun=true)
	public void finishTest()
	{
	    driver.resetApp();
	}
	
	@Test(dataProvider = "dataproviderfunction")
	public void preferences_normalclick(String Text)
	{
	
	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	driver.findElementById("android:id/checkbox").click();
	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	driver.findElementByClassName("android.widget.EditText").sendKeys(Text);
	driver.findElementById("android:id/button1").click();
	}
	
	@DataProvider
	public Object[][] dataproviderfunction()
	{
		Object[][] data = new Object[3][1];
		
		data[0][0] = "Deepak Jindal";
		data[1][0] = "Happily Testing";
		data[2][0] = "It's a good day";
		return data;
	
		
	}

}
