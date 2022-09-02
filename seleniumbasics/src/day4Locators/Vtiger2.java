package day4Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\walke_mdgok38\\eclipse-workspace\\seleniumbasics\\executables\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	WebElement username=driver.findElement(By.id("username"));
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(2000);
	username.clear();
	username.sendKeys("admin");
	
	WebElement pwd=driver.findElement(By.name("password"));

	pwd.clear();
	pwd.sendKeys("Test@123");
	
	
	WebElement submitBtn=driver.findElement(By.className("buttonBlue"));
	
	submitBtn.click();
	driver.findElement(By.cssSelector(".btn.btn-default.addButton.dropdown-toggle")).click();
	driver.findElement(By.cssSelector("[data-name=History]")).click();
	
	driver.findElement(By.cssSelector(".btn.btn-default.addButton.dropdown-toggle")).click();
	driver.findElement(By.cssSelector("[data-name=CalendarActivities]")).click();
	
	driver.findElement(By.cssSelector(".btn.btn-default.addButton.dropdown-toggle")).click();
	driver.findElement(By.cssSelector("[data-name=GroupedBySalesPerson]")).click();
	
	driver.findElement(By.cssSelector("div.footerIcons.pull-right>a.widget>i")).click();
	driver.findElement(By.className("confirm-box-ok")).click();
	
	driver.navigate().refresh();
	driver.navigate().refresh();
	
	driver.findElement(By.cssSelector("div.footerIcons.pull-right>a.widget>i")).click();
	driver.findElement(By.className("confirm-box-ok")).click();
	driver.navigate().refresh();
	
	driver.findElement(By.cssSelector("div.footerIcons.pull-right>a.widget>i")).click();
	driver.findElement(By.className("confirm-box-ok")).click();
	driver.navigate().refresh();
	
	driver.findElement(By.cssSelector("[title='Atlas Jeniffer(admin)']")).click();
    driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
   // driver.close();
    

}
}
