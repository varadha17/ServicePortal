package com.Service.StepDefinition;

import java.io.IOException;

import com.Pages.LoginPage;
import com.Pages.UserUrlPage;
import com.Service.Base.base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class LoginPageTest extends base {
	
	public LoginPageTest() throws IOException {
		
		super();
		
	}
	
	public UserUrlPage url;
	public LoginPage login;
	
	@Before("@LoginPage")
	public void setUp() throws InterruptedException, IOException {
		
		startBrowser();
		
		url =  new UserUrlPage();
		login = url.ECILoginClick();
		
	}
	
	@Given("^get image text from captcha$")
	public void get_image_text_from_captcha() throws Throwable {
	   
		login.login();
	}
	
	@After("@LoginPage")
	public void tearDown() {
		
		driver.quit();
	}
	

}
