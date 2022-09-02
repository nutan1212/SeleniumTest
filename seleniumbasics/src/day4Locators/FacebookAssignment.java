package day4Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\walke_mdgok38\\eclipse-workspace\\seleniumbasics\\executables\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div._6ltg>a")).click();
        
        driver.findElement(By.cssSelector("#day")).click();
        List<WebElement> day=driver.findElements(By.cssSelector("#day>option"));
      
        System.out.println("print day is:"+day.size());
         for (int i=0;i<day.size();i++) {
         System.out.println(day.get(i).getText());
         }
        driver.findElement(By.cssSelector("#month")).click();
        List<WebElement> month=driver.findElements(By.cssSelector("#month>option"));
        System.out.println("print month is:"+month.size());
         for (int i=0;i<month.size();i++) {
         System.out.println(month.get(i).getText());
         }
         
        driver.findElement(By.cssSelector("#year")).click();
        List<WebElement> year=driver.findElements(By.cssSelector("#year>option"));
        System.out.println("print year is:"+year.size());
         for (int i=0;i<year.size();i++) {
         System.out.println(year.get(i).getText());
         }
       
        }

	}


