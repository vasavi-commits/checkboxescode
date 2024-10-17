package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//button[@class=\"multiselect dropdown-toggle btn btn-default\"]"));
		element.click();
		//driver.findElement(By.xpath("//input[@type=\"checkbox\" and @value=\"jQuery\" ]")).click();
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
		System.out.println(options.size());
		for(WebElement obj: options)
		{
			String op = obj.getText();
			if(op.equals("Java") || op.equals("MySQL") || op.equals("Python"))
			{
				obj.click();
			}
		}
	}

}
