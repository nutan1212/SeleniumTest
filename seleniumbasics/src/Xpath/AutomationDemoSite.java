package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoSite {
	public static void main(String args[]) throws InterruptedException {
	String chromeExPath=System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
	//step1: set driver executable path by using System.setProperty(String key,String value)
	System.setProperty("webdriver.chrome.driver", chromeExPath);
	//step2: create an instance of Chrome Browser
	WebDriver driver = new ChromeDriver();
	//maximize browser
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.automationtesting.in/Register.html");
	WebElement FirstName=driver.findElement(By.cssSelector("[placeholder='First Name']"));
	FirstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
	FirstName.sendKeys(Keys.chord(Keys.CONTROL,"C"));
	
	WebElement LastName=driver.findElement(By.cssSelector("[placeholder='Last Name']"));
	LastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	
	WebElement Address=driver.findElement(By.xpath("//div/div/textarea"));
	Address.sendKeys("A/p Karde Tal-Shirur Dist-Pune");
	
	
	
	WebElement Email=driver.findElement(By.xpath("//div/div/input[@type='email']"));
	Email.sendKeys("nutanborhade8@gmail.com");
	
	WebElement Tel=driver.findElement(By.xpath("//div/div/input[@type='tel']"));
	Tel.sendKeys("9370971058");
	
	driver.findElement(By.xpath("//div/div/label/input[@value='FeMale']")).click();
	
	driver.findElement(By.xpath("//div/form/div[6]/div/div[2]/input")).click();

	WebElement Pagedown=driver.findElement(By.xpath("//body"));
	for(int i=0; i<2; i++) {
		Pagedown.sendKeys(Keys.PAGE_DOWN);
	}
	driver.findElement(By.xpath("//div/form/div[7]/div/multi-select/div[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div/form //ul/li[8]")).click();
    Tel.click();
    
	}

}
