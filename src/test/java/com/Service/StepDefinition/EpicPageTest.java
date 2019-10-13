package com.Service.StepDefinition;

import java.io.IOException;

import com.Pages.EVPHomePage;
import com.Pages.EpicPage;
import com.Pages.LoginPage;
import com.Pages.UserUrlPage;
import com.Service.Base.base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class EpicPageTest extends base {
	
	public EpicPageTest() throws IOException{
		
		super();
		
	}
	
	public UserUrlPage url;
	public LoginPage login;
	public EVPHomePage evp;
	public EpicPage epic;
	
	@Before("@epic")
	public void setUp() throws InterruptedException, IOException {
		
		startBrowser();
		
		url = new UserUrlPage();
		
		login = url.ECILoginClick();
		
		evp = login.login();
		
		epic = evp.verifyDetailsCheck();
		
	}
	
	@Given("^Validate different datas$")
	public void Validate_different_datas() throws Throwable {
	   
		epic.SearchEpic();
		
	}
	
	@After("@epic")
	public void tearDown() {
		
		driver.quit();
	}

}
