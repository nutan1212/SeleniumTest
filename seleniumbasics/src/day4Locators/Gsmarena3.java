package day4Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\walke_mdgok38\\eclipse-workspace\\seleniumbasics\\executables\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.gsmarena.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);
        List<WebElement> phonecount=driver.findElements(By.cssSelector("ul>li>a"));
        System.out.println("Samsung Phone Count is:"+phonecount.size());
        for (int i=0;i<phonecount.size();i++) {
        	System.out.println(phonecount.get(i).getText());
        }
	}

}
