package Checkboxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticatedPopup {

	public static void main(String[] args) {

		//ChromeOptions options= new ChromeOptions();
		//options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver();
		//driver = WebDriver.Chrome(options=options)
		//driver.get("https://google.com");
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		//driver.findElement(By.id("trigger_prompt")).click();
		Alert alert = driver.switchTo().alert();
		alert = driver.switchTo().alert();
			alert.sendKeys("Some text");
				alert.accept();
		
	}

}
