package day4Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ERail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\walke_mdgok38\\eclipse-workspace\\seleniumbasics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().length());
		driver.close();
	}

}
