package androidtestpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalculatorPage extends BasePage {
	
		
	public CalculatorPage(AppiumDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}	
	
	@AndroidFindBy(className = "android.widget.Button") private List<MobileElement>  mobilenumbers;
	@AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/calc_edt_formula") private MobileElement  result;
	
	public String validateAddTwoNumbers() {
		        
        mobilenumbers.get(13).click();
        mobilenumbers.get(15).click();
        mobilenumbers.get(12).click();
        mobilenumbers.get(19).click();
      	return result.getText();
	}
	
		
	

}
