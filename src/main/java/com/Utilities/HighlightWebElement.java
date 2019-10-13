package com.Utilities;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Service.Base.base;

public class HighlightWebElement extends base {

	public HighlightWebElement() throws IOException {
		super();
	
	}
	
		public static void changeColor(String color, WebElement element, WebDriver driver) {
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

	        try {
	            Thread.sleep(20);
	        }  catch (InterruptedException e) {
	        }
	     }
	    
	    public static void drawBorder(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].style.border='3px solid red'", element);
	    }
	
	

}
