package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesExample {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id="monday"]")).click();
		//WebElement monday = driver.findElement(By.xpath("//input[@id=\"monday\"]"));
		//monday.click();
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\"  and @type=\"checkbox\"]"));
		//checkboxes.click();
		for(int i=0; i< 3;i++)
		{
			checkboxes.get(i).click();
		}
	}

}
