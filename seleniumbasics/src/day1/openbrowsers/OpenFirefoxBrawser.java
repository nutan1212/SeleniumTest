package day1.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrawser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\walke_mdgok38\\eclipse-workspace\\seleniumbasics\\executables\\geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();
		fdriver.get("https://www.google.com");
	}

}
