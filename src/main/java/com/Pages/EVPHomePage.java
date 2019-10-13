package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Service.Base.base;

public class EVPHomePage extends base {
	
	public EVPHomePage() throws IOException{
		
		super();
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//h3[text()='Verify Details']")
	WebElement VerifyDetails;
	
	public EpicPage verifyDetailsCheck() throws InterruptedException, IOException {
		
		VerifyDetails.click();
		Thread.sleep(4000);
		
		return new EpicPage();
	}
	
}
