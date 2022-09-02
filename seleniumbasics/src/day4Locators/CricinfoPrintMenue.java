package day4Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinfoPrintMenue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\walke_mdgok38\\eclipse-workspace\\seleniumbasics\\executables\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.espncricinfo.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);
        List<WebElement> printmenu=driver.findElements(By.cssSelector("div>div>div>a.ci-nav-item"));
        System.out.println("print menu is:"+printmenu.size());
        for (int i=0;i<printmenu.size();i++) {
        	System.out.println(printmenu.get(i).getText());
        }
	}
}
