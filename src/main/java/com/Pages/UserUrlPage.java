package com.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Service.Base.base;

public class UserUrlPage extends base {

	
	public UserUrlPage() throws IOException{
		
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Click for ECI login')]")
	WebElement Login;
	
	public LoginPage ECILoginClick() throws InterruptedException, IOException {
		Thread.sleep(4000);
		Login.click();
		Thread.sleep(4000);
		return new LoginPage();
	}
	
	
	
}
