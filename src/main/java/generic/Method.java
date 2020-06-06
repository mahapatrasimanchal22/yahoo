package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Method {

	
	public void selectvisibletext(WebElement element, String text ){
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}	
	public void selectvisibleindex(WebElement element,int index){
		Select sel=new Select(element);
		sel.selectByIndex(index);
	
	}
		
	public void selectvisiblevalue(WebElement element, String value){
		Select sel=new Select(element);
		sel.selectByValue(value);
	
	}
		
		
	
}
