package com.Service.StepDefinition;

import java.io.IOException;

import com.Pages.UserUrlPage;
import com.Service.Base.base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class UserUrlPageTest extends base{
	
	public UserUrlPageTest() throws IOException{
		
		super();
	}
	
	public UserUrlPage url;
	
	@Before("@url")
	public void setUp() throws IOException {
		
		startBrowser();
		
		url = new UserUrlPage();
		
	}
	
	@Given("^Click Login Link and user should be landed into login page$")
	public void Click_Login_Link_and_user_should_be_landed_into_login_page() throws Throwable {
	   
		url.ECILoginClick();
		
	}
	
	@After("@url")
	public void tearDown() {
		
		driver.quit();
	}

}
