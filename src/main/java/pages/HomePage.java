package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//span[text()='Testing']")
	WebElement testing;
	
	
	public HomePage() throws IOException, IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnTesting() {
		System.out.println(driver.getTitle());
		
		testing.click();
	}

}
