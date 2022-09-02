package day4Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\walke_mdgok38\\eclipse-workspace\\seleniumbasics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php/");
		WebElement username=driver.findElement(By.id("username"));
		
		username.clear();
		username.sendKeys("admin");
		
		WebElement pwd=driver.findElement(By.name("password"));
	
		pwd.clear();
		pwd.sendKeys("Test@123");
		
		
		WebElement submitBtn=driver.findElement(By.className("buttonBlue"));
		
		submitBtn.click();
	}

}
	


