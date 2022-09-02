package day3.WebManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EtrainAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://etrain.info/in");
		driver.findElement(By.cssSelector("#tbsfi1")).sendKeys("PUNE JN");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div#et_autocomplete>div>a>b")).click();
		
		driver.findElement(By.cssSelector("input[name='station2']")).sendKeys("Mumbai CST");
		Thread.sleep(1000);
	    driver.findElement(By.cssSelector("div.ui-autocomplete>div>a>b")).click();
	    
		driver.findElement(By.cssSelector("#tbsfi4")).click();
		driver.findElement(By.cssSelector("input.nav")).click();
		driver.findElement(By.cssSelector("table.noinnerborder>tbody>tr:nth-of-type(4)>td:nth-of-type(4)>input")).click();
		driver.findElement(By.cssSelector("div.mrgd>span>select>option:nth-of-type(2)")).click();
		driver.findElement(By.id("tbssbmtbtn")).click();
		List<WebElement> printtrainno=driver.findElements(By.cssSelector("table.nolrborder td.wd55>a.sf"));
		for(int i=0;i<printtrainno.size();i++) {
		System.out.println("Train numbers are as follows"+printtrainno.get(i).getText());	
		
		}

	}

}
