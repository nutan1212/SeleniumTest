package day1.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrawser {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\walke_mdgok38\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver edriver=new ChromeDriver();
	edriver.get("https://www.google.com");
}
}
