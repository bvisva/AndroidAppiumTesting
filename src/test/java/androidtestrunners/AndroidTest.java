package androidtestrunners;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import androidtestpages.CalculatorPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AndroidTest {
	
	AppiumDriver<MobileElement> driver;
	CalculatorPage calcPage = null;
	
		
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","SM-A507FN");
        capabilities.setCapability("udid", "RZ8M92JZ6PB");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
        URL appiumUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(appiumUrl,capabilities);
        calcPage = new CalculatorPage(driver);
	}  
    
	
	@Test
	public void runCalculatorAndroid() {
		String output = calcPage.validateAddTwoNumbers();
		System.out.println(output);
	}

}
