package day4Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericwayToopenChrome {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\walke_mdgok38\\eclipse-workspace\\seleniumbasics\\executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");

String actualTitle=driver.getTitle();
String expectedTitle="Google";
System.out.println("Actual Google page Title is:"+actualTitle);
System.out.println("expected Title is:"+expectedTitle);
System.out.println("Google page validation:"+actualTitle.equals(expectedTitle));

String actualUrl=driver.getCurrentUrl();
String expectedUrl="https://www.google.com";
System.out.println("Actual Url is:"+actualUrl);
System.out.println("Expected Google page is:"+expectedUrl);
System.out.println("Google Url validation:"+actualUrl.equals(expectedUrl));

String pageSource=driver.getPageSource();
System.out.println("Page source content length:"+pageSource.length());
driver.close();



	}

}
