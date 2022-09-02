package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario3 {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");
		String geckoExePath=currentWorkingDir+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckoExePath);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		String actualTitle=driver.getTitle();
		String expectedTitle="actitime";
		System.out.println("Actaul actitime page title is: "+actualTitle);
		System.out.println("Expected actitime page title is: "+expectedTitle);
		System.out.println("actitime title validation: "+actualTitle.contains(expectedTitle));
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://demo.actitime.com";
		System.out.println("Actaul actitime page URL is: "+actualUrl);
		System.out.println("Expected actitime page URL is: "+expectedUrl);
		System.out.println("actitime url validation: "+actualUrl.contains(expectedUrl));
		String pageSoucre=driver.getPageSource();
		System.out.println("Page source code content length: "+pageSoucre.length());
		driver.close();
		
	}

}
