package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement country=driver.findElement(By.xpath("//*[@class=\"form-control\" and @id=\"country\"]"));
	    Select SelectDropdown = new Select(country);
	    //SelectDropdown.selectByVisibleText("France"); //select by visible text
	     SelectDropdown.selectByValue("india");        //select by value
	   // SelectDropdown.selectByIndex(3);             //select by Index
	  List<WebElement> Options = SelectDropdown.getOptions();
	  System.out.println("No.of options is " + Options.size());
	  for(int i=0; i<Options.size();i++)
	  {
		  System.out.println(Options.get(i).getText());
	  }
	}

}
