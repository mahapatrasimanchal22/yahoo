package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Autocon;
import generic.Method;
import generic.excelwork;

public class create extends Method implements Autocon  {

	@FindBy(id="usernamereg-firstName")
	public WebElement firstname;
	
	@FindBy(id="usernamereg-lastName")
	public WebElement surname;
	
	@FindBy(id="usernamereg-yid")
	public WebElement email;
	
	@FindBy(id="usernamereg-password")
	public WebElement pass;
	
	@FindBy(id="usernamereg-phone")
	public WebElement phone;
	
	@FindBy(xpath="//select[@type='select']")
	public WebElement country;
	
	@FindBy(id="usernamereg-month")
	public WebElement month;
	
	@FindBy(id="usernamereg-day")
	public WebElement day;
	
	@FindBy(id="usernamereg-year")
	public WebElement year;
	
	@FindBy(id="usernamereg-freeformGender")
	public WebElement gender;
	
	public create(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void  submit() throws IOException, InterruptedException{
		
		firstname.sendKeys(excelwork.main(excel_path, sheet, 1, 0));
		Thread.sleep(3000);
		surname.sendKeys(excelwork.main(excel_path, sheet, 1, 1));
		email.sendKeys(excelwork.main(excel_path, sheet, 1, 2));
		Thread.sleep(3000);
		pass.sendKeys(excelwork.main(excel_path, sheet, 1, 3));
		Thread.sleep(3000);
		selectvisiblevalue(country, "IN");
		phone.sendKeys(excelwork.main(excel_path, sheet, 1, 4));
		Thread.sleep(3000);
		selectvisibletext(month, "January");
		day.sendKeys(excelwork.main(excel_path, sheet, 1, 6));
		year.sendKeys(excelwork.main(excel_path, sheet, 1, 7));
		Thread.sleep(3000);
		gender.sendKeys(excelwork.main(excel_path, sheet, 1, 8));	
	}
}
