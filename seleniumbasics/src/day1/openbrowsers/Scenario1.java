package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
public static void main(String[] args) {
	String currentWorkingDir=System.getProperty("user.dir");
	String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromeExePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	String actualTitle=driver.getTitle();
	String expectedTitle="Google";
	System.out.println("Actaul Google page title is: "+actualTitle);
	System.out.println("Expected Google page title is: "+expectedTitle);
	System.out.println("Google title validation: "+actualTitle.equals(expectedTitle));
	String actualUrl=driver.getCurrentUrl();
	String expectedUrl="https://www.google.com";
	System.out.println("Actaul Google page URL is: "+actualUrl);
	System.out.println("Expected Google page URL is: "+expectedUrl);
	System.out.println("Google url validation: "+actualUrl.contains(expectedUrl));
	String pageSoucre=driver.getPageSource();
	System.out.println("Page source code content length: "+pageSoucre.length());
	driver.close();
}

}
