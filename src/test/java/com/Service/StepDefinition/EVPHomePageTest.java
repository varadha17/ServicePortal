package com.Service.StepDefinition;

import java.io.IOException;

import com.Pages.EVPHomePage;
import com.Pages.LoginPage;
import com.Pages.UserUrlPage;
import com.Service.Base.base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class EVPHomePageTest extends base{
	
	public EVPHomePageTest() throws IOException{
		
		super();
		
	}
	
	public UserUrlPage url;
	public LoginPage login;
	public EVPHomePage evp;
	
	@Before("@evp")
	public void setUp() throws InterruptedException, IOException {
		
		startBrowser();
		
		url = new UserUrlPage();
		
		login = url.ECILoginClick();
		
		evp = login.login();
		
	}
	
	@Given("^Click on Verify Details$")
	public void Click_on_Verify_Details() throws Throwable {
	   
		evp.verifyDetailsCheck();
		
		
	}
	
	
	@After("@evp")
	public void tearDown() {
		
		driver.quit();
	}

}
