package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAutomationDropdowns {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement color=driver.findElement(By.xpath("//*[@class=\"form-control\" and @id=\"colors\"]"));
	    Select SelectDropdown = new Select(color);
	    SelectDropdown.selectByIndex(2);
	    List<WebElement> Options = SelectDropdown.getOptions();
		  System.out.println("No.of options is " + Options.size());
		  for(int i=0; i<Options.size();i++)
		  {
			  System.out.println(Options.get(i).getText());
		  }

	}

}
