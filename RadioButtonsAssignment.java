package Checkboxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@type=\"text\" and @id=\"login1\"]")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@type=\"password\" and @id=\"password\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type=\"submit\" and @name=\"proceed\"]")).click();
      //  Thread.sleep(10000);
        //driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Submit\"]")).click();
	   Alert a = driver.switchTo().alert();
	   a.accept();
	}
	

}
