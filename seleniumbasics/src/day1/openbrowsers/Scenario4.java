package day1.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario4 {

	public static void main(String[] args) {
		
			String currentWorkingDir=System.getProperty("user.dir");
			String geckoExePath=currentWorkingDir+"\\Executables\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", geckoExePath);
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			String actualTitle=driver.getTitle();
			String expectedTitle="Facebook";
			System.out.println("Actaul Facebook page title is: "+actualTitle);
			System.out.println("Expected Facebook page title is: "+expectedTitle);
			System.out.println("Facebook title validation: "+actualTitle.contains(expectedTitle));
			String actualUrl=driver.getCurrentUrl();
			String expectedUrl="https://www.facebook.com";
			System.out.println("Actaul Facebook page URL is: "+actualUrl);
			System.out.println("Expected Facebook page URL is: "+expectedUrl);
			System.out.println("Facebook url validation: "+actualUrl.contains(expectedUrl));
			String pageSoucre=driver.getPageSource();
			System.out.println("Page source code content length: "+pageSoucre.length());
			driver.close();
			
	}

}
