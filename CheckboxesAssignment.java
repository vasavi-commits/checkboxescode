package Checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesAssignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframe_name_or_id");

        WebElement femaleRadio = driver.findElement(By.xpath("//input[@id='female']"));
        WebElement maleRadio = driver.findElement(By.xpath("//input[@id='male']"));

        femaleRadio.click();
		WebElement w= driver.findElement(By.xpath("//input[@class=\"form-check-input\"  and @id=\"male\"]"));
		w.click();
		boolean b= w.isSelected();
		System.out.println(b);
		WebElement w2= driver.findElement(By.xpath("//input[@class=\"form-check-input\"  and @id=\"female\"]"));
		boolean b2;
		if(w.isSelected()==false)
		{
		w2.click();
	    b2=w2.isSelected();
		System.out.println(b2);
		}
		else
		{
		 b2= w2.isSelected();
		 System.out.println(b2);
		}
						
	List<WebElement> Checkboxes=driver.findElements(By.xpath(" //tbody/tr[*]/td[4]/input[1]"));
	
	//for all check boxes-->for(int i=0; i< Checkboxes.size();i++)
	//for first two-->for(int i=0; i<2;i++)
	//for last two-->for(int i=3; i<Checkboxes.size();i++)
	for(int i=0; i<Checkboxes.size()-1;i++)
	{
		Checkboxes.get(i).click();
	}
		
	}

}
