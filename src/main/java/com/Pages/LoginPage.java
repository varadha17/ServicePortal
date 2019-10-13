package com.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Service.Base.base;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class LoginPage extends base{

	public LoginPage() throws IOException {
		
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="imgCaptcha")
	WebElement ImageCaptcha;
	
	@FindBy(name="UserName")
	WebElement Username;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement button;
	
	@FindBy(className="fa fa-2x fa-refresh")
	WebElement refresh;
	
	public void captachaImage() throws Exception {
	
		File fl = ImageCaptcha.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(fl, new File("C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\ServicePortal\\src\\main\\java\\Screenshots\\Image.png"));
		
		ITesseract img = new Tesseract();
		
		Thread.sleep(10000);
		try {
		String image = img.doOCR(new File("C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\ServicePortal\\src\\main\\java\\Screenshots\\Image.png"));
		System.out.println(image);
		}catch(Exception e) {
			throw new Exception("Error");
		}
	}
	
	public EVPHomePage login() throws InterruptedException, IOException {
		
		Username.sendKeys("oprs22a02n1");
		password.sendKeys("Pniopr@321");
		Thread.sleep(15000);
		button.click();
		Thread.sleep(4000);
		
		return new EVPHomePage();
	}
}
