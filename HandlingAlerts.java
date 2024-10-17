package Checkboxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		Alert myAlert=driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();*/
		
		//Confirmation Alert
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		Alert SecondAlert=driver.switchTo().alert();
		System.out.println(SecondAlert.getText());
		SecondAlert.dismiss();*/
		
		//Prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert obj= driver.switchTo().alert();
		Thread.sleep(5000);
		//obj.sendKeys("java");
		Thread.sleep(5000);
		obj.accept();
        
	}

}
