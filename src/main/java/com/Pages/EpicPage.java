package com.Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Service.Base.base;

public class EpicPage extends base{
	
	public EpicPage() throws IOException {
		
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	public static String getDataFromSheet;
	public static FileInputStream fis;
	public static Workbook wb;
	
	@FindBy(id="epicno")
	WebElement EpicNumber;
	
	@FindBy(id="btnGet")
	WebElement SearchButton;
	
	public void SearchEpic() throws InterruptedException, EncryptedDocumentException, IOException {
		for(int i=1;i<=3;i++) {
		EpicNumber.sendKeys(Excel_data(i,0));
		SearchButton.click();
		EpicNumber.clear();
		Thread.sleep(3000);
		}
	}
	
	public static String Excel_data(int r, int c) throws EncryptedDocumentException, IOException {
		
		fis = new FileInputStream("C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\ServicePortal\\src\\main\\java\\Excel_data\\Rest.xlsx");
		
		wb = WorkbookFactory.create(fis);
		
		getDataFromSheet = wb.getSheet("Assure").getRow(r).getCell(c).getStringCellValue();
		
		return getDataFromSheet;

	}

}
