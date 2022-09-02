package day4Locators;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyOHRM {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file=new FileInputStream("C:\\Users\\walke_mdgok38\\eclipse-workspace\\selenium\\property\\Propertyactime.properties");
		Properties prop=new Properties();
		prop.load(file);
		String driverkey=prop.getProperty("driverkey");
		String applicationUrl=prop.getProperty("applicationUrl");
		String username=prop.getProperty("username");
		String pasword=prop.getProperty("pasword");
		String executablepath=prop.getProperty("executablepath");
		String buttonName=prop.getProperty("buttonName");
		System.out.println(driverkey+"\n"+executablepath+"\n"+username+"\n"+pasword+"\n"+applicationUrl);
		
		System.setProperty(driverkey,executablepath);
		WebDriver edriver=new ChromeDriver();
		//edriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Thread.sleep(2000);
		edriver.get(applicationUrl);
		String actualUrl=edriver.getCurrentUrl();
		System.out.println("actualUrl is:"+actualUrl);
		String expectedUrl=applicationUrl;
		System.out.println("expectedUrl is:"+expectedUrl);
		System.out.println("actitime Url Validation:"+actualUrl.contains(expectedUrl));
		edriver.findElement(By.id("username")).sendKeys(username);
		
		edriver.findElement(By.name("pwd")).sendKeys(pasword);
	
		edriver.findElement(By.cssSelector("#loginButton")).click();
		
	
		//edriver.close();
		
		
		
		
		
		
		

	}

}
