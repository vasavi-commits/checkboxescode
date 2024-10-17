package Checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownAssignment {

	 public static void main(String[] args) throws InterruptedException {

				WebDriver driver = new ChromeDriver();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				
			WebElement userName= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
			userName.sendKeys("Admin");
			WebElement password= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
			password.sendKeys("admin123");
			WebElement submit= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type=\'submit\']")));
	        submit.click();
	        WebElement pim=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href=\"/web/index.php/pim/viewPimModule\"]")));
	        pim.click();
	        
	        WebElement Estatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"oxd-select-text oxd-select-text--active\"])[1]")));
	        Estatus.click();
	        WebElement Freelance = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[ text()=\"Freelance\"]")));
	        Freelance.click();
	        Thread.sleep(10000);
	        
	        

	       WebElement JobTitle=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"oxd-select-text oxd-select-text--active\"])[3]")));
	        JobTitle.click();
	        WebElement AutomatonTester = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"Automaton Tester\"]")));
	        AutomatonTester.click();
	        List<WebElement> options= driver.findElements(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]"));
	       for(int i=0; i<options.size();i++)
	        {
	        	System.out.println(options.get(i).getText());
	        }
	      Thread.sleep(10000);
	       
	       WebElement Sub = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class=\"oxd-select-text-input\"])[4]")));
	       Sub.click();
	       Thread.sleep(10000);
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Quality Assurance']"))).click();
	       
	       
	}

}
